/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// REGISTERING EVENTS (and loading pets @ first)
$(document).ready(function () {
    loadItems();


    $("#add-money-button").click(function (event) {
        event.preventDefault();
        addMoney();
    });

    $("#return-change-button").click(function (event) {
        event.preventDefault();
        returnChange();
    });

    $("#add-button").click(function (event) {
        event.preventDefault();
        addItem(); // Then do OUR thing.
    });


    // Find the pet edit modal, and register a "on show" event listener function
    $("#item-edit-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget);
        var itemId = element.data('item-id');
        itemEditDetails(itemId);
    });

    $("#edit-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        editItem(); // Then do OUR thing.
    });


    // Find the pet edit modal, and register a "on show" event listener function
    $("#item-restock-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var itemId = element.data('item-id'); // found the a tag, now get the data-pet-id value
        restockOptions(itemId);
    });

    $("#restock-button").click(function (event) {
        event.preventDefault();
        restockItem();
    });

    $("#delete-confirmation-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget);
        var itemId = element.data('item-id');
        deleteOptions(itemId);
    });

    $("#delete-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        deleteItem(); // Then do OUR thing.
    });

});

// ==========
// FUNCTIONS!
// ==========

function clearItemTable() {
    $('#itemRows').empty();
}
function clearMgmtTable() {
    $('#mgmtRows').empty();
}

function addMoney() {
    var amtEntered = parseFloat($('#moneyInput').val());
    var currentMoney = parseFloat($('#currentTotal').text());

    if (!currentMoney)
        $("#currentTotal").text(amtEntered);
    else
        $("#currentTotal").text(amtEntered + currentMoney);
    $("#moneyInput").val("0.00");
    $("#changeReturn").text("0.00");
}


function returnChange() {
    var currentMoney = parseFloat($('#currentTotal').text()).toFixed(2);
    if (!currentMoney)
        $('#changeReturn').val("0.00");
    else
        $('#changeReturn').text(currentMoney);
    $('#moneyInput').val("0.00");
    $('#currentTotal').text("0.00");

}

function processItemList(items) {
    clearItemTable();

    // jQuery forEach starts with $.each
    var itemRows = $('#itemRows');

    $.each(items, function (index, item) {

        var nameField = $("<td>");
        var priceField = $("<td>");
        var qtyField = $("<td>");
        var vendField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        nameField.append(item.itemName);

        priceField.append(item.itemPrice.toFixed(2));

        qtyField.append(item.itemQty);

        var vendLink = $("<a>");
        vendLink.attr({
            'onclick': 'vendItem(' + item.itemID + ')'
        });
        vendLink.text("Buy");
        vendField.append(vendLink);


        var itemRow = $("<tr>");
        itemRow.append(nameField);
        itemRow.append(priceField);
        itemRow.append(qtyField);
        itemRow.append(vendField);


        itemRows.append(itemRow);
    });

}


function vendItem(itemId) {
    $.ajax({
        url: 'item/' + itemId,
        type: 'GET'
    }).success(function (item) {

        var currentMoney = parseFloat($('#currentTotal').text());
        if (!currentMoney || currentMoney == 0)
            alert("You have to enter in money before you can make a purchase.")
        else if (currentMoney < item.itemPrice)
            alert("You have not entered enough money to purchase that item.");
        else {
            $.ajax({
                url: 'vend/' + itemId,
                type: 'PUT'
            }).success(function () {
                $('#currentTotal').text((currentMoney - item.itemPrice).toFixed(2));
                loadItems();
            });
        }
    });
}

function processMgmtList(items) {
    clearMgmtTable();

    // jQuery forEach starts with $.each
    var mgmtRows = $('#mgmtRows');

    $.each(items, function (index, item) {

        var nameField = $("<td>");
        var priceField = $("<td>");
        var qtyField = $("<td>");
        var restockField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        nameField.append(item.itemName);

        priceField.append(item.itemPrice.toFixed(2));

        qtyField.append(item.itemQty);

        var restockLink = $("<a>");
        restockLink.attr({'data-toggle': 'modal',
            'data-target': '#item-restock-modal',
            'data-item-id': item.itemID});
        restockLink.text("Restock");
        restockField.append(restockLink);

        var editLink = $("<a>");
        editLink.attr({'data-toggle': 'modal',
            'data-target': '#item-edit-modal',
            'data-item-id': item.itemID});
        editLink.text("Edit");
        editField.append(editLink);

        var deleteLink = $("<a>");
        deleteLink.attr({'data-toggle': 'modal',
            'data-target': '#delete-confirmation-modal',
            'data-item-id': item.itemID});
        deleteLink.text("Delete");
        deleteField.append(deleteLink);


        var mgmtRow = $("<tr>");
        mgmtRow.append(nameField);
        mgmtRow.append(priceField);
        mgmtRow.append(qtyField);
        mgmtRow.append(restockField);
        mgmtRow.append(editField);
        mgmtRow.append(deleteField);


        mgmtRows.append(mgmtRow);
    });

}

function loadItems() {

    $.ajax({
        url: 'items',
        type: 'GET'
    }).success(function (data) {
        processItemList(data);
        processMgmtList(data);
    });

}

function addItem() {
    var itemName = $("#item-add-name").val();
    var itemPrice = $("#item-add-price").val();
    var itemQty = $("#item-add-qty").val();


    $.ajax({
        url: 'item',
        type: 'POST',
        headers: {
            'Accept': 'application/json', //Whatcha want back
            'Content-Type': 'application/json' // Whatcha sending
        },
        'dataType': 'json', // Whatcha sending, data type

        data: JSON.stringify({
            // These key/value pairs need to match the propertyName/Values
            // of your Java DTO if that is what you are sending.
            // this is because Spring/Jaxson will try and use 
            // use getters and setters etc to try to translate JSON -> Java
            // If they don't match expected, there can be EXPLOSIONS
            itemName: itemName,
            itemPrice: itemPrice,
            itemQty: itemQty,
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        $("#validationErrors").hide();
        loadItems();
        $("#item-add-name").val('');
        $("#item-add-price").val('');
        $("#item-add-qty").val('');
    }
    ).error(function (data, status) {
        // Find the error div in the DOM
        var errorDiv = $("#validationErrors");
        errorDiv.empty();
        errorDiv.show();
        // the data, should be our field errors
        // which have a message, and a field error
        $.each(data.responseJSON.fieldErrors, function (index, validationError) {
            errorDiv.append(validationError.message);
            errorDiv.append("<br>");
        });

    });
}

function deleteOptions(id) {
    $.ajax({
        type: 'GET',
        url: 'item/' + id,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (item) {
        $("#delete-item-itemId").text(item.itemID);
        $("#delete-item-itemName").text(item.itemName);
    });

}

function deleteItem() {
      var itemId = $("#delete-item-itemId").text();
    $.ajax({
        url: 'item/' + itemId,
        type: 'DELETE'
    }).success(function (data) {
        processItemList(data);
        processMgmtList(data);
    });
}
function restockOptions(itemId) {
    $.ajax({
        type: 'GET',
        url: 'item/' + itemId,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (item) {
        $("#item-restock-itemId").text(item.itemID);
        $("#item-restock-itemName").text(item.itemName);
        $("#item-restock-itemPrice").text(item.itemPrice);
        $("#item-restock-itemQty").text(item.itemQty);
    });

}

function restockItem() {
    var itemId = $("#item-restock-itemId").text();
    var itemName = $("#item-restock-itemName").text();
    var itemPrice = $("#item-restock-itemPrice").text();
    var itemQty = parseInt($("#item-restock-itemQty").text());
    var addedQty = parseInt($("#item-restockQty").val());
    var updatedQty = itemQty + addedQty;

    $.ajax({
        url: 'item/' + itemId,
        type: 'PUT',
        headers: {
            'Content-Type': 'application/json' // Whatcha sending
        },
        'dataType': 'json', // Whatcha sending, data type

        data: JSON.stringify({
            itemName: itemName,
            itemPrice: itemPrice,
            itemQty: updatedQty
        })
    }).success(function (data) {
        loadItems();

    });

}
function itemEditDetails(itemId) {
    $.ajax({
        type: 'GET',
        url: 'item/' + itemId,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (item) {
        // h2 tags use TEXT
        $("#item-edit-itemId").text(item.itemID);
        $("#item-edit-itemName").val(item.itemName);
        $("#item-edit-itemPrice").val(item.itemPrice);
        $("#item-edit-itemQty").val(item.itemQty);
    });
}

function editItem() {

    var itemId = $("#item-edit-itemId").text();
    var itemName = $("#item-edit-itemName").val();
    var itemPrice = $("#item-edit-itemPrice").val();
    var itemQty = $("#item-edit-itemQty").val();


    $.ajax({
        url: 'item/' + itemId,
        type: 'PUT',
        headers: {
            'Content-Type': 'application/json' // Whatcha sending
        },
        'dataType': 'json', // Whatcha sending, data type

        data: JSON.stringify({
            itemName: itemName,
            itemPrice: itemPrice,
            itemQty: itemQty
        })
    }).success(function (data) {
        loadItems();

    });
}

