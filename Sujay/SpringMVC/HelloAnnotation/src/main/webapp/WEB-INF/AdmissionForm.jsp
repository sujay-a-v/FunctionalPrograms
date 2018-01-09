<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admission Form</title>
</head>
<body>

	<h2><%=request.getAttribute("message")%></h2>
	<h1>Strudent Admission Form</h1>
	
	<form:error path="student1.*"/>

	<form action="/HelloAnnotation/application" method="post">
	<table>
		<tr><td>Student name :</td><td> 	<input type="text" name="studentName" /></td></tr>
		<tr><td>Student Hobby :</td><td>	 <input type="text" name="studentHobby" /></td></tr>
		<tr><td>Student Mobile :</td><td>	 <input type="text" name="studentMobile" /></td></tr>
		
		<!-- <tr><td>Student DOB :</td><td>	 <input type="text" name="studentDOB" /></td></tr> 
		    -->
		
		<!-- <tr><td>Student Skills :</td><td>	 <select name="studentSkills">
								<option value="Core Java">Core Java</option>
								<option value="Spring Core">Spring Core</option>
								<option value="Spring MVC">Spring MVC</option>
								</select></td>
		</tr> -->
	</table>
		
	<table>
		<tr><td>Student Address Address</td></tr>
		
		<tr>
			<td>country: <input type="text" name="studentAddress.country"/></td>
			<td>city: <input type="text" name="studentAddress.city"/></td>
			<td>street: <input type="text" name="studentAddress.street"/></td>
			<td>pincode: <input type="text" name="studentAddress.pincode"/></td>
		</tr>

		<tr><td><input type="submit" value="Submit" /></td></tr>
	</table>

	</form>

</body>
</html>