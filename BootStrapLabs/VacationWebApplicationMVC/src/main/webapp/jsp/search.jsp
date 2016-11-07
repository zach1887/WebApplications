<%-- 
    Document   : home
    Created on : Oct 30, 2016, 11:38:33 AM
    Author     : apprentice
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Vacation Log 2000-2016</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- SWC Icon -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="container">
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                </ul>    
            </div>
            <div class="row">
                <!-- where we're going to display -->
                <div class="col-md-6">
                    <h2>Search Results</h2>
                    <%@include file="vacationTableFragment.jsp" %>
                </div>
                <!-- where we're going to put our search form -->
                <div class="col-md-6">
                    <h2 >Search Trips</h2>
                    <form class="form-horizontal" role="form">
                        Trip Month: <input name="tripMonth" type="text" id="vacc-search-tripMonth" class="form-control"/><br/>
                        Trip Year:<input name="tripYear" type="text" id="vacc-search-tripYear" class="form-control"/><br/>
                        Destination City:<input name="destCity" type="text" id="vacc-search-destCity" class="form-control"/><br/>
                        Destination Country:<input name="destCountry" type="text" id="vacc-search-destCountry" class="form-control"/><br/>
                        Days Length:<input name="daysLength" type="text" id="vacc-search-daysLength" class="form-control" /><br/>
                        <button id="search-button" class="btn btn-default">Search Trip</button>
                    </form>
                </div>
            </div>
        <%@include file="detailModalFragment.jsp" %>
        <%@include file="editModalFragment.jsp" %>
        </div>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/vacation.js"></script>

</body>
</html>
