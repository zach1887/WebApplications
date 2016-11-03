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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <!-- 2.2.4 compiled and minified jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Unit Converter</title>
    </head>
    <body>
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
    </body>
</html>
