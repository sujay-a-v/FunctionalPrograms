package com.bridgelabz.model;

import java.lang.annotation.ElementType;
import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.metadata.ConstraintDescriptor;
import javax.validation.metadata.ElementDescriptor.ConstraintFinder;
import javax.validation.metadata.Scope;

public class Hobbyvalidator implements ConstraintValidator<IsValidHobby, String> {


	@Override
	public void initialize(IsValidHobby isValidHobby) {
		
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		
		if(studentHobby==null)
		{
			return false;
		}
		if(studentHobby.matches("Music|Football|Cricket|Hockey"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
