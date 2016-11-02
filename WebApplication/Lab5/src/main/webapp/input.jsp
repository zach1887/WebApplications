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
        <title>Flooring Calculator</title>
    </head>
    <body>
        <form class="form-horizontal" action="FlooringCalculator" method="POST">
            <div class="form-group"> 
                <label class ="col-sm-2-offset col-sm-4" for="length">Length (in feet</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="length"> 
                </div>
                <label class ="col-sm-2-offset col-sm-4" for="width">Width (in feet)</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="width"> 
                </div>
                <label class ="col-sm-2-offset col-sm-4" for="matCost">Material Cost (per sq ft)</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="matCost"> 
                </div>
                <input type="submit" value="Calculate">
                
            </div>

        </form>
    </body>
</html>