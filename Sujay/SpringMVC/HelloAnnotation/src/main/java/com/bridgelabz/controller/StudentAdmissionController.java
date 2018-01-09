package com.bridgelabz.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.Student;
import com.bridgelabz.model.StudentNameEditor;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void InitBinder(WebDataBinder binder)
	{
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy**MM**dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
	}
	
	@RequestMapping(value="/admission", method = RequestMethod.GET)
	public ModelAndView getAdmission()
	{
		ModelAndView modelandview=new ModelAndView("AdmissionForm");
		//modelandview.addObject("message","Collge of Engineering");
		return modelandview;
	}
	
	/*@RequestMapping(value = "/application", method = RequestMethod.POST)
	public ModelAndView submit(@RequestParam(value="studentName", defaultValue="ABC") String name,
			@RequestParam("studentHobby") String hobby)
	{
		ModelAndView modelandview=new ModelAndView("AdmissionSuccess");
		modelandview.addObject("message","Details submitted by : " +name+ ",\n Hobby: "+hobby);
		return modelandview;
		
	}*/
	
	@ModelAttribute
	public void addCommonObject(Model model)
	{
		model.addAttribute("message","Collge of Engineering");
	}
	
	@RequestMapping(value = "/application", method = RequestMethod.POST)
	public ModelAndView submit(@Valid @ModelAttribute("student1") Student student1,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			ModelAndView modelandview=new ModelAndView("AdmissionForm");
			return modelandview;
		}
		
		ModelAndView modelandview=new ModelAndView("AdmissionSuccess");
		
		/*Student student1=new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);*/

		//modelandview.addObject("message","Collge of Engineering");
		
		//modelandview.addObject("student1",student1);
		return modelandview;
		
	}

}
