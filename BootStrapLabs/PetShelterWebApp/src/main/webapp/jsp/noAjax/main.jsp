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
                	<li role="presentation" class="active"><a href="${pageContext.request.contextPath}/ajaxFree/home">No Ajax Home</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                	<li role="presentation"><a href="${pageContext.request.contextPath}/addPets">Add Random Pets</a></li>
                         <li role="presentation"><a href="${pageContext.request.contextPath}/ajaxFree/add">Add A Pet</a></li>
                </ul>    
            </div>
                        <c:forEach items="${petList}" var ="pet">
                            <s:url value="/ajaxFree/edit" var="editPetLink">
                                <s:param name="petId" value="${pet.petId}"></s:param>
                            </s:url>
                            
                            <s:url value="/ajaxFree/adopt" var="adoptPetLink">
                                <s:param name="petId" value="${pet.petId}"></s:param>
                            </s:url>
                            
                            ${pet.petName} - ${pet.petBreed} - <a href="${editPetLink}">Edit Pet</a>
                            - <a href="${adoptPetLink}">Adopt Pet</a> <br/>
                                
                        </c:forEach>
            <h2>Home Page</h2>
        </div>
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

    </body>
</html>

