$(document).ready(function () {

    loadPets();
    $("#add-button").click(function (event) {
        event.preventDefault();
        addPet();
    });
    
    $("#pet-details-modal").on('show.bs.modal',function(event){
        var element = $(event.relatedTarget);
        var petId = element.data('pet-id');
        petDetails(petId);
    });
    
    
});

function clearPetTable(){
    $('#petRows').empty();
}
function processPetList(pets) {

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
        clearPetTable();
        loadPets();
        $("#add-pet-name").val('');
        $("#add-pet-breed").val('');
        $("#add-pet-disp").val('');
        $("#add-pet-vaccinated").prop('checked',false);
    });
    
    function adoptPet(id) {
        $.ajax({
            type : 'DELETE',
            url : 'pet/' + id
        }).success(function(){
            loadPets();
        });
    }
}

function petDetails(id){
    $.ajax({
       url: 'pet/' + id ,
       type: 'GET',
       headers:{
           'Accept': 'application/json'
        }
        
    }).success(function(pet){
        $("#pet-detail-id").text(pet.petID);
        $("#pet-detail-name").text(pet.petName);
        $("#pet-detail-breed").text(pet.petBreed);
        $("#pet-detail-disp").text(pet.disposition);
        $("#pet-detail-vacc").text(pet.vaccinated);
    });
    
}

















