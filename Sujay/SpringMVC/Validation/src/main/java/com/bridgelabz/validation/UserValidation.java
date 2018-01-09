package com.bridgelabz.validation;

import java.util.Set;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bridgelabz.model.User;



public class UserValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		
		return User.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		
	}

	
}
