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
        <title>Interest Calculator</title>
    </head>
    <body>
        <form class="form-horizontal" action="InterestCalculator" method="POST">
            <div class="form-group"> 
                <label class ="col-sm-2-offset col-sm-4" for="principal">Principal</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="principal"> 
                </div>
                <label class ="col-sm-2-offset col-sm-4" for="rate">Interest Rate</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="rate"> 
                </div>
                <label class ="col-sm-2-offset col-sm-4" for="years">Number of Years</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" name="years"> 
                </div>
                <label class ="col-sm-2-offset col-sm-4" for="compounds">Number of Compounds</label>
                <div class="col-sm-4">
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
    </body>
</html>
