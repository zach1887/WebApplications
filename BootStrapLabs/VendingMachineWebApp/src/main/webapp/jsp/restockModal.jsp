

<div class="modal fade" id="item-restock-modal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>

            </div>   
            <div class="modal-body">
                <h3 id="item-edit-itemId">Item ID </h3>

                <form class="form-horizontal" role="form"> 
                    <div class="form-group">
                        <label for="item-edit-itemName" class="col-md-4 control-label">Name: </label>
                        <div class="col-md-8">
                            <input id="item-edit-itemName" name="itemName" type="text" class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="item-edit-restockQty" class="col-md-4 control-label">How many of this item would you like to add? </label>
                        <div class="col-md-8">
                            <input id="item-edit-restockQty" name="itemPrice" type="number" min = 0 max = 100 class="form-control" />
                        </div>
                    </div>

                </form>
                <div class="modal-footer">
                     <button type="button" class="close" data-dismiss="modal">
                        Close
                    </button>

                </div>



            </div>
        </div>
    </div>
