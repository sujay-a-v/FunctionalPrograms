package com.bridgelabz.control;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/Register",  method = RequestMethod.GET)
	public String addDetails(Map<String, Object> model)throws Exception
	{
		/*String exceptionOccure="IO_EXCEPTION";
		if(exceptionOccure.equalsIgnoreCase("NULL_POINTER"))
		{
			throw new NullPointerException("Null Pointer Exception");
		}
		else if(exceptionOccure.equalsIgnoreCase("IO_EXCEPTION"))
		{
			throw new IOException("IO EXCEPTION");
		}*/
		
		User user=new User();
		model.put("studentForm", user);
		return "RegisterForm";
	}
	
	@RequestMapping(value="Abc", method = RequestMethod.POST)
	public ModelAndView addSuccess(@Valid @ModelAttribute("userForm") User userForm,
			BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView modelandview=new ModelAndView("RegisterForm");
			return modelandview;
		}
		ModelAndView modelandview=new ModelAndView("LoginForm");
		return modelandview;
		
	}

}
