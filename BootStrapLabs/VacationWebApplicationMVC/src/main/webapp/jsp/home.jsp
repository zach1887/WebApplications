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
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                </ul>    
            </div>

            <div class="row">
                <!-- pet display table -->
                <div class="col-md-6">
                    <%@include file="vacationTableFragment.jsp" %>
                </div>
                <!-- our pet add form -->
                <div class="col-md-6">
                    <h2>Add a New Vacation </h2>
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="vacc-add-tripMonth" class="col-md-4 control-label">Month of Trip:</label>
                            <div class="col-md-8">
                                <input id="vacc-add-tripMonth" name="tripMonth" type="text" class="form-control" placeholder="Month" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="vacc-add-tripYear" class="col-md-4 control-label">Year of Trip:</label>
                            <div class="col-md-8">
                                <input id="vacc-add-tripYear" name="tripYear" type="text" class="form-control" placeholder="Year" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="vacc-add-destCity" class="col-md-4 control-label">Destination City</label>
                            <div class="col-md-8">
                                <input id="vacc-add-destCity" name="destCity" type="text" class="form-control" placeholder="City" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="vacc-add-destCountry" class="col-md-4 control-label">Destination Country</label>
                            <div class="col-md-8">
                                <input id="vacc-add-destCountry" name="destCountry" type="text" class="form-control" placeholder="Country" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="vacc-add-daysLength" class="col-md-4 control-label">Destination Country</label>
                            <div class="col-md-8">
                                <input id="vacc-add-daysLength" name="daysLength" type="text" class="form-control" placeholder="Length(Days)" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="vacc-add-tripOverseas" class="col-md-4 control-label">Overseas</label>
                            <div class="col-md-8">
                                <input id="vacc-add-tripOverseas" name="vacc-add-tripOverseas" type="checkbox" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="vacc-add-otherCities" class="col-md-4 control-label">Other Cities</label>
                            <div class="col-md-8">
                                <input id="vacc-add-otherCities" name="otherCities" type="text" class="form-control" placeholder="Other Cities" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" id="add-button" class="btn btn-default">Add Trip</button>
                            </div>
                        </div>                        
                    </form>
                    <!-- make a new div, to hold our add form field errors, make it RED w/ class alert, alert-danger, but don't show immediately w/ style display:none -->
                    <div id="validationErrors" class="alert alert-danger" style="display:none"></div>
                </div>
            </div>
        </div>

        <%@include file="detailModalFragment.jsp" %>
        <%@include file="editModalFragment.jsp" %>
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/vacation.js"></script>

</body>
</html>
