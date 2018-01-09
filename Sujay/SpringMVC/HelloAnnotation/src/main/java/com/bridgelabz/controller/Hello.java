package com.bridgelabz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/class")  // class level mapping
public class Hello {
	
	@RequestMapping("/annot")
	public ModelAndView hello()
	{
		ModelAndView modelandview=new ModelAndView("index");
		modelandview.addObject("msg","Hellllllo");
		return modelandview;
		
	}
	
	// access the multiple methods also
	@RequestMapping("/hi")
	public ModelAndView hello1()
	{
		ModelAndView modelandview=new ModelAndView("index");
		modelandview.addObject("msg","Hello BridgeLabz");
		return modelandview;
	
	}
	
	@RequestMapping("/annotation/{state}/{user}")
	public ModelAndView hello2(@PathVariable ("user") String name,@PathVariable("state") String state)
	{
		ModelAndView modelandview=new ModelAndView("index");
		modelandview.addObject("msg","Hello, "+name+" you are from "+state);
		return modelandview;
		
	}
	
	/*@RequestMapping("/annotation/{state}/{user}")
	public ModelAndView hello3(@PathVariable Map<String,String> pathVariables)
	{
		String name=pathVariables.get("user");
		String state=pathVariables.get("state");
		
		ModelAndView modelandview=new ModelAndView("index");
		modelandview.addObject("msg","Hello, "+name+" you are from "+state);
		return modelandview;
		
	}*/
	
	
	

}
