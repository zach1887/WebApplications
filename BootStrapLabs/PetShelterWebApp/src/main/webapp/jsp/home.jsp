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
            <h1> Pets available for Adoption</h1>
            <hr/>
            <div class="navbar">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/home">Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/ajaxFree/home">No Ajax Home</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                </ul>   
                <div class="row">
                    <!-- pet Display table -->
                    <div class="col-md-6">
                        <%@include file="petTableFragment.jsp" %>
                    </div>
                    <div class="col-md-6">
                        <form class="form-horizontal" role="form"> 
                            <div class="form-group">
                                <label for="add-pet-name" class="col-md-4 control-label">Pet Name: </label>
                                <div class="col-md-8">
                                    <input id="add-pet-name" name="petName" type="text" class="form-control" placeholder="PetName"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-pet-breed " class="col-md-4 control-label">Pet Breed: </label>
                                <div class="col-md-8">
                                    <input id="add-pet-breed" name="petBreed" type="text" class="form-control" placeholder="PetBreed"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-pet-disp " class="col-md-4 control-label">Pet Disposition: </label>
                                <div class="col-md-8">
                                    <input id="add-pet-disp" name="petDisp" type="text" class="form-control" placeholder="PetDisp"/>
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="add-pet-vaccinated " class="col-md-4 control-label">Pet Vaccinated: </label>
                                <div class="col-md-8">
                                    <input id="add-pet-vaccinated" name="petVacc" type="checkbox" class="form-control" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-offset-4 col-md-8">
                                    <button type="submit" id="add-button" class="btn btn-default"> Add Pet Record </button>
                                </div>
                            </div>
                        </form>
                        <div id="validationErrors" class = "alert alert-danger" style="display:none"</div>
                    </div>
                </div>


            </div>
        </div>
    </div>

    <%@include file="detailModalFragment.jsp" %>
    <%@include file="editModalFragment.jsp" %>



</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/petShelter.js"></script>

</body>
</html>

