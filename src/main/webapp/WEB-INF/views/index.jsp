<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--import spring supplied JSP tag lib for URL rewriting  -->
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Reservation</title>
</head>
<body>
<h1 style="color: red; text-align: center">WELCOME</h1>

<h3 style= "text-align: center"><a href= "<spring:url value='/customer/login'/>" >User Login</a></h3>
</body>
</html>