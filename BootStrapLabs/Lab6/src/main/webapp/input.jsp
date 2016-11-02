<%-- 
    Document   : input
    Created on : Nov 2, 2016, 2:50:08 PM
    Author     : apprentice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

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
            <div class="col-lg-4"> 
                <label for="TempFrom">Temperature </label>
                <select class="form-control" name="TempFrom">
                    <option value="Fahrenheit"> Fahrenheit</option>
                    <option value="Celsius"> Celsius</option>
                    <option value="Kelvin"> Kelvin</option>
                </select>
                </div>
            <div class="col-lg-4-offset col-lg-4"> 
            <label for="TempTo">Temperature </label>
                <select class="form-control" name="TempTo">
                    <option value="Fahrenheit"> Fahrenheit</option>
                    <option value="Celsius"> Celsius</option>
                    <option value="Kelvin"> Kelvin</option>
                </select>
            </div>

        <input type="submit" value="Calculate">

        </div>

</body>
</html>
