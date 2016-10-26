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
        <title>Factors</title>
    </head>
    <body>
        <h1>Factors of ${providedNumber} </h1>
        <h2> "$numFactors}"
        <c:forEach items="${listOfFactors}" var="factor"> 
            ${factor} 
        </c:forEach>
        <c:if test="${isPrime}">
            <h1>   ${providedNumber} is a PRIME Number.
        </c:if>
        <c:if test="!${isPrime}">
            <h1>   ${providedNumber} is not a Prime Number.
        </c:if>
        <c:if test="${isPerfect}">
            <h1>   ${providedNumber} is a PERFECT Number.
        </c:if>
        <c:if test="!${isPerfect}">
            <h1>   ${providedNumber} is not a perfect Number.
        </c:if> 

    </body>
</html>

