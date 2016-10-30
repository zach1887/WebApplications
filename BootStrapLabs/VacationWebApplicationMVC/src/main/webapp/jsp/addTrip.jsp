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
                    <li role="presentation"><a href="${pageContext.request.contextPath}/home">Display</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/search">Search</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Stats</a></li>
                    <li role="presentation"><a href="${pageContext.request.contextPath}/stats">Add Test Data</a></li>
                    <li role="presentation" class="active"><a href="${pageContext.request.contextPath}/stats">Add New Trip</a></li>
                </ul>    
            </div>
        </div>
        <div class="col-lg-offset-3 col-lg-6">
            <h1> Add a new trip to the records:</h1>
            <form action ="" method="POST">
                <label for="tripMonth"> Month of Trip </label>
                <input type="text" name="tripMonth" /> <br/>
                <label for="tripYear"> Year of Trip </label>
                <input type="text" name="tripYear" /> <br/>
                <label for="destCity"> City of Destination </label>
                <input type="text" name="destCity" /> <br/>
                <label for="destCountry"> Country of Destination </label>
                <input type="text" name="destCountry" /> <br/>
                <label for="length"> Length in Days </label>
                <input type="text" name="length" /> <br/>
                <label for="overseas"> Was this trip overseas? </label>
                <input  type="radio" name="overseas" value="si" /> Yes
                <input  type="radio" name="overseas" value="no" /> No
                                <label for="length"> Other cities visited</label>
                <input type="text" name="otherCities" /> <br/>
            </form>
                <h1>Add Record Page</h1>
                </body>
                </html>
