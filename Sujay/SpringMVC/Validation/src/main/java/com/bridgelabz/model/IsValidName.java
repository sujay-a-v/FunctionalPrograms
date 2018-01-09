package com.bridgelabz.model;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.internal.xml.ElementType;
import org.w3c.dom.css.ElementCSSInlineStyle;

//@Documented
@Constraint(validatedBy=NameValidator.class)
//@Target( {ElementType.METHOD,ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidName {
	String message() default "Please enter the correct name";
	
	Class<?>[] groups() default{};
	
	Class<? extends Payload>[] payload() default {};

}
