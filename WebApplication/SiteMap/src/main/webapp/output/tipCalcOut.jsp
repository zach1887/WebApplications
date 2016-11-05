<%-- 
    Document   : output.jsp
    Created on : Oct 23, 2016, 10:17:22 PM
    Author     : Jesse
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tip Calculator</title>
    </head>
    <body>

        <c:if test="${!badInput}">
        <h2> Original Bill                            ${BillPreTip}</h2>
        <h2> Tip Percent                              ${TipPercent}</h2>
        <h2> Tip Amount                               ${TipAmount}</h2>
        <h2> Total Bill                               ${TotalAmount}</h2>

            </c:if>
               

    </body>
</html>

