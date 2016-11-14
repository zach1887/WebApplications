

<div class="modal fade" id="vacc-edit-modal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>

            </div>   
            <div class="modal-body">
                <h3 id="vacc-edit-tripId">Trip ID </h3>

                <form class="form-horizontal" role="form"> 
                    <div class="form-group">
                        <label for="vacc-edit-tripMonth" class="col-md-4 control-label">Trip Month: </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-tripMonth" name="tripMonth" type="text" class="form-control" placeholder="Month"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="vacc-edit-tripYear" class="col-md-4 control-label">Trip Year: </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-tripYear" name="petBreed" type="text" class="form-control" placeholder="Year"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="vacc-edit-destCity" class="col-md-4 control-label">Destination City: </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-destCity" name="destCity" type="text" class="form-control" placeholder="City"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="vacc-edit-destCountry" class="col-md-4 control-label">Destination Country: </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-destCountry" name="destCountry" type="text" class="form-control" placeholder="Country"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="vacc-edit-daysLength" class="col-md-4 control-label">Days Length: </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-daysLength" name="daysLength" type="text" class="form-control" placeholder="Days"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="vacc-edit-tripOverseas" class="col-md-4 control-label">Trip Overseas? </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-tripOverseas" name="tripOverseas" type="checkbox" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="vacc-edit-otherCities" class="col-md-4 control-label">Other Cities: </label>
                        <div class="col-md-8">
                            <input id="vacc-edit-otherCities" name="otherCities" type="text" class="form-control" placeholder="Days"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-default" data-dismiss="modal"> Update Record </button>
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
