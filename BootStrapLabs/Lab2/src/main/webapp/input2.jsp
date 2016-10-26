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
        <title>Lucky Sevens</title>
    </head>
    <body>
        <div class="container"> 
            <div class="col-sm-offset-2 col-sm-8">
                <form class="form-horizontal" action="LuckySevens" method="POST">
                    <div class="form-group"> 
                        <label class="control-label col-sm-2" for="name">How much do you feel like risking?</label>
                        <div class="col-sm-10">
                            <input type="number" class="form-control" name="input" min="1" max = "100000">
                        </div>
                    </div>
            </div>
        </div>
    </body>
</html>
