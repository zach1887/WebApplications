$(document).ready(function () {

    loadPets();
});

function loadPets() {
    // Find the table to load in Pets
    var petContents = $('#petRows');

    //<td><a data-contact-id="3" data-toggle="modal" data-target="#detailsModal">Fido</a></td>
    var detailsLink = $('<td>')
            .append($('<a>')
                    .attr({
                        'data-toggle': 'modal',
                        'data-target': '#pet-details-modal'
                    })
                    .text("Fido")
                    );

    var editLink = $('<td>').text("Edit");

    petContents.append($('<tr>')
            .append(detailsLink)
            .append($('<td>').text("Dog"))
            .append(editLink)
            .append($('<td>').text("Delete"))
            );
}