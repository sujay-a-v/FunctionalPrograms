<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

 <h2>Hello</h2>
 <h2>Welcome ${userForm.email}! You have logged in successfully.</h2>
 <%-- <h2>Welcome <%=((User)request.getAttribute("userForm")).getEmail() %> You have logged in successfully.</h2> --%>
 <%-- <h2> <% ((User) request.getAttribute("userForm")).getEmail() %> </h2> --%>
</body>
</html>