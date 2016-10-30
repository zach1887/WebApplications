<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/addPets">Add Random Pets</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajaxFree/add">Add A Pet</a></li>
                </ul>    
            </div>
            <div class ="col-lg-offset-3 col-lg-6">
                <h1>Edit Pet Record:</h1>
                <sf:form modelAttribute="editThisPet" action ="/PetShelterWebApp/ajaxFree/editWithSpring" method="POST">
                    Name:<sf:input type = "text" path="petName" placeholder="PetName"></sf:input><br/>
                    Breed:<sf:input type = "text" path="petBreed" placeholder="Pet Breed"></sf:input><br/>
                    Disposition:<sf:input type = "text" path="disposition" placeholder="Disposition"></sf:input><br/>
                    Vaccinated?<sf:checkbox path="vaccinated" /><br/>
                    <sf:hidden path="petId" />
                    <button type="submit">Edit Pet</button>
                </sf:form>
                </div>
                <!-- Placed at the end of the document so the pages load faster -->
                <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
                <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

        </body>
    </html>

