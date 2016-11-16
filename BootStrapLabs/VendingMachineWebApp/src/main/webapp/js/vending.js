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
        var restockField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        nameField.append(item.itemName);
        
        priceField.append(item.itemPrice);
        
        var vendLink = $("<a>");
        vendLink.attr({
            'on-click': 'vendItem(' + item.itemId + ')'
        });
        vendField.text("Buy");
        vendField.append(vendLink);

        // <td><a onclick="adoptPet(0)">Adopt</a></td>
        var restockLink = $("<a>");
        restockLink.attr({
            'onclick': 'restock(' + item.itemId + ')'
        });
        restockLink.text("Restock");
        restockField.append(restockLink);

        var itemRow = $("<tr>");
        itemRow.append(nameField);
        itemRow.append(priceField);
        itemRow.append(vendField);
        itemRow.append(restockField);


        itemRows.append(itemRow);
    });

}


}