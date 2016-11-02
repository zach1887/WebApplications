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
        <title>Tip Calculator</title>
    </head>
    <body>
        <div class="container"> 
            <div class="col-sm-offset-2 col-sm-8">
                <form class="form-horizontal" action="TipCalculator" method="POST">
                    <div class="form-group"> 
                        <label class="control-label col-sm-2" for="input">How much was the bill?</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" name="input" min="1" max = "10000">
                        </div>
                        <div class="form-group"> 
                            <label class="control-label col-sm-2" for="tipPct">How much would you like to tip (as a %)?</label>
                            <div class="col-sm-10">
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
