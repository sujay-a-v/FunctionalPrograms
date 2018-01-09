package com.bridgelabz.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MobilenumberValidator implements ConstraintValidator<IsMobileNumberValid, String> {

	@Override
	public void initialize(IsMobileNumberValid mobileNumberValid) {
	
	}

	@Override
	public boolean isValid(String mobileNumber, ConstraintValidatorContext context) {
		
		if(mobileNumber!=null && mobileNumber.length()==10)
		{
			try
			{
				Long.valueOf(mobileNumber);
				return true;
			}catch (NumberFormatException e) {
				return false;
			}
			
		}
		// && mobileNumber.matches("[0-9]+")
		return false;
	}

}
