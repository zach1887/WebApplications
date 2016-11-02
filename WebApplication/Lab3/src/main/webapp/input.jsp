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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <!-- 2.2.4 compiled and minified jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Tip Calculator</title>
    </head>
    <body>
        <div class="container"> 
            <div class="col-sm-offset-0">
                <form class="form-horizontal" action="TipCalculator" method="POST">
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
    </body>
</html>
