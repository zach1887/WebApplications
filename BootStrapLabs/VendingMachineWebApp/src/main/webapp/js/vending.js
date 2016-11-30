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
            'on-click': 'vendItem(' + item + ')'
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

function vendItem(item) {
    var currentMoney = parseFloat($('#currentTotal').val());
    if (!currentMoney)
        alert("You have to put money in first!");
    else if (currentMoney < item.itemPrice)
        alert("You have not entered enough to purchase this item.");
    else
        $.ajax({
            url: 'vend/' + item.itemId,
            type: 'PUT'
        }).success(function (data) {
        loadItems();
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
            'on-click': 'restock(' + item.itemId + ')'
        });
        restockLink.text("Restock");
        restockField.append(restockLink);

        var editLink = $("<a>");
        editLink.attr({
            'on-click': 'edit(' + item.itemId + ')'
        });
        editLink.text("Edit");
        editField.append(editLink);

        var deleteLink = $("<a>");
        deleteLink.attr({
            'on-click': 'delete(' + item.itemId + ')'
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

