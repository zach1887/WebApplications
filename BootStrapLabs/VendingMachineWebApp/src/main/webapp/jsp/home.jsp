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
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/manage">Management Page</a></li>
                </ul>    
            </div>
            <div class="col-md-4">
                <label for="moneyInput"> Insert Money</label> 
            </div>
            <div class="col-md-4">
                <input id="moneyInput" type = "number" />
            </div>
            <div class="col-md-4">
                <button id = "add-money-button" class="btn btn-default"> Add Money</button>
            </div>
            <div class="col-md-4">
                <label for="currentTotal"> Current Total</label> 
            </div>

            <div class="col-md-4" ><input id="currentTotal" type = "number" readonly /></div> 

            <div class="col-md-4">

            </div>

            <hr/>
            <%@include file="itemFragment.jsp" %>
            <div class="col-md-4">
                <label for="changeReturn">Change</label> 
            </div>
            <div class="col-md-4"> <input id="changeReturn" readonly />
            </div> 
            <button id = "return-change-button" class="btn btn-default">Return Change</button>

        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/vending.js"></script>

    </body>
</html>

