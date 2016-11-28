<%-- 
    Document   : input
    Created on : Nov 1, 2016, 10:35:00 PM
    Author     : Jesse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <!-- 2.2.4 compiled and minified jQuery -->
        <title>Flooring Calculator</title>
    </head>
    <body>

        <h1> Software Guild Site Map</h1>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/luckySevens">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/tipCalc">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestCalc">Interest Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>
        <div class="container">
            <form class="form-horizontal" action="flooringCalc" method="POST">
                <div class="form-group"> 
                    <label class ="col-sm-2-offset col-sm-4" for="length">Length (in feet</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="length"> 
                    </div>
                    <label class ="col-sm-2-offset col-sm-4" for="width">Width (in feet)</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="width"> 
                    </div>
                    <label class ="col-sm-2-offset col-sm-4" for="matCost">Material Cost (per sq ft)</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="matCost"> 
                    </div>
                </div>
        
        <div>
            <input type="submit" value="Calculate">
        </div>

    </form>
        </div>
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>