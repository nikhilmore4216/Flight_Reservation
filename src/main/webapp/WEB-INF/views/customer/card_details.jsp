<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Card Details</title>
</head>
<body>
	<h4>${requestScope.message}</h4>
	<h4>${sessionScope.passenger_dtl}</h4>
	<form:form method="post" modelAttribute="card">
		<fieldset>
			<legend>Card Details</legend>

			<table
				style="background-color: #ffe6e6; margin: auto; padding: 30px; border-spacing: 20px; text-align: left;">

				<tr>
					<td>Card Type Name</td>
					<td><form:radiobuttons path="cardName"
							items="${requestScope.card_types}" /></td>
				</tr>
				<tr>
					<td>Enter card Number :</td>
					<td><form:input type="text" path="cardNo" /></td>
				</tr>

				<tr>
					<td>Expiry date</td>
					<td><form:input type="date" path="expDate" /></td>
				</tr>

				<tr>
					<td>CVV</td>
					<td><form:input type="text" path="cvv" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Send"></td>
				</tr>

			</table>
		</fieldset>

	</form:form>

</body>
</html>