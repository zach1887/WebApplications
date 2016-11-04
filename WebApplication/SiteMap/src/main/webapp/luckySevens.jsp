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
        <title>Lucky Sevens</title>
    </head>
    <body>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/factorizer">Factorizer</a></li>
                    <li role="presentation"  class="active"><a href="${pageContext.request.contextPath}/jsp/luckySevens">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/tipCalc">Tip Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/interestCalc">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>

        <div class="container"> 
            <div class="col-sm-offset-2 col-sm-8">
                <form class="form-horizontal" action="LuckySevens" method="POST">
                    <div class="form-group"> 
                        <label class="control-label col-sm-2" for="name">How much do you feel like risking?</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" name="input" min="1" max = "100000">
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
