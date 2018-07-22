<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your wallet balance</title>
<style type="text/css">
.error{
	color: navy;
	font-weight: bold;
}
</style>
</head>
<body>
	<div align="center">
	<h3>Portal to view Balance </h3>
	<form:form action="viewBalance" method="post" modelAttribute="customer">
		<table>
			<tr>
				<td><b>Enter your mobile number : </b></td>
				<td><form:input  path="mobileNo" size="30" /></td>
				<td><form:errors  path="mobileNo" cssClass="error" /></td>
			</tr>
			<tr>
				
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
	</div>

</body>
</html>