function validateForm() {
		var password1=document.forms["reg"]["password"].value;
		var password2=document.forms["reg"]["confirmpassword"].value;
		var passwordLength=  /^[A-Za-z0-9]{6,14}$/;
		
		var uname=document.forms["reg"]["name"].value;
		var nameformat=/^[A-z]+$/;
		var email=document.forms["reg"]["email"].value;
		var moblile=document.forms["reg"]["mob"].value;
		var phoneno = /^((\+)?(\d{2}[-]))?(\d{10}){1}?$/;
		var mailformat = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/; 
		var emailValidation=/^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$/;
		var isValid=true;

		if(uname=="")
		{
		alert("Name can't be empty");
		return false;
		}
		if(!nameformat.test(uname) )
		 {
			alert("please enter char only");
			return false;
		}
		console.log("inside");
		 if(!emailValidation.test(email))
		{
				console.log("email fails");
			alert("wrong Email pattern");
			return false;
		}  
		if(!passwordLength.test(password1))
			{
				alert("password should be 6 to 14 chars");
				return false;
			}
		if(password1!=password2)
		{
		alert("password miss match");
		return false;
		} 
		
		if(!phoneno.test(moblile))
		{
			alert("enter the valid mobile number");
			return false;
		}
	/* if(isvalid==false) {
		return false;
	} */
 }