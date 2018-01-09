<%@page import="com.bridgelabz.model.Student"%>
<html>
<body>
	
	<h2><%=request.getAttribute("message")%></h2>
	
	<h1>Congratulations !!</h1>

	<table>
		<tr>
			<td>Student Name:</td>
			<td><%=((Student)request.getAttribute("student1")).getStudentName()%></td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td><%=((Student)request.getAttribute("student1")).getStudentHobby()%></td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td><%=((Student)request.getAttribute("student1")).getStudentMobile()%></td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td><%=((Student)request.getAttribute("student1")).getStudentDOB()%></td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			 <td><%=((Student)request.getAttribute("student1")).getStudentSkills()%></td> 
		</tr>
		
		<tr>
			<td>Student Address :</td>
			<td>Country:<%=((Student)request.getAttribute("student1")).getStudentAddress().getCountry()%>
				city:<%=((Student)request.getAttribute("student1")).getStudentAddress().getCity()%>
				street:<%=((Student)request.getAttribute("student1")).getStudentAddress().getStreet()%>
				pincode:<%=((Student)request.getAttribute("student1")).getStudentAddress().getPincode()%>
			</td>
		</tr>
	</table>
</body>
</html>