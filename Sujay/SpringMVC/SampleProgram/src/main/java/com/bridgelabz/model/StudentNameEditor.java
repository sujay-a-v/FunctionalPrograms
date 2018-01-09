package com.bridgelabz.model;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	// When we submit the admission form Spring MVC will run the setAsTexr function of this class
	// Before performing data binding task for studentName property of Student Object
	@Override
	public void setAsText(String studentName)
	{
		if(studentName.contains("Mr.") || studentName.contains("Ms."))
		{
			setValue(studentName);
		}
		else
		{
			studentName="Mr."+studentName;
			
			setValue(studentName);
		}
	}

}
