package com.bridgelabz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView hello()
	{
		ModelAndView modelandview=new ModelAndView("Hello");
		modelandview.addObject("msg","Hello BridgeLabz");
		return modelandview;
		
	}

}
