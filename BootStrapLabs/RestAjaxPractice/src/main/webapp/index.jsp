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
    <title>Vacation Log 2000-2016</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- SWC Icon -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/icon.png">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
    <body>
        <div class="container">
            <h1 id=""llama">filler</h1>
            <input type="text" id="llamaName" />
            <button id="makeLlama">Make Llama </button>
            
            <br/>
            
            <button id="getAllLlamas">GET DA LLAMAS</button>
            <div id="llamaHerd"></div>
        </div>
        
        
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/js/sandbox.js"></script>
        <script src="${pageContext.request.contextPath}/js/PlayPen.js"></script>
    </body>
</body>
</html>
