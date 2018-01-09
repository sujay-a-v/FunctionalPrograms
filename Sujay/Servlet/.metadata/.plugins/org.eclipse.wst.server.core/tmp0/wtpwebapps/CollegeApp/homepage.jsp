<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <script type="text/javascript" src="javaScript/studentValidation.js"></script> -->

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Homepage</title>
 <script type="text/javascript" src="javaScript/branchDetails.js"></script>
<link href="cssFolder/homepages.css" rel="stylesheet" type="text/css">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

	<meta name="viewport" content="width=device-width, initial-scale=1"> 
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  
  <style type="text/css">
  	#card{
		 	top:35px;
		    align:"center";
		    
		    width: 400px;
		    height: 200px;
		    font-size: 15px;
		    }
  
  </style>
  
<script type="text/javascript">
 
function validateForm() {

		var uname=document.forms["student"]["stname"].value;
		var nameformat=/^[A-z]+$/;
		var email=document.forms["student"]["mail"].value;
		var moblile=document.forms["student"]["mob"].value;
		var phoneno = /^((\+)?(\d{2}[-]))?(\d{10}){1}?$/;
		var mailformat = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; 
		var emailValidation=/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
		var isValid=true;

		if(!nameformat.test(uname) )
		 {
			alert("please enter char only");
			isValid =false;
		}
		console.log("inside");
		 if(!emailValidation.test(email))
		{
				console.log("email fails");
			alert("wrong Email pattern");
			isValid =false;
		}  
		
		if(!phoneno.test(moblile))
		{
			alert("enter the valid mobile number");
			isValid= false;
		}
	 if(isValid==false) {
		return false;
	} 
} 
 
</script>
  
</head>

<body>
<%
response.setHeader("Cache-Control", "no-cache");
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setDateHeader("Expires", 0); 
String name = (String) session.getAttribute("name");

if(name==null || name=="")
{
	response.sendRedirect("Signin.jsp");
	/* session.invalidate(); */
}

 %>

	<nav class="navbar navbar-default">
	  <div class="container-fluid" id="navbar">
		    <div class="navbar-header">
		      <h3>WELCOME</h3>
		    </div>
		    
		    <ul class="nav navbar-nav navbar-right">
		      <li><a><%=session.getAttribute("name")%></a></li>
		       <li><a href="#" align="right"></a></li>
		     
		     <li><a href="LogOut"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li> 
		      <li><a href="#" align="right"></a></li>
		    </ul>
	  </div>
	</nav>
	
	<div class="headpre" align="center">
	<h2>COLLEGE APP</h2>
    </div>

		<div class="row">
		
			<div class="col-sm-1"></div>
		
			<div class="col-sm-3 vert" id="ece"   style="background-color:yellow;">
			  <div class="cont" >
				<h align="center"><b>ECE</b></h><br><br>
				<p style="font-style: italic;">You can view the details of Students they are
				 present in the ECE Deportment<p><br>
				<button type="button" name="csbtn" class="btn" 
				onclick="displayBranch('ECE')">View Detailes</button>
			  </div>
			</div>
			<div class="col-sm-1"></div>
			
			<div class="col-sm-3" id="ece" style="background-color:pink;">
				<h align="center"><b>IT</b></h><br><br>
				<p style="font-style: italic;">You can view the details of Students they are
				 present in the IT Deportment<p><br>
				<button type="button" name="csbtn" class="btn"
				onclick="displayBranch('IT')">View Detailes</button>
			</div>
			<div class="col-sm-1"></div>
			
			 <div class="col-sm-3" id="ece"  style="background-color:yellow;">
				<h align="center"><b>COMP</b></h><br><br>
				<p style="font-style: italic;">You can view the details of Students they are
				 present in the COMP Deportment<p><br>
				<button type="button" name="csbtn" class="btn" 
				onclick="displayBranch('CSE')">View Detailes</button>
			</div>  
		</div>

	<br><br><br><br><br><br>
	
	<div class="row">
	<div class="col-sm-9"></div>
	<div class="col-sm-1">
	<!-- Trigger the modal with a button -->
  <button type="button" class="btn btn-info btn-lg" id="addbtns" data-toggle="modal" data-target="#myModal">
  Add</button>
  </div>
  </div>
  
  

  <!-- add Modal -->
  <div class="modal fade"  id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Add new Student</h4>
        </div>
        <div class="modal-body">
         	
         	<div class="addtable" align="center">
    	<!-- 
    	<h3>Add new Student </h3>
    	 -->
    	 
    	 			<form class="form-horizontal" action="newStudent" method="post" name="student" onsubmit="return validateForm()" >
    	 					 <div class="form-group">
							      <label class="control-label col-sm-3" for="name">Name:</label>
							      <div class="col-sm-6">
							      	<!-- <div class="form-control"> -->
							        <input type="text" name="stname" placeholder="Enter the name" required>
							        <!-- </div> -->
							      </div>
						   </div>
						   
						    <div class="form-group">
							      <label class="control-label col-sm-3" for="mobile">Mobile:</label>
							      <div class="col-sm-6">
							      	<!-- <div class="form-control"> -->
							        <input type="text" name="mob" placeholder="XXXXXXXXXX"  required>
							        <!-- </div> -->
							      </div>
						   </div>
						   
						   <div class="form-group">
							      <label class="control-label col-sm-3" for="email">Email:</label>
							      <div class="col-sm-6">
							      		<!-- <div class="form-control"> -->
							        <input type="text" name="mail" placeholder="ex-email@gmail.com"
		    								required>
		    							<!-- 	</div> -->
							      </div>
						   </div>
						   
						   <div class="form-group">
							      <label class="control-label col-sm-3" for="stream">Stream:</label>
							      <div class="col-sm-6">
							       		 <select name="stream" class="form-control" placeholder="select">
								    			<option value="ECE">ECE</option>
								    			<option value="IT">IT</option>
								    			<option value="CSE">Comp</option>
								    		</select>
							      </div>
						   </div>
						   
					<div class="modal-footer">	   
		    		<button type="button" class="btn btn-default" id="cls" data-dismiss="modal" style="align=right">Close</button>
         
	    			<!-- <input type="submit" value="Add"> -->
	    			<button type="submit" class="btn btn-default" id="addbtn" style="background: green" style="width=2px">Save</button>
	    		</div>
	    	</form> 
         	
        </div>
        
      </div>
      </div>
    </div>
    </div>
    </div>
 
  
  			
				 <!-- display the studentlist Modal -->
				  <div class="modal fade" id="myModal1" role="dialog">
				    <div class="modal-dialog">
				    
				      <div class="modal-content" id="abc">
				        <div class="modal-header"  id="branch-title">
				          <button type="button" class="close" data-dismiss="modal">&times;</button>
				          <h4 class="modal-title"></h4>
				        </div>
				        <div class="modal-body" id="tablecnt">
				          <p></p>
				        </div>
				        <div class="modal-footer">
				          <!-- <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
				           <button type="button" id="cls1" class="btn btn-default" data-dismiss="modal" style="align:right">Close</button>
				        </div>
				      </div>
				      
				    </div>
				  </div>
		
			<div class="container">
			 <!--  <h2>Modal Example</h2>
			  Trigger the modal with a button
			  <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button> -->
			
			  <!-- Editing Modal -->
			  <div class="modal fade" id="editModal" role="dialog">
			    <div class="modal-dialog">
			    
			   <!--  <form class="form-horizontal" action="EditedData" method="post"> -->
			    
			      <!-- Modal content-->
			      <div class="modal-content2">
			        <div class="modal-header">
			         
			          <h4 class="modal-title">Edit student details</h4>
			        </div>
			        <div class="modal-body">
			         <!--  <p>Some text in the modal.</p> -->
			         	<div class="form-group">
						      <label class="control-label col-sm-3" for="name">S-id:</label>
						      <div class="col-sm-5">
						        <input type="text" id="sidEdit" name="sid" disabled="disabled"> 
						      </div>
						   </div><br>
			         
				          <div class="form-group">
						      <label class="control-label col-sm-3" for="name">Name:</label>
						      <div class="col-sm-5">
						        <input type="text" id="nameEdit" name="stname"> 
						      </div>
						   </div><br>
				          
			          
						         <!--  <div class="row">
						          <div class="col-sm-1"></div>
						          <div class="col-sm-3" align="right">Name:</div>
						          <div class="col-sm-5" id="nameEdit"><input type="text" name="stname" required></div>
						          <div class="col-sm-3"></div>
						          </div> -->
			          
			           <div class="form-group">
					      <label class="control-label col-sm-3" for="mobile">Mobile_No:</label>
					      <div class="col-sm-5">
					        <input type="text" name="mob" id="mobEdit" pattern="[0-9]{10,10}">
					      </div>
					   </div><br>
			          
			          <div class="form-group">
					      <label class="control-label col-sm-3" for="email">Email:</label>
					      <div class="col-sm-5">
					        <input type="text" name="mail" id="emailEdit"
		    					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required>
					      </div>
					   </div>
			          <br>
			          
			          <div class="form-group">
					      <label class="control-label col-sm-3" for="stream">Stream:</label>
					      <div class="col-sm-8">
					        <select name="stream" id="branchEdit" placeholder="select">
								    			<option value="ECE">ECE</option>
								    			<option value="IT">IT</option>
								    			<option value="CSE">Comp</option>
								    			</select>
					      </div>
					   </div>  
			          
			            <!-- <div class="form-group">
					     < <label class="control-label col-sm-3" for="uid">UID:</label>
					      <div class="col-sm-5">
					        <input type="text" name="usn" required>
					      </div> 
					   </div><br>   -->
			             
			       </div> 
			        
			        <div class="modal-footer">
			        <button type="button" class="btn btn-default" id="cls" data-dismiss="modal" style="align=right">Close</button>
			         <!--  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
			          <button type="submit" class="btn btn-default" id="addbtn"
			           style="background: green" style="width:2px" data-target="#editModal" onclick="afterEdit()" >Submit</button>
			        </div>
			      
			      
			      </div> 
			    </div>
			  </div>
			  
			</div>
</body>
</html>