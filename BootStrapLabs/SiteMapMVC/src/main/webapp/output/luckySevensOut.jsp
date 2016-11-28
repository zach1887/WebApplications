<%-- 
    Document   : output.jsp
    Created on : Oct 23, 2016, 10:17:22 PM
    Author     : Jesse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lucky Sevens</title>
    </head>
    <body>
        ${msg}
        <h1>You're broke! </h1>
        <h2> Your money lasted for ${rollsUntilBroke} games.</h2>
        <h2> <c:if test= "${rollsAtHighest == 0}">
                Your winnings were never higher than your initial bet of ${startingBet}.
            </c:if> </h2>
        <c:if test= "${rollsAtHighest > 0}">
                Your winnings were at its highest at ${rollsAtHighest} when you had ${maximumAmountWon}.
            </c:if>
               

    </body>
</html>

