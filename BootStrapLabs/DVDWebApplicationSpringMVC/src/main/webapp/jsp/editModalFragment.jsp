<!-- Our edit modal will go here!!! -->
<div class="modal fade" id="dvd-edit-modal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>
            </div>
            <form>
            <div class="modal-body">
                <h2 id="edit-dvd-id"></h2>
                <div class="form-group">
                    <label for="dvd-edit-title" class="col-md-4 control-label">DVD Title:</label>
                    <div class="col-md-8">
                        <input id="dvd-edit-title" name="dvdTitle" type="text" class="form-control" placeholder="Title" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="dvd-edit-year" class="col-md-4 control-label">Release Year:</label>
                    <div class="col-md-8">
                        <input id="dvd-edit-year" name="dvdYear" type="text" class="form-control" placeholder="Year" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="dvd-edit-rating" class="col-md-4 control-label">MPAA Rating:</label>
                    <div class="col-md-8">
                        <input id="dvd-edit-rating" name="dvdRating" type="text" class="form-control" placeholder="Rating" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="dvd-edit-director" class="col-md-4 control-label">Director:</label>
                    <div class="col-md-8">
                        <input id="dvd-edit-director" name="dvdDirector" type="text" class="form-control" placeholder="Director" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="dvd-edit-studio" class="col-md-4 control-label">Studio:</label>
                    <div class="col-md-8">
                        <input id="dvd-edit-studio" name="dvdStudio" type="text" class="form-control" placeholder="Studio" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="dvd-edit-comments" class="col-md-4 control-label">Comments:</label>
                    <div class="col-md-8">
                        <input id="dvd-edit-comments" name="dvdComments" type="text" class="form-control" placeholder="Comments" />
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-offset-4 col-md-8">
                        <button type="submit" id="edit-button" class="btn btn-default" data-dismiss="modal">Edit Record</button>
                    </div>
                </div>                        

                </form>

            </div>
            <div class="modal-footer">
                <button type="button" class="close" data-dismiss="modal">
                    Close
                </button>
            </div>
        </div>
    </div>