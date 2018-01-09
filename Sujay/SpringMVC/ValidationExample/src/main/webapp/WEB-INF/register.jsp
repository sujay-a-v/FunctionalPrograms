<%@page import="org.springframework.validation.ObjectError"%>
<%@ page import="com.bridgelabz.model.User" %>
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.err
{
color:red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<h2>Simple spring form handling</h2>
	<form:form action="register" method="POST" modelAttribute="user">
	Name:<form:input path="name"/><p><form:errors path="name" class="err"/></p><br>
Gender : Male<form:radiobutton name="gender" value="male" path="gender"/>   Female<form:radiobutton  name="gender" value="female" path="gender"/><p><form:errors path="gender"  class="err"/></p><br>
	Email : <form:input  path="email"/><p><form:errors path="email"  class="err"/></p><br>
	Languages : English<form:checkbox   value="english" path="language" /> French<form:checkbox  value="french" path="language"/> Tamil<form:checkbox  value="tamil" path="language"/><p><form:errors path="language"  class="err"/></p><br>
	Country : <form:select path="country">
					<form:option value="">select country</form:option>
					<form:option value="india">INDIA</form:option>
					<form:option value="usa">USA</form:option>
					<form:option value="china">CHINA</form:option>
				 </form:select>
				 <p><form:errors path="country" class="err"/></p>
				 
				<br>  
				Password:<form:password path="password"/><p><form:errors path="password" class="err"/></p><br>  
				<input type="submit" value="submit" />
	</form:form>
</body>
</html>