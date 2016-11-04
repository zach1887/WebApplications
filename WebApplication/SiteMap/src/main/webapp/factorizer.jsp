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
        <!-- 2.2.4 compiled and minified jQuery -->
        <title>Factorizer</title>
    </head>


    <body>

        <h1> Software Guild Site Map</h1>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/factorizer">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/luckySevens">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/tipCalc">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/interestCalc">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>
        <div class="container"> 
            <div class="col-sm-offset-2 col-sm-8">
                <form class="form-horizontal" action="Factorizer" method="POST">
                    <div class="form-group"> 
                        <label class="control-label col-sm-2" for="name">Select a number to factor</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="input">
                        </div>
                        <button type ="submit" text="Factor!"></button>
                    </div>
                    </form>

            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
