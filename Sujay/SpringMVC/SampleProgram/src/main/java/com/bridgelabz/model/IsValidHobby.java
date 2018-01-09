package com.bridgelabz.model;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.hibernate.validator.internal.xml.ElementType;

@Documented
@Constraint(validatedBy=Hobbyvalidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {
	String message() default "Please provide a valid Hobby "+
					"accepted hobbies are = Music, Football, Cricket and Hockey ( choose anyone)";
	Class<?>[] group default ();
	Class <? extends Payload>[] payload() default{};

}
