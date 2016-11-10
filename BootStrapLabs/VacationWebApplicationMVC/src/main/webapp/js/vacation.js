/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// REGISTERING EVENTS (and loading pets @ first)
$(document).ready(function () {
    loadVacc();

    $("#search-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        searchVacc(); // Then do OUR thing.
    });


    $("#add-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        addVacc(); // Then do OUR thing.
    });

    $("#edit-button").click(function (event) {
        // Stop the button, if it is trying to submit, from submitting
        event.preventDefault();
        editVacc(); // Then do OUR thing.
    });

    // Find the pet details modal, and register a "on show" event listener function
    $("#vacc-details-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget); // Hey, go find the thing that made this event happen
        var tripId = element.data('trip-id'); // found the a tag, now get the data-pet-id value
        vaccDetails(tripId);
    });

    // Find the pet edit modal, and register a "on show" event listener function
    $("#vacc-edit-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget) // Hey, go find the thing that made this event happen
        var tripId = element.data('trip-id'); // found the a tag, now get the data-pet-id value
        vaccEditDetails(tripId);
    });


});

// ==========
// FUNCTIONS!
// ==========

function clearVaccTable() {
    $('#vaccRows').empty();
}

function processVaccList(vacations) {
    clearVaccTable();

    // jQuery forEach starts with $.each
    var vaccRows = $('#vaccRows');

    $.each(vacations, function (index, trip) {

        var yearField = $("<td>");
        var countryField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");

        // <td><a data-toggle="modal" data-target="#pet-details-modal" data-pet-id="0">Fido</a></td>
        var yearLink = $("<a>");
        yearLink.attr({'data-toggle': 'modal',
            'data-target': '#vacc-details-modal',
            'data-trip-id': trip.tripId});
        yearLink.text(trip.yearOfTrip);
        yearField.append(yearLink);

        // <td>Dog</td>
        countryField.text(trip.destCountry);

        // <td><a data-toggle="modal" data-target="#pet-edit-modal" data-pet-id="0">Edit</a></td>
        var editLink = $("<a>");
        editLink.attr({'data-toggle': 'modal',
            'data-target': '#vacc-edit-modal',
            'data-trip-id': trip.tripId});
        editLink.text("Edit");
        editField.append(editLink);

        // <td><a onclick="adoptPet(0)">Adopt</a></td>
        var deleteLink = $("<a>");
        deleteLink.attr({
            'onclick': 'removeVacc(' + trip.tripId + ')'
        });
        deleteLink.text("Remove");
        deleteField.append(deleteLink);

        var vaccRow = $("<tr>");
        vaccRow.append(yearField);
        vaccRow.append(countryField);
        vaccRow.append(editField);
        vaccRow.append(deleteField);

        vaccRows.append(vaccRow);
    });

}

function loadVacc() {

    // Generate a REQUEST to get all of the PETS from our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pets 
    $.ajax({
        // Describe the request!
        url: 'vacations',
        type: 'GET'
    }).success(function (data) {
        processVaccList(data);
    });


}

function addVacc() {
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    var tripMonth = $("#vacc-add-tripMonth").val();
    var tripYear = $("#vacc-add-tripYear").val();
    var destCity = $("#vacc-add-destCity").val();
    var destCountry = $("#vacc-add-destCountry").val();
    var daysLength = $("#vacc-add-daysLength").val();
    var tripOverseas = $("#vacc-add-tripOverseas").prop('checked');
    var otherCities = $("#vacc-add-otherCities").val();

    // Generate a REQUEST to submit the PET to our REST endpoint
    // Endpoint details: POST @ localhost:8080/PetShelterWebApp/pet
    // REQUESTBODY: PET , RESPONSEBODY : PET (+id)

    $.ajax({
        url: 'vacc',
        type: 'POST',
        // Describe the information you are sending
        // This is important, because the server WILL reject requests
        // if it doesn't match it's expecations of what is inside
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
            monthOfTrip: tripMonth,
            yearOfTrip: tripYear,
            destCity: destCity,
            destCountry: destCountry,
            lengthDays: daysLength,
            tripOverseas: tripOverseas,
            otherCitiesVisited: otherCities
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        $("#validationErrors").hide();
        loadVacc();
        $("#vacc-add-tripMonth").val('');
        $("#vacc-add-tripYear").val('');
        $("#vacc-add-destCity").val('');
        $("#vacc-add-destCountry").val('');
        $("#vacc-add-daysLength").val('');
        $("#vacc-add-tripOverseas").prop('checked', false);
        $("#vacc-add-otherCities").val('');

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
function removeVacc(id) {
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: DELETE @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID

    $.ajax({
        type: 'DELETE',
        url: 'vacc/' + id
    }).success(function () {
        loadVacc();
    });
}

function vaccDetails(id) {
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID  , RESPONSEBODY : PET 
    $.ajax({
        type: 'GET',
        url: 'vacc/' + id,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (trip) {
        $("#vacc-detail-tripId").text(trip.tripId);
        $("#vacc-detail-tripMonth").text(trip.monthOfTrip);
        $("#vacc-detail-tripYear").text(trip.yearOfTrip);
        $("#vacc-detail-destCity").text(trip.destCity);
        $("#vacc-detail-destCountry").text(trip.destCountry);
        $("#vacc-detail-lengthDays").text(trip.lengthDays);
        $("#vacc-detail-tripOverseas").text(trip.tripOverseas);
        $("#vacc-detail-otherCities").text(trip.otherCitiesVisited);
    });
}

function vaccEditDetails(id) {
    // Generate a REQUEST to submit the PETID to our REST endpoint
    // Endpoint details: GET @ localhost:8080/PetShelterWebApp/pet/{petId}
    // PATHVARIABLE : petID  , RESPONSEBODY : PET 
    $.ajax({
        type: 'GET',
        url: 'vacc/' + id,
        headers: {
            'Accept': 'application/json'
        }
    }).success(function (trip) {
        // h2 tags use TEXT
        $("#vacc-edit-tripId").text(trip.tripId);
        // Inputs use VALUE
        $("#vacc-edit-tripMonth").val(trip.monthOfTrip);
        $("#vacc-edit-tripYear").val(trip.yearOfTrip);
        $("#vacc-edit-destCity").val(trip.destCity);
        $("#vacc-edit-destCountry").val(trip.destCountry);
        $("#vacc-edit-daysLength").val(trip.lengthDays);
        // CHECKBOXES have to be special. Wah.
        $("#vacc-edit-tripOverseas").prop('checked', trip.tripOverseas);
        $("#vacc-edit-otherCities").val(trip.otherCitiesVisited);
    });
}

function editVacc() {
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST

    var tripId = $("#vacc-edit-tripId").text();
    var tripMonth = $("#vacc-edit-tripMonth").val();
    var tripYear = $("#vacc-edit-tripYear").val();
    var tripDestCity = $("#vacc-edit-destCity").val();
    var tripDestCountry = $("#vacc-edit-destCountry").val();
    var tripDaysLength = $("#vacc-edit-daysLength").val();
    var tripOverseas = $("#vacc-edit-tripOverseas").prop('checked');
    var tripOtherCities = $("#vacc-edit-otherCities").val();

    // Generate a REQUEST to submit the PET to our REST endpoint
    // Endpoint details: PUT @ localhost:8080/PetShelterWebApp/pet/{petId}
    // REQUESTBODY: PET , PATHVARIABLE: PetID

    $.ajax({
        url: 'vacc/' + tripId,
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
            monthOfTrip: tripMonth,
            yearOfTrip: tripYear,
            destCity: tripDestCity,
            destCountry: tripDestCountry,
            lengthDays: tripDaysLength,
            tripOverseas: tripOverseas,
            otherCitiesVisited: tripOtherCities
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        loadVacc();

    });
}

function searchVacc() {
    // GO FIND THE FORM INFO ON THE PAGE AND STORE IN A TEMP VARIABLE
    // TO USE LATER IN YOUR AJAX REQUEST
    clearVaccTable();
    var tripId = $("vacc-search-tripId").text();
    var tripMonth = $("#vacc-search-tripMonth").val();
    var tripYear = $("#vacc-search-tripYear").val();
    var tripDestCity = $("#vacc-search-destCity").val();
    var tripDestCountry = $("#vacc-search-destCountry").val();
    var tripDaysLength = $("#vacc-search-daysLength").val();
    var tripOverseas = $("#vacc-search-tripOverseas").prop('checked');
    var tripOtherCities = $("#vacc-search-otherCities").val();


    // Generate a REQUEST to submit the SEARCH OF PETS to our REST endpoint
    // Endpoint details: POST @ localhost:8080/PetShelterWebApp/search/pets
    // REQUESTBODY: SEARCH MAP
    // RESPONSE BODY : List of PETS that adhered to criteria

    $.ajax({
        url: 'search/vacations',
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
            monthOfTrip: tripMonth,
            yearOfTrip: tripYear,
            destCity: tripDestCity,
            destCountry: tripDestCountry,
            lengthDays: tripDaysLength,
            tripOverseas: tripOverseas,
            otherCitiesVisited: tripOtherCities
        })
    }).success(function (data) { // Register a PROMISE function to be called on response success
        processVaccList(data);
    });
}