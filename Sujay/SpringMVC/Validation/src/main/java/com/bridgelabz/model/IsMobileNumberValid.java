package com.bridgelabz.model;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=MobilenumberValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsMobileNumberValid {
	
	String message() default "Your mobile number is invalid, Please enter the 10 digit mobile number";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};

}
