/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// REGISTERING EVENTS (and loading pets @ first)
$(document).ready(function () {
    loadDVDs();

    $("#search-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        searchDVD(); // Then do OUR thing.
    });


    $("#add-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        addDVD(); // Then do OUR thing.
    });

    $("#edit-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        editDVD(); // Then do OUR thing.
    });

    // Find the pet details modal, and register a "on show" event listener function
    $("#dvd-details-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var dvdId = element.data('dvd-id'); // found the a tag, now get the data-pet-id value
        dvdDetails(dvdId);
    });

    // Find the pet edit modal, and register a "on show" event listener function
    $("#dvd-edit-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var dvdId = element.data('dvd-id'); // found the a tag, now get the data-pet-id value
        dvdEditDetails(dvdId);
    });


});

// ==========
// FUNCTIONS!
// ==========

function clearDVDTable() {
    $('#dvdRows').empty();
}

function processDVDList(dvds) {
    clearDVDTable();

    // jQuery forEach starts with $.each
    var dvdRows = $('#dvdRows');

    $.each(dvds, function (index, dvd) {

        var titleField = $("<td>");
        var yearField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        var titleLink = $("<a>");
        titleLink.attr({'data-toggle': 'modal',
            'data-target': '#dvd-details-modal',
            'data-dvd-id': dvd.idDVD});
        titleLink.text(dvd.title);
        titleField.append(titleLink);

        // <td>Dog</td>
        yearField.text(dvd.releaseYear);

        // <td><a data-toggle="modal" data-target="#pet-edit-modal" data-pet-id="0">Edit</a></td>
        var editLink = $("<a>");
        editLink.attr({'data-toggle': 'modal',
            'data-target': '#dvd-edit-modal',
            'data-dvd-id': dvd.idDVD});
        editLink.text("Edit");
        editField.append(editLink);

        // <td><a onclick="adoptPet(0)">Adopt</a></td>
        var deleteLink = $("<a>");
        deleteLink.attr({
            'onclick': 'removeDVD(' + dvd.idDVD + ')'
        });
        deleteLink.text("Remove");
        deleteField.append(deleteLink);

        var dvdRow = $("<tr>");
        dvdRow.append(titleField);
        dvdRow.append(yearField);
        dvdRow.append(editField);
        dvdRow.append(deleteField);


        dvdRows.append(dvdRow);
    });

}

function loadDVDs() {

    // Generate a REQUEST to get all of the PETS from our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pets 
    $.ajax({
        // Describe the request!
        url: 'dvdCollection',
        type: 'GET'
    }).success(function (data) {
        processDVDList(data);
    });


}

function addDVD() {
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var dvdTitle = $("#dvd-add-title").val();
    var dvdYear = $("#dvd-add-year").val();
    var dvdRating = $("#dvd-add-rating").val();
    var dvdDirector = $("#dvd-add-director").val();
    var dvdStudio = $("#dvd-add-studio").val();
    var dvdComments = $("#dvd-add-comments").val();


    // Generate a REQUEST to submit the PET to our REST endpoint
    // Endpoint details: POST @ localhost:8080/PetShelterWebApp/pet
    // REQUESTBODY: PET , RESPONSEBODY : PET (+id)

    $.ajax({
        url: 'dvd',
        type: 'POST',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match its expecations of what is inside
        headers: {
            // MIME TYPES
            'Accept': 'application/json', //Whatcha want back
            'Content-Type': 'application/json' // Whatcha sending
        },
        'dataType': 'json', // Whatcha sending, data type

        // NOW ACTUALLY SETUP THE DATA
        data: JSON.stringify({
            // These key/value pairs need to match the propertyName/Values
            // of your Java DTO if that is what you are sending.
            // this is because Spring/Jaxson will try and use 
            // use getters and setters etc to try to translate JSON -> Java
            // If they don't match expected, there can be EXPLOSIONS
            title: dvdTitle,
            releaseYear: dvdYear,
            mPAArating: dvdRating,
            director: dvdDirector,
            studio: dvdStudio,
            comments: dvdComments
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        $("#validationErrors").hide();
        loadDVDs();
        $("#dvd-add-title").val('');
        $("#dvd-add-year").val('');
        $("#dvd-add-rating").val('');
        $("#dvd-add-director").val('');
        $("#dvd-add-studio").val('');
        $("#dvd-add-comments").val('');

    }).error(function (data, status) {
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

// <td><a onclick="adoptPet(0)">Adopt</a></td>
function removeDVD(id) {
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: DELETE @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID

    $.ajax({
        type: 'DELETE',
        url: 'dvd/' + id
    }).success(function () {
        loadDVDs();
    });
}

function dvdDetails(id) {
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID  , RESPONSEBODY : PET 
    $.ajax({
        type: 'GET',
        url: 'dvd/' + id,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (dvd) {
        $("#dvd-detail-id").text(dvd.idDVD);
        $("#dvd-detail-title").text(dvd.title);
        $("#dvd-detail-year").text(dvd.releaseYear);
        $("#dvd-detail-rating").text(dvd.mPAArating);
        $("#dvd-detail-director").text(dvd.director);
        $("#dvd-detail-studio").text(dvd.studio);
        $("#dvd-detail-comments").text(dvd.comments);
    });
}

function dvdEditDetails(id) {
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID  , RESPONSEBODY : PET 
    $.ajax({
        type: 'GET',
        url: 'dvd/' + id,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (dvd) {
        // h2 tags use TEXT
        $("#edit-dvd-id").text(dvd.idDVD);
        // Inputs use VALUE
        $("#dvd-edit-title").val(dvd.title);
        $("#dvd-edit-year").val(dvd.releaseYear);
        $("#dvd-edit-rating").val(dvd.mPAArating);
        $("#dvd-edit-director").val(dvd.director);
        $("#dvd-edit-studio").val(dvd.studio);
        $("#dvd-edit-comments").val(dvd.comments);

    });
}

function editDVD() {
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var dvdId = $("#edit-dvd-id").text();
    var dvdTitle = $("#dvd-edit-title").val();
    var dvdYear = $("#dvd-edit-year").val();
    var dvdRating = $("#dvd-edit-rating").val();
    var dvdDirector = $("#dvd-edit-director").val();
    var dvdStudio = $("#dvd-edit-studio").val();
    var dvdComments = $("#add-edit-comments").val();

    // Generate a REQUEST to submit the PET to our REST endpoint
    // Endpoint details: PUT @ localhost:8080/PetShelterWebApp/pet/{petId}
    // REQUESTBODY: PET , PATHVARIABLE: PetID

    $.ajax({
        url: 'dvd/' + dvdId,
        type: 'PUT',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match it's expecations of what is inside
        headers: {
            // MIME TYPES
            'Content-Type': 'application/json' // Whatcha sending
        },
        'dataType': 'json', // Whatcha sending, data type

        // NOW ACTUALLY SETUP THE DATA
        data: JSON.stringify({
            // These key/value pairs need to match the propertyName/Values
            // of your Java DTO if that is what you are sending.
            // this is because Spring/Jaxson will try and use 
            // use getters and setters etc to try to translate JSON -> Java
            // If they don't match expected, there can be EXPLOSIONS
            title: dvdTitle,
            releaseYear: dvdYear,
            MPAArating: dvdRating,
            director: dvdDirector,
            Studio: dvdStudio,
            comments: dvdComments
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        loadDVDs();

    });
}

function searchDVD() {
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var dvdTitleVal = $("dvd-search-title").val();
    var dvdYearVal = $("dvd-search-year").val();
    var dvdRatingVal = $("dvd-search-rating").val();
    var dvdDirectorVal = $("dvd-search-director").val();
    var dvdStudioVal = $("dvd-search-studio").val();

    // Generate a REQUEST to submit the SEARCH OF PETS to our REST endpoint
    // Endpoint details: POST @ localhost:8080/PetShelterWebApp/search/pets
    // REQUESTBODY: SEARCH MAP
    // RESPONSE BODY : List of PETS that adhered to criteria

    $.ajax({
        url: 'search/dvds',
        type: 'POST',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match it's expecations of what is inside
        headers: {
            // MIME TYPES
            'Accept': 'application/json', // Whatcha want back
            'Content-Type': 'application/json' // Whatcha sending
        },
        'dataType': 'json', // Whatcha sending, data type

        // NOW ACTUALLY SETUP THE DATA
        data: JSON.stringify({
            // These key/value pairs need to match the propertyName/Values
            // of your Java DTO if that is what you are sending.
            // this is because Spring/Jaxson will try and use 
            // use getters and setters etc to try to translate JSON -> Java
            // If they don't match expected, there can be EXPLOSIONS
            title: dvdTitleVal,
            releaseYear: dvdYearVal,
            MPAArating: dvdRatingVal,
            director: dvdDirectorVal,
            Studio: dvdStudioVal
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        processDVDList(data);
    });
}