<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pet Shelter Extraordinaire Web Application</title>
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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/ajaxFree/home">No Ajax Home</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                </ul>    
            </div>
            <div class="row">
                <div class=""col=-md-6">
                    <h2> Search Pets</h2>
                    <%@include file="petTableFragment.jsp" %>
                    <form class="form-horizontal" role="form">
                        Pet Name: <input name="petName" type="text" id="search-pet-name" class="form-control" /><br/>
                        Pet Breed: <input name = "petBreed" type="text" id="search-pet-breed" class="form-control" /><br/>
                        Disposition: <input name = "petDisposition" type="text" id="search-pet-disp" class="form-control" /><br/>
                        Vaccinated: <input name = "petVacc" type="checkbox" id="search-pet-vacc" class="form-control" /><br/>
                        <button id="search-button" class=""btb btn-default">Search Pets</button>


                    </form>
                </div>
            </div>
        </div>
        <%@include file="detailModalFragment.jsp" %>
        <%@include file="editModalFragment.jsp" %>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/petShelter.js"></script>

    </body>
</html>

