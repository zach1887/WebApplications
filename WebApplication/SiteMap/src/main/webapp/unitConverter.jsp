<%-- 
    Document   : input
    Created on : Nov 2, 2016, 2:50:08 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">-->

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <title>Unit Converter</title>
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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/interestCalc">Interest Calculator</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/jsp/flooringCalc">Flooring Calculator</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/jsp/unitConverter">UnitConverter</a></li>
                </ul>    
            </div>
        </div>

        <div class="container">
            <div class="row">
                <form class="form-horizontal" action="convertTemp" method="POST">

                    <div class="col-md-6">
                        <label for="tempInput" >Input </label>
                        <input type ="number" name="tempInput" />
                        <label for="tempFrom">From Temperature </label>
                        <select class="form-control" name="tempFrom">
                            <option value="Fahrenheit"> Fahrenheit</option>
                            <option value="Celsius"> Celsius</option>
                            <option value="Kelvin"> Kelvin</option>
                        </select>
                    </div>
                    <div class="col-md-6">  
                        <div> 
                            <label for="tempTo"> to Temperature </label>
                            <select class="form-control" name="tempTo">
                                <option value="Fahrenheit"> Fahrenheit</option>
                                <option value="Celsius"> Celsius</option>
                                <option value="Kelvin"> Kelvin</option>
                            </select>
                        </div>
                    </div>   

                    <input class="col-md-4-offset" type="submit" value="Calculate" />
                </form>
            </div>
            <div class="row">    
                <form class="form-horizontal" action="convertWeight" method="POST">

                    <div class="col-md-6">
                        <label for="weightInput" >Input </label>
                        <input type ="number" name="weightInput" />
                        <label for="weightFrom">From Weight </label>
                        <select class="form-control" name="weightFrom">
                            <option value="Kilogram"> Kilogram</option>
                            <option value="Gram"> Gram</option>
                            <option value="Pound"> Pound</option>
                            <option value="Ounce"> Ounce</option>
                        </select>
                    </div>
                    <div class="col-md-6">  
                        <div> 
                            <label for="weightTo"> to Weight </label>
                            <select class="form-control" name="weightTo">
                                <option value="Kilogram"> Kilogram</option>
                                <option value="Gram"> Gram</option>
                                <option value="Pound"> Pound</option>
                                <option value="Ounce"> Ounce</option>
                            </select>
                        </div>
                    </div>   


                    <input class="col-md-4-offset" type="submit" value="Calculate" />
                </form>
            </div>
            <div class="row">
                <form class="form-horizontal" action="convertCurrency" method="POST">    

                    <div class="col-md-6">
                        <label for="currencyInput" >Input </label>
                        <input type ="number" name="currencyInput" />
                        <label for="currencyFrom">From Currency </label>
                        <select class="form-control" name="currencyFrom">
                            <option value="USDollar"> US Dollar</option>
                            <option value="Euro"> Euro</option>
                            <option value="Yen"> Yen</option>
                        </select>
                    </div>
                    <div class="col-md-6">  
                        <div> 
                            <label for="currencyTo"> to Currency </label>
                            <select class="form-control" name="currencyTo">
                                <option value="USDollar"> US Dollar</option>
                                <option value="Euro"> Euro</option>
                                <option value="Yen"> Yen</option>
                            </select>
                        </div>
                    </div>   

                    <input class="col-md-4-offset" type="submit" value="Calculate"/>
                </form>
            </div>
            <div class="row">
                <form class="form-horizontal" action="convertDist" method="POST">

                    <div class="col-md-6">
                        <label for="distInput" >Input </label>
                        <input type ="number" name="distInput" />
                        <label for="distFrom">From Distance </label>
                        <select class="form-control" name="distFrom">
                            <option value="Centimeter"> Centimeter</option>
                            <option value="Meter"> Meter</option>
                            <option value="Inches"> Inches</option>
                            <option value="Feet"> Feet</option>
                        </select>
                    </div>
                    <div class="col-md-6">  
                        <div> 
                            <label for="distTo"> to Distance </label>
                            <select class="form-control" name="distTo">
                                <option value="Centimeter"> Centimeter</option>
                                <option value="Meter"> Meter</option>
                                <option value="Inches"> Inches</option>
                                <option value="Feet"> Feet</option>
                            </select>
                        </div>
                    </div>   


                    <input class="col-md-4-offset" type="submit" value="Calculate"/>
                </form>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    </body>
</html>
