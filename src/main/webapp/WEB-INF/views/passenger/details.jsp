<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Passenger Details</title>
</head>
<body>

	<form:form method="post" modelAttribute="passenger">
	<fieldset>
	<legend>Passenger Details</legend>
	
		<table style="background-color: #b3c6ff; margin: auto; padding: 30px; border-spacing: 20px; text-align: center;">

			<tr>
				<td>Passenger Name :</td>
				<td><form:input type="text" path="name"/></td>
			</tr>
			
			<tr>
				<td>Passenger Email :</td>
				<td><form:input type="text" path="email"/></td>
			</tr>
			
			<tr>
				<td>Phone Number</td>
				<td><form:input type="text" path="phone"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Enter Details"></td>
			</tr>
		
		</table>
	</fieldset>
	
	</form:form>

</body>
</html>