/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// REGISTERING EVENTS (and loading pets @ first)
$(document).ready(function () {
    loadItems();


    $("#add-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        addItem(); // Then do OUR thing.
    });

    $("#edit-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        editItem(); // Then do OUR thing.
    });

});

// ==========
// FUNCTIONS!
// ==========

function clearItemTable() {
    $('#itemRows').empty();
}

function processItemList(items) {
    clearItemTable();

    // jQuery forEach starts with $.each
    var itemRows = $('#itemRows');

    $.each(items, function (index, item) {

        var nameField = $("<td>");
        var priceField = $("<td>");
        var vendField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        nameField.append(item.itemName);
        
        priceField.append(item.itemPrice.toFixed(2));
        
        var vendLink = $("<a>");
        vendLink.attr({
            'on-click': 'vendItem(' + item.itemId + ')'
        });
        vendLink.text("Buy");
        vendField.append(vendLink);


        var itemRow = $("<tr>");
        itemRow.append(nameField);
        itemRow.append(priceField);
        itemRow.append(vendField);


        itemRows.append(itemRow);
    });

}

function loadItems() {

$.ajax({
    url: 'items',
    type:'GET'
}).success(function(data){
    processItemList(data);
});

}

function vendItem(id) {
    var amtEntered = $('#moneyInput');
}

