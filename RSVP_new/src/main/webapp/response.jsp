<%-- 
    Document   : response
    Created on : Oct 20, 2016, 10:25:37 AM
    Author     : apprentice
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RSVP page</title>
    </head>
    <body>

        <h1><c:out value="${msgInABottle}" default="Great, man... you screwed up again!"/>
        </h1>
        <c:if test="${badInput}">
            <p> What's a matter... can't pick from two choices?  It's NOT THAT DAMN HARD! </p>
        </c:if>

        <c:if test="${!badInput}">
            <h1> These are the ones who have said yes so far </h1>
            <c:forEach items="${partyList}" var="person">
                ${person}
            </c:forEach>
        </c:if>
    </body>
</html>
