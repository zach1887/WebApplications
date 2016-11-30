<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vending Machine</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <div class="container">
            <h1>Vending Machine</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                	<li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                	<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/manage">Management Page</a></li>
                </ul>    
            </div>
   

            <%@include file="itemFragment2.jsp" %>

             <h2>Add a New Item</h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="item-add-name" class="col-md-4 control-label">Item Name</label>
                            <div class="col-md-8">
                                <input id="item-add-name" name="itemName" type="text" class="form-control" placeholder="Name" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="item-add-price" class="col-md-4 control-label">Item Price</label>
                            <div class="col-md-8">
                                <input id="item-add-price" name="itemPrice" type="number" class="form-control" placeholder="Price" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="item-add-qty" class="col-md-4 control-label">Item Quantity</label>
                            <div class="col-md-8">
                                <input id="item-add-price" name="itemName" type="number" class="form-control" placeholder="Qty" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" id="add-button" class="btn btn-default">Add Item</button>
                            </div>
                        </div>                        
                    </form>
             
             Sales Report By Item <br>
             Sales Report By Transaction <br>

    </div>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/vending.js"></script>

</body>
</html>

