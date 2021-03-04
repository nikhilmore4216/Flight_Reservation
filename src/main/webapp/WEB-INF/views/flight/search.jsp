<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Schedule</title>
</head>
<body>

<h2>Flight Schedule</h2>

<h3>Hello, ${sessionScope.cust_details.custName}</h3>
	
	

	<form action="<spring:url value='/flight/display'/>" method="get" >
		<fieldset>
		<h3>Select Departure City and Destination </h3>
		<h4>${requestScope.flight_details}</h4>
		<legend>Searching Flight... </legend>
			<table style="background-color: #ffd1b3; margin: auto; padding: 30px; border-spacing: 20px; text-align: center;">


				<tr>
					<td>Departure City (From) </td>
					<td>-<input type="text" name="depCity"></td>
				</tr>
				<tr>
					<td>Arrival City (To) </td>
					<td>-<input type="text" name="arrivalCity"></td>
				</tr>
				<tr>
					<td>Departure Date </td>
					<td>-<input type="date" value="2021-03-01" name="depDate"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Search Flight"></td>
				</tr>
			
			
			</table>
		</fieldset>
	</form>



</body>
</html>