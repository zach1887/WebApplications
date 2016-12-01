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
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var itemId = element.data('item-id'); // found the a tag, now get the data-pet-id value
        itemEditDetails(itemId);
    });

    $("#edit-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        editItem(); // Then do OUR thing.
    });


    $("#restock-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        restockItem(); // Then do OUR thing.
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
    var currentMoney = parseFloat($('#currentTotal').val());

    if (!currentMoney)
        $("#currentTotal").val(amtEntered);
    else
        $("#currentTotal").val(currentMoney + amtEntered);
    $("#moneyInput").val("0.00");
    $("#changeReturn").val("0.00");
}


function returnChange() {
    var currentMoney = parseFloat($('#currentTotal').val());
    if (!currentMoney)
        $('#changeReturn').val("0.00");
    else
        $('#changeReturn').val(currentMoney);
    $('#moneyInput').val("0.00");
    $('#currentTotal').val("0.00");

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
  
    var currentMoney = parseFloat($('#currentTotal').val());
    if (currentMoney < item.itemPrice)
        alert("You have not entered enough money to purchase that item.");
    else {
       $.ajax({
        url: 'vend/' + itemId,
        type: 'PUT'
    }).success(function() {
        $('#currentTotal').val((currentMoney - item.itemPrice).toFixed(2));
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
        restockLink.attr({
            'onclick': 'restock(' + item.itemId + ')'
        });
        restockLink.text("Restock");
        restockField.append(restockLink);

        var editLink = $("<a>");
        editLink.attr({
            'onclick': 'edit(' + item.itemId + ')'
        });
        editLink.text("Edit");
        editField.append(editLink);

        var deleteLink = $("<a>");
        deleteLink.attr({
            'onclick': 'delete(' + item.itemId + ')'
        });
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

function restockItem(itemid, qty) {

    $.ajax({
        url: 'items',
        type: 'GET'
    }).success(function (data) {

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
function deleteItem(id) {

    $.ajax({
        url: 'items',
        type: 'GET'
    }).success(function (data) {
        processItemList(data);
        processMgmtList(data);
    });
}

