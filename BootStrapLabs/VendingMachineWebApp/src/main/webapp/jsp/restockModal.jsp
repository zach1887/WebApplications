

<div class="modal fade" id="item-restock-modal" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    &times;
                </button>

            </div>   
            <div class="modal-body">
                <h3 id="item-restock-itemId" hidden>Item ID </h3>
                <h3 id="item-restock-itemPrice" hidden>Item ID </h3>

                <form class="form-horizontal" role="form"> 
                    <div class="form-group">
                        <label for="item-restock-itemName" class="col-md-4 control-label">Name: </label>
                        <div class="col-md-8">
                            <div id="item-restock-itemName"> Item Name here </div>
                        </div>
                        Current Quantity: <span id = "item-restock-itemQty" >Item qty here </span>
                    </div>
                    <div class="form-group">
                        <label for="item-restockQty" class="col-md-4 control-label">How many of this item would you like to add? Max is 100.</label>
                        <div class="col-md-8">
                            <input id="item-restockQty" name="restockQty" type="number" min = 0 max = 100 class="form-control" />
                        </div>
                    </div>

                </form>
                <div class="modal-footer">
                     <button type="submit" id="restock-button">
                        Restock
                    </button>

                </div>



            </div>
        </div>
    </div>
    
</div>
