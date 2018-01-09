<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>

<link href="register.css" rel="stylesheet" type="text/css">

<!-- <style>
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

button {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	margin: 8px 0;
	border: 1px;
	cursor: pointer;
	width: 100%;
}

body{
background: #b3ffff;
}

form {
width:100%

}

p.dotted {
border-style: dotted;
width: 100%;
box-sizing: border-box;
align:left;
}

a {
      text-decoration:none;
   }

fieldset {
	height:620px;
	width:35%;
	border: none;
	align:"center";
	left: 200px;
	right:200px;
	background: white;
	
}

function validateForm ()
 {
 var x =document.forms["reg"]["name"].value;
 if (x == "") 
	{ 
	alert("Name must be filled out");
	return false;
	}
}



</style>
 -->
 
 <script>
	function validateForm() {
		var pw1=document.forms["reg"]["password"].value;
		var pw2=document.forms["reg"]["confirmpassword"].value;
		
		if(pw1!=pw2)
			{
			alert("password miss match");
			return false;
			}
		
		var uname=document.forms["reg"]["name"].value;
		if(uname=="")
			{
			alert("Name can't be empty");
			}
		
	}

</script>
 
 
</head>
<body >
<div align="center">

	<form name="reg" action="Read" method="post" align="center" onsubmit="return validateForm()">
	<div align="center">
	<fieldset align="center">
		<div align="left">
			<h3>Create an Account</h3>
			<hr> </div>
		<div align="left">
			Enter your name<br /> 
			<input type="text" name="name" pattern="[A-Za-z]{1,}" required><br /> 
		</div>
		
		<div align="left">
			Enter your email<br /> 
			<input type="text" name="email" 
			 pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required><br /> 
		</div>
		
		<div align="left">
			Enter your password<br /> 
			<input type="password" name="password" required><br /> 
		</div>
		
		<div align="left">
			Confirm password<br /> 
			<input type="password" name="confirmpassword" required><br /> 
		</div>
		
		<p class="dotted"> By Clicking On The "create an account" bellow.
		you certify that you read have read and agree to our 
		 	<a href="#">terms of use </a> and 
		 	<a href="#">privacy policy </a>
		 </p>
		
		<div align="left">
		<button type="submit">Create an account</button>

		<p>Create an account?<a href="login.jsp">Sign in.</a></p>
		</div>
		
 		</fieldset>
	 </div>
	</form>
	</div>

</body>
</html>

