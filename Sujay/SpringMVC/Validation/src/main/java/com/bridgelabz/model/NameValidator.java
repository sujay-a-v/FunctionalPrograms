package com.bridgelabz.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<IsValidName, String>{

	@Override
	public void initialize(IsValidName isValidHobby) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String studentName, ConstraintValidatorContext context) {
		
		if(studentName==null)
		{
			return false;
		}
		if(!studentName.matches("[0-9]+"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
