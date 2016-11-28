<%-- 
    Document   : Input
    Created on : Oct 25, 2016, 3:26:18 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <title>Tip Calculator</title>
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
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/tipCalc">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestCalc">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>
        <div class="container"> 
            <div class="col-sm-offset-0">
                <form class="form-horizontal" action="tipCalc
                      " method="POST">
                    <div class="form-group"> 
                        <label class="control-label col-sm-6" for="input">How much was the bill?</label>
                        <div class="col-sm-2">
                            <input type="number" class="form-control" name="input" min="1" max = "10000">
                        </div>
                        <div class="form-group"> 
                            <label class="control-label col-sm-6" for="tipPct">How much would you like to tip (as a %)?</label>
                            <div class="col-sm-2">
                                <input type="text" class="form-control" name="tipPct">
                            </div>
                        </div>
                        <input type="submit" value = "Calculate">
                    </div>
                </form>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
