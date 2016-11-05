<%-- 
    Document   : output
    Created on : Oct 27, 2016, 9:28:10 PM
    Author     : Jesse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
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
        Principal:  "${Principal}" <br/>

        <c:forEach items="${YearArray}" var = "data">
            <div class="col-sm-4">      
                ${data.yearNumber}
            </div>
            <div class="col-sm-4">
                <fmt:setLocale value="en_US"/>  
                <fmt:formatNumber type="currency" value ="${data.yearEndAmt}" />
            </div>
            <div class="col-sm-4">
                <fmt:setLocale value="en_US"/>  
                <fmt:formatNumber type="currency" value ="${data.yearlyInterest}" /> <br>
            </div>
        </c:forEach>
    </div>
</body>
</html>
