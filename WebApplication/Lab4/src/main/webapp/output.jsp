<%-- 
    Document   : output
    Created on : Oct 27, 2016, 9:28:10 PM
    Author     : Jesse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Principal:  "${Principal}"
        <c:forEach items="${YearNumber}" begin = "0" end="5">
            Year: <c:out value="${YearNumber}"></c:out>
            Amount: <c:out value="${EndOfYearAmount}"></c:out>
            Interest: <c:out value="${YearlyInterest}"></c:out>
        </c:forEach>
    </body>
</html>
<!--        request.setAttribute("Principal", principal);
        request.setAttribute("InterestRate", rate);
        request.setAttribute("YearNumber", yearlyTotals.get(0));
        request.setAttribute("EndOfYearAmt", yearlyTotals.get(1));
        request.setAttribute("YearlyInterest", yearlyTotals.get(2));-->
