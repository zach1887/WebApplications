

<div class="modal fade" id="pet-edit-modal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>

            </div>   
            <div class="modal-body">
                <h3 id=""pet-edit-id">Pet ID Goes Here </h3>

                <form class="form-horizontal" role="form"> 
                    <div class="form-group">
                        <label for="edit-pet-name" class="col-md-4 control-label">Pet Name: </label>
                        <div class="col-md-8">
                            <input id="edit-pet-name" name="petName" type="text" class="form-control" placeholder="PetName"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-pet-breed " class="col-md-4 control-label">Pet Breed: </label>
                        <div class="col-md-8">
                            <input id="edit-pet-breed" name="petBreed" type="text" class="form-control" placeholder="PetBreed"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-pet-disp " class="col-md-4 control-label">Pet Disposition: </label>
                        <div class="col-md-8">
                            <input id="edit-pet-disp" name="petDisp" type="text" class="form-control" placeholder="PetDisp"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="edit-pet-vaccinated " class="col-md-4 control-label">Pet Vaccinated: </label>
                        <div class="col-md-8">
                            <input id="edit-pet-vaccinated" name="petVacc" type="checkbox" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-default" data-dismiss="modal"> Update Pet Record </button>
                        </div>
                    </div>

                </form>
                <div class=""modal-footer">
                    <button type="button" class="close" data-dismiss="modal">
                        Close
                    </button>

                </div>



            </div>
        </div>
    </div>
