
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login</title>
<style>
	.error:active {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
		<h2>Enter Customer Details Here</h2>
		<table>
			<form:form action="registerCustomer" method="post" modelAttribute="customer" >
			<tr>
				<td> Name of the Customer:</td>
				<td><form:input path="name" size="30"/></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td>Phone Number : </td>
				<td><form:input path="mobileNo" size="30"/></td>
				<td><form:errors path="mobileNo" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td>Initial Balance : </td>
				<td><form:input path="wallet.balance" size="30"/></td>
				<td><form:errors path="wallet.balance" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Submit"/></td>
								
			</tr>
		</form:form>
		</table>
	
		
	</div>
</body>
</html>