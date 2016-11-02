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
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <!-- 2.2.4 compiled and minified jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <title>Interest Calculator</title>
    </head>
    <body>
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
    </body>
</html>
