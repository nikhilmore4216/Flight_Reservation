<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post">
	<fieldset>
	<legend>Customer Log In</legend>
	
	<h3 style="color: red ">${requestScope.invalid_Msg}</h3>
	
			<table style="background-color: #b3fff0; margin: auto; padding: 30px; border-spacing: 20px; text-align: center;">
			<tr>
				<td>Enter Email :</td>
				<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="LOGIN"></td>
			</tr>
			
		
		</table>
	</fieldset>
	
	</form>

</body>
</html>