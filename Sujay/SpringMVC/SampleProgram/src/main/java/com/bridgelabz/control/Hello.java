package com.bridgelabz.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
		public ModelAndView hello()
		{
		ModelAndView modelandview=new ModelAndView("Hello");
		modelandview.addObject("message","Hello ");
			return modelandview;
		}

}
