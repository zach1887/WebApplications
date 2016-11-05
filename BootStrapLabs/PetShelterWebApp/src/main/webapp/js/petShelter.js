$(document).ready(function () {

    loadPets();
    
    $("#search-button").click(function(event) {
        event.preventDefault();
        searchPets(); 
    });
    
    $("#add-button").click(function (event) {
        event.preventDefault();
        addPet();
    });

    $("#edit-button").click(function (event) {
        event.preventDefault();
        editPet();
    });

    $("#pet-details-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget);
        var petId = element.data('pet-id');
        petDetails(petId);
    });
    $("#pet-edit-modal").on('show.bs.modal', function (event) {
        var element = $(event.relatedTarget);
        var petId = element.data('pet-id');
        petEditDetails(petId);
    });


});

function clearPetTable() {
    $('#petRows').empty();
}
function processPetList(pets) {
    clearPetTable();
    var petRows = $('#petRows');
    $.each(pets, function (index, pet) {

        var nameField = $("<td>");
        var breedField = $("<td>");
        var editField = $("<td>");
        var deleteField = $("<td>");
        //<td><a data-contact-id="3" data-toggle="modal" data-target="#detailsModal">Fido</a></td>
        var nameLink = $("<a>");
        nameLink.attr({'data-toggle': 'modal',
            'data-target': '#pet-details-modal',
            'data-pet-id': pet.petId});
        nameLink.text(pet.petName);
        nameField.append(nameLink);
        //<td>Dog</td>
        breedField.text(pet.petBreed);
        var editLink = $("<a>");
        editLink.attr({'data-toggle': 'modal',
            'data-target': '#pet-edit-modal',
            'data-pet-id': pet.petId});
        editLink.text("Edit");
        editField.append(editLink);
        var deleteLink = $("<a>");
        deleteLink.attr({
            'onclick': 'adoptPet(' + pet.petId + ')'
        });
        deleteLink.text("Delete");
        deleteField.append(deleteLink);
        var petRow = $("<tr>");
        petRow.append(nameField);
        petRow.append(breedField);
        petRow.append(editField);
        petRow.append(deleteField);
        petRows.append(petRow);
    });
}
function loadPets() {
// Find the table to load in Pets
    var petContents = $('#petRows');
//Generate a Request to get all of the Pets from our REST endpoint
// Endpoint details:  localhost:/8080/PetShelterWebApp/pets
    $.ajax({
        url: 'pets',
        type: 'GET'
    }).success(function (data) {
        processPetList(data);
    });
}

function addPet() {

    var petName = $("#add-pet-name").val();
    var petBreed = $("#add-pet-breed").val();
    var petDisp = $("#add-pet-disp").val();
    var petVacc = $("#add-pet-vaccinated").prop('checked');
    $.ajax({
        url: 'pet',
        type: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json', // data Type

        data: JSON.stringify({
            petName: petName,
            petBreed: petBreed,
            disposition: petDisp,
            vaccinated: petVacc
        })
    }).success(function (data) {
        $("#validationErrors").hide();
        clearPetTable();
        loadPets();
        $("#add-pet-name").val('');
        $("#add-pet-breed").val('');
        $("#add-pet-disp").val('');
        $("#add-pet-vaccinated").prop('checked', false);
    }).error(function (data, status) {
        var errorDiv = $("#validationErrors");
        
        // the data should be a list of field errors
        // each with a message and an error
        errorDiv.empty();
        errorDiv.show();
        $.each(data.responseJSON.fieldErrors, function(index, validationError) {
            errorDiv.append(validationError.message);
            errorDiv.append("<br");
        });

    });

}

function editPet() {

    var petId = $("#edit-pet-id").text();
    var petName = $("#edit-pet-name").val();
    var petBreed = $("#edit-pet-breed").val();
    var petDisp = $("#edit-pet-disp").val();
    var petVacc = $("#edit-pet-vaccinated").prop('checked');
    $.ajax({
        url: 'pet/' + petId,
        type: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        'dataType': 'json', // data Type

        data: JSON.stringify({
            petID: petId,
            petName: petName,
            petBreed: petBreed,
            disposition: petDisp,
            vaccinated: petVacc
        })
    }).success(function (data) {
        loadPets();
    });
}
function searchPets() {

    var petName = $("#search-pet-name").val();
    var petBreed = $("#search-pet-breed").val();
    var petDisp = $("#search-pet-disp").val();
    var petVacc = $("#search-pet-vacc").prop('checked');
    $.ajax({
        url: 'search/pets',
        type: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'dataType': 'json', // data Type

        data: JSON.stringify({
            petName: petName,
            petBreed: petBreed,
            petDisposition: petDisp,
            petVacc: petVacc
        })
    }).success(function (data) {
        processPetList(data);
    });
}

function adoptPet(id) {
    $.ajax({
        type: 'DELETE',
        url: 'pet/' + id
    }).success(function () {
        loadPets();
    });
}


function petDetails(id) {
    $.ajax({
        url: 'pet/' + id,
        type: 'GET',
        headers: {
            'Accept': 'application/json'
        }

    }).success(function (pet) {
        $("#pet-detail-id").text(pet.petId);
        $("#pet-detail-name").text(pet.petName);
        $("#pet-detail-breed").text(pet.petBreed);
        $("#pet-detail-disp").text(pet.disposition);
        $("#pet-detail-vacc").text(pet.vaccinated);
    });
}

function petEditDetails(id) {
    $.ajax({
        url: 'pet/' + id,
        type: 'GET',
        headers: {
            'Accept': 'application/json'
        }

    }).success(function (pet) {
        $("#edit-pet-id").text(pet.petId);
        $("#edit-pet-name").val(pet.petName);
        $("#edit-pet-breed").val(pet.petBreed);
        $("#edit-pet-disp").val(pet.disposition);
        $("#edit-pet-vaccinated").prop("checked", pet.vaccinated);
    });
}

