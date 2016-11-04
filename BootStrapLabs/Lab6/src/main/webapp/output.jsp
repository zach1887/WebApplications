<%-- 
    Document   : output
    Created on : Nov 2, 2016, 3:08:10 PM
    Author     : apprentice
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> <c:if test= "${OutputField == 'Temperature'}">
           ${initialValue} degrees ${FromField} 
           is equivalent to <fmt:formatNumber pattern="##.##" value = "${convertedValue}" /> degrees ${ToField}.
            </c:if></h2>
           
        <h2> <c:if test= "${OutputField == 'Weight'}">
           ${initialValue} ${FromField} 
           is equivalent to <fmt:formatNumber pattern="##.##" value = "${convertedValue}" />  ${ToField}.
            </c:if></h2>
           
        <h2><c:if test= "${OutputField == 'Currency'}">
           ${initialValue} ${FromField} 
           is equivalent to <fmt:formatNumber pattern="##.##" value = "${convertedValue}" />  ${ToField}.
        </c:if></h2>
           
        <h2><c:if test= "${OutputField == 'Distance'}">
           ${initialValue} ${FromField} 
           is equivalent to <fmt:formatNumber pattern="##.##" value = "${convertedValue}" />  ${ToField}.
        </c:if></h2>
           
    </body>
</html>
