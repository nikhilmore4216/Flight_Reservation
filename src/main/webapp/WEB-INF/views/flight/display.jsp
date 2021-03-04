<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<form>
	<fieldset>
	<legend>Available Flights : </legend>
		<table style="background-color: #ffe6e6; margin: auto; padding: 30px; border-spacing: 20px; text-align: center;">
			<tr>
			<th>Airline</th>
			<th>Departure City</th>
			<th>Arrival City</th>
			<th>Departure Time</th>
			<th>Select</th>
			</tr>
			
			<c:forEach var="flight" items="${requestScope.flight_details}">
			<tr>
			<td>${flight.airlineName}</td>
			<td>${flight.depCity}</td>
			<td>${flight.arrivalCity}</td>
			<td>${flight.depTime}</td>
			<td><a href="<spring:url value='/passenger/details?flightId=${flight.flightId}'/>">select</a></td>
			</tr>
			</c:forEach>
		</table>
		</fieldset>
	</form>


</body>
</html>