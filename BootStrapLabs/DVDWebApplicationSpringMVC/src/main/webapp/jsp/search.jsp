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
                	<li role="presentation" ><a href="${pageContext.request.contextPath}/home">Home</a></li>
                	<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                </ul>    
            </div>
         <div class="row">
                <!-- where we're going to display -->
                <div class="col-md-6">
                    <h2 >Search Results</h2>
                    <%@include file="dvdTableFragment.jsp" %>
                </div>
                <!-- where we're going to put our search form -->
                <div class="col-md-6">
                    <h2>Search Collection</h2>
                    <form class="form-horizontal" role="form">
                        DVD Title:<input name="dvdTitle" type="text" id="dvd-search-title" class="form-control"/><br/>
                        Year:<input name="dvdYear" type="text" id="dvd-search-year" class="form-control"/><br/>
                        MPAA Rating:<input name="dvdRating" type="text" id="dvd-search-rating" class="form-control" /><br/>
                        Director:<input name="dvdDirector" type="text" id="dvd-search-director" class="form-control" /><br/>
                        Studio:<input name="dvdStudio" type="text" id="dvd-search-studio" class="form-control" /><br/>
                        <button id="search-button" class="btn btn-default">Search DVDs</button>
                    </form>
                </div>
            </div>

        </div>

        <%@include file="detailModalFragment.jsp" %>
        <%@include file="editModalFragment.jsp" %>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/dvdLibrary.js"></script>

    </body>
</html>
