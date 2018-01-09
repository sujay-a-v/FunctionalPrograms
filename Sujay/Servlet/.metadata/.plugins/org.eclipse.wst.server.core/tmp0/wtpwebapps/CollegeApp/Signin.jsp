<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LogIn page</title>
 <script type="text/javascript" src="javaScript/forgetpassword.js"></script>
<link href="cssFolder/login.css" rel="stylesheet" type="text/css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body >

<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); 
String error = (String) session.getAttribute("error");

if(error!=null || error!="")
{
	error=null;
%>

	<!-- <p>Email or Password wrong</p>  -->
	
	<!-- <script >
	alert("Email or Password wrong");
	</script> --> 
<%}

 %>

<!-- <div class="container"> -->
	<!-- <form name="loginpage" action="Verify" method="post"> -->
		<div align="center" >
			

				<div class="row" >
					<div class="col-sm-3"></div>
					<div class="col-sm-6" style="background-color:  #00ffff">
						<h3 align="left"><b>Sign In</b></h3>
						<hr >

						<div class="row">
							<div class="col-sm-6 vert">
								<h4 align="left"><b>Use other account</b></h4>
								<br>
								<p align="left" style="font-size:10">You can also sign in using Facebook account and Google
									account</p>
								<br>

								<button type="button" class="fbbutton" onclick="#">login using facebook</button>
								<br>

								<button type="button" class="gbutton">login using google</button>
								<br>

							</div>

							<div class="col-sm-6">

								<form name="loginpage" action="Verify" method="post">
								
								<h4 align="center"><b>Using your account</b></h4>
								<br> <input type="text" name="email"
									placeholder="enter ur email"> <br> <input
									type="password" name="Password" placeholder="enter ur password">
								<br> <input type="submit" value="Sign In"> <br>
								<!-- <a href="#" align="left">forgot password?</a><br> -->
								<a data-toggle="modal" data-target="#myModal" style="align:'left'">forgot password?    </a><br>
								<a href="Register.jsp">Register</a>

								</form> 
								
							</div>


						</div>


					</div>
					<div class="col-sm-3"></div>
				</div>
			</div>
		</div>
	
	<!-- </div> -->
	
	
	<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Forget Password</h4>
        </div>
        <!-- <form action="ForgetPW" method="post"> -->
        <div class="modal-body">
          <p>Enter your email</P>
          <input type="text" name="email" id="email">
        </div>
        <div class="modal-footer">
        
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="submit" class="btn btn-default" onclick="forget()" >submit</button>
          
        </div>
       <!--  </form> -->
      </div>
      
    </div>
  </div>
  
  <!-- Modal -->
  <div class="modal fade" id="myModal1" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
       
        <div class="modal-body">
          <p>your password .</p>
          
          <p ></p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
		
</body>
</html>