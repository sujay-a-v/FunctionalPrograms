<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>

<link href="cssFolder/reg.css" rel="stylesheet" type="text/css">
<link href="register.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="javaScript/passwordmatch.js"></script>
 
</head>
<body >
<div align="center">

	<form name="reg" action="Read" method="post" align="center"  onsubmit="return validateForm()" >
	<div align="center">
	<fieldset align="center">
		<div align="left">
			<h3>Create an Account</h3>
			<hr> </div>
		<div align="left" >
			Enter your name<br /> 
			<input type="text" name="name" required><br /> 
		</div>
		
		<div align="left">
			Enter your email<br /> 
			<input type="text" name="email" 
			 required><br /> 
		</div>
		
		<div align="left">
			Enter your password<br /> 
			<input type="password" name="password"  required title="6 to 12 characters"><br /> 
		</div>
		
		<div align="left">
			Confirm password<br /> 
			<input type="password" name="confirmpassword"  required title="6 to 12 characters"><br /> 
		</div>
		
		<div align="left">
			Enter User Mobile_Number<br /> 
			<input type="number" name="mob" required><br /> 
		</div>
		
		<p class="dotted"> By Clicking On The "create an account" bellow.
		you certify that you read have read and agree to our 
		 	<a href="#">terms of use </a> and 
		 	<a href="#">privacy policy </a>
		 </p>
		
		<div align="left">
		<button type="submit">Create an account</button>

		<p>Create an account?<a href="Signin.jsp">Sign in.</a></p>
		</div>
		
 		</fieldset>
	 </div>
	</form>
	</div>
	
	

</body>
</html>