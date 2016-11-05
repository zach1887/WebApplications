<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>SWG Site Map</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        
        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

    </head>
    <body>
        <h1> Software Guild Site Map</h1>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                	<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/luckySevens">Lucky Sevens</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/tipCalc">Tip Calculator</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/interestCalc">Interest Calculator</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

