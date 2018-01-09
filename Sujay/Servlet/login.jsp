<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LogIn page</title>

<link href="login.css" rel="stylesheet" type="text/css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style >

/* hr{
background: black;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

input[type=submit] {
    background-color: #66ffff;
    color: white;
    padding: 10px 20px;
    margin: 8px 0;
    border: 1px;
    cursor: pointer;
    width: 100%;
}

 button {
	background-color:#0000ff;
	color: white;
	padding: 12px 20px;
	margin: 8px 0;
	border: 2px;
	cursor: pointer;
	width: 100%;
} 

.fbbutton {
	background-color:#0000ff;
	color: white;
	padding: 10px 20px;
	margin: 8px 0;
	border: 2px;
	cursor: pointer;
	width: 100%;
}

.gbutton {
	background-color:black;
	color: white;
	padding: 10px 20px;
	margin: 8px 0;
	border: 2px;
	cursor: pointer;
	width: 100%;
}

.vert{
border-right:  solid ;


}
 */
/* .par{
padding: 12px 20px;
width:100%;
} */
</style>

</head>
<body>
	<form action="#">
		<div align="center">
			

				<div class="row">
					<div class="col-sm-3"></div>
					<div class="col-sm-6">
						<h3 align="left"><b>Sign In</b></h3>
						<hr >

						<div class="row">
							<div class="col-sm-6 vert">
								<h4 align="left"><b>Use other account</b></h4>
								<br>
								<p align="left" style="font-size:10">You can also sign in using Facebook account and Google
									account</p>
								<br>

								<button type="button" class="fbbutton">login using facebook</button>
								<br>

								<button type="button" class="gbutton">login using google</button>
								<br>

							</div>

							<div class="col-sm-6">

								<h4 align="center"><b>Using your account</b></h4>
								<br> <input type="text" name="email"
									placeholder="enter ur email"> <br> <input
									type="password" name="Password" placeholder="enter ur password">
								<br> <input type="submit" value="Sign In"> <br>
								<a href="#" align="left">forgot password?</a><br>
								<a href="Register.jsp">Register</a>


							</div>


						</div>


					</div>
					<div class="col-sm-3"></div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>