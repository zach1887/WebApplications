

<div class="modal fade" id="item-edit-modal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>

            </div>   
              <div class ="modal-body">
                <h3 id="item-edit-itemId">Item ID </h3>

                <form class="form-horizontal" role="form"> 
                    <div class="form-group">
                        <label for="item-edit-itemName" class="col-md-4 control-label">Name: </label>
                        <div class="col-md-8">
                            <input id="item-edit-itemName" name="itemName" type="text" class="form-control" placeholder="Month"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="item-edit-itemPrice" class="col-md-4 control-label">Item Price: </label>
                        <div class="col-md-8">
                            <input id="item-edit-itemPrice" name="itemPrice" type="number" min = 0 max = 10 class="form-control" />
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="item-edit-itemQty" class="col-md-4 control-label">Item Qty: </label>
                        <div class="col-md-8">
                            <input id="item-edit-itemQty" name="itemQty" type="number" class="form-control" />
                        </div>
                    </div>


                    <div class="form-group">
                        <div class="col-md-offset-4 col-md-8">
                            <button type="submit" id="edit-button" class="btn btn-default"> Edit Item</button>
                        </div>
                    </div>

              
                     <button type="button" class="close" data-dismiss="modal">
                        Close
                    </button>
</form>
                </div>



            </div>
        </div>
    </div>
