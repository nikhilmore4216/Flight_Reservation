<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Status</title>
</head>
<body>
	
	<h4>${requestScope.message}</h4>
	<h4>Booking Done With : ${sessionScope.passenger_dtl} </h4>

	
	<h3><a href="<spring:url value='/passenger/details'/>">Book new Passenger</a></h3>
	<h3><a href="<spring:url value='/customer/logout'/>">Log Out</a></h3>

</body>
</html>