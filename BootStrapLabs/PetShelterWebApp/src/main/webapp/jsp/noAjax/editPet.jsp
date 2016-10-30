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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/addPets">Add Random Pets</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajaxFree/add">Add A Pet</a></li>
                </ul>    
            </div>
            <div class=""col-lg-offset-3 col-lg-6>
                <h1> Edit Pet</h1>
                <form action ="/PetShelterWebApp/ajaxFree/edit" method="POST">
                    <input name = "petId" type="hidden" value ="${editThisPet.petId}" /><br/>
                    <input  type="text" name="petName" value="${editThisPet.petName}" /><br/>
                    <input  type="text" name="petBreed" value="${editThisPet.petBreed}" /><br/>
                    <input  type="text" name="petDisp" value="${editThisPet.disposition}" /><br>
                    <input  type="radio" name="vacc" value="si"
                            <c:if test="${editThisPet.vaccinated}"> checked="checked" </c:if> >Yes
                            <input  type="radio" name="vacc" value="no"
                            <c:if test="${!editThisPet.vaccinated}"> checked="checked" </c:if>> No
                    <input type="submit" value="Edit Pet" /> 
                </form>

            </div>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

