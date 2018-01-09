<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Page</title>
<style>
	    .error {
	        color: red; font-weight: bold;
	    }
	    #register{
	    align:center;
	    }
	</style>
</head>
<body>

	<div id="register" align="center">
		<table>
		<form:form action="Abc" commandName="userForm" method="post">
			<tr><td>Name : </td>
				<td><form:input path="userName" size="30"/> </td>
				<td><form:errors path="userName" cssClass="error"/></td>
			</tr>
			<tr><td>Hobby : </td>
				<td><form:input path="userEmail" size="30"/> </td>
				<td><form:errors path="userEmail" cssClass="error"/></td>
			</tr>
			<tr><td>Mobile : </td>
				<td><form:input path="userPassword" size="30"/> </td>
				<td><form:errors path="userPassword" cssClass="error"/></td>
			</tr>
			<tr><td>Email : </td>
				<td><form:input path="userContact" size="30"/> </td>
				<td><form:errors path="userContact" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Register"/></td>
			</tr>
			
		</form:form>
		</table>
	</div>

</body>
</html>