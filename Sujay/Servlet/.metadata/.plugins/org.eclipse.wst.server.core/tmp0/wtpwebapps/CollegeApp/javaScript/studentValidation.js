function validate()
{
	var name=document.form["student"]["stname"].value;
	var nameformat=/^[A-z]+$/;
	
	var mobile=document.form["student"]["mob"].value;
	var phoneno = /^\d{10}$/;
	
	var email=document.form["student"]["mail"].value;
	var mailformat = /^[a-zA-Z0-9]+@[a-zA-Z]+\\.com$/;
	
	if(name=="")
		{
			alert("Name can't be empty");
			return false;
		}
	else if(!nameformat.test(name))
		{
			alert("Please enter characters only");
			return false;
		}
	
	if(!mobile.match(phoneno))
		{
			alert("Enter the vlid number");
			return false;
		}
	
	if(email=="")
		{
			alert("please enter the email");
			return false;
		}
	else if(!email.test(mailformat))
		{
			alert("enter the valid email");
			return false;
		}
	
}