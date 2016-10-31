<%-- 
    Document   : main
    Created on : Oct 30, 2016, 12:00:18 PM
    Author     : apprentice
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vacation Log 2000-2016</title>
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    </head>
    <body>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajaxFree/home">Display</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/addTest">Add Test Data</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/ajaxFree/add">Add New Trip</a></li>
                </ul>    
            </div>

            <c:forEach items="${tripList}" var="trip">
                <s:url value="edit" var="editTripLink">
                    <s:param name="tripId" value="${trip.tripId}"></s:param>
                </s:url>

                ${trip.yearOfTrip} - ${trip.destCountry} - <a href="${editTripLink}">Edit Trip</a> <br/>
            </c:forEach>
        </div>
    </body>
</html>
