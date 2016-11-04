<%-- 
    Document   : input
    Created on : Oct 27, 2016, 9:27:15 PM
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
        <title>Interest Calculator</title>
    </head>
    <body>
        <h1> Software Guild Site Map</h1>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/factorizer">Factorizer</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/luckySevens">Lucky Sevens</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/tipCalc">Tip Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/jsp/interestCalc">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>
        <div class="container">
            <form class="form-horizontal" action="InterestCalculator" method="POST">
                <div class="form-group"> 
                    <label class ="col-sm-2-offset col-sm-4" for="principal">Principal</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="principal"> 
                    </div>
                </div>
                <div class="form-group"> 
                    <label class ="col-sm-2-offset col-sm-4" for="rate">Interest Rate</label>
                    <div class="col-sm-6">
                        <input type="text" class="form-control" name="rate"> 
                    </div>
                    <div class="form-group"> 
                        <label class ="col-sm-2-offset col-sm-4" for="years">Number of Years</label>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" name="years"> 
                        </div>
                    </div>
                    <label class ="col-sm-2-offset col-sm-4" for="compounds">Number of Compounds</label>
                </div>
        </div>

        <div class="col-sm-6">
            <select if="compounds" class="form-control" name="compounds">
                <option value="year"> Yearly</option>
                <option value="quarter"> Quarterly</option>
                <option value="month"> Monthly</option>
                <option value="day"> Daily</option>
            </select>
        </div>
        <input type="submit" value="Calculate">

    </div>

</form>
<script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>
