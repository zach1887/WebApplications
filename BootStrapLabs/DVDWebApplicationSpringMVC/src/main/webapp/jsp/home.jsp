<%-- 
    Document   : home
    Created on : Oct 30, 2016, 3:13:14 PM
    Author     : apprentice
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DVD Catalog</title>
        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
        
        <!-- SWC Icon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">

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
                    <h2 >DVD Catalog</h2>
                    <%@include file="dvdTableFragment.jsp" %>
                </div>
                <!-- our pet add form -->
                <div class="col-md-6">
                    <form class="form-horizontal" role="form">
                        <div class="form-group">
                            <label for="dvd-add-title" class="col-md-4 control-label">DVD Title:</label>
                            <div class="col-md-8">
                                <input id="dvd-add-title" name="dvdTitle" type="text" class="form-control" placeholder="Title" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="dvd-add-year" class="col-md-4 control-label">Release Year:</label>
                            <div class="col-md-8">
                                <input id="dvd-add-year" name="releaseYear" type="text" class="form-control" placeholder="Year" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="dvd-add-rating" class="col-md-4 control-label">MPAA Rating:</label>
                            <div class="col-md-8">
                                <input id="dvd-add-rating" name="rating" type="text" class="form-control" placeholder="Rating" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="dvd-add-director" class="col-md-4 control-label">Director:</label>
                            <div class="col-md-8">
                                <input id="dvd-add-director" name="director" type="text" class="form-control" placeholder="Director" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="dvd-add-studio" class="col-md-4 control-label">Studio:</label>
                            <div class="col-md-8">
                                <input id="dvd-add-studio" name="studio" type="text" class="form-control" placeholder="Studio" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="dvd-add-comments" class="col-md-4 control-label">Comments:</label>
                            <div class="col-md-8">
                                <input id="dvd-add-comments" name="comments" type="text" class="form-control" placeholder="Comments" />
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-md-offset-4 col-md-8">
                                <button type="submit" id="add-button" class="btn btn-default">Add Record</button>
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
        <script src="${pageContext.request.contextPath}/js/dvdLibrary.js"></script>

    </body>
</html>
