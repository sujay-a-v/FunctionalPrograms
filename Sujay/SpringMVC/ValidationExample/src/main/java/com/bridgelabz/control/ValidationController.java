package com.bridgelabz.control;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.User;

@Controller
public class ValidationController {

	User users = new User();
	@GetMapping("/sample")
	public ModelAndView register(User user) {
		return new ModelAndView("register");
	}

	@PostMapping("/register")
	public ModelAndView create(@Valid User user, BindingResult bindingResult) {
		ModelAndView model = new ModelAndView("view");
		// user bean will be automatically binded to view refer @ModelAttribute
		if(bindingResult.hasErrors())
		{
			return new ModelAndView("register");
		}
			users.setName(user.getName());
			users.setEmail(user.getEmail());
			users.setGender(user.getGender());
			users.setLanguage(user.getLanguage());
			users.setCountry(user.getCountry());
			users.setPassword(user.getPassword());
		return model;
	}

	@GetMapping("/register")
	public ModelAndView viewData(User user) {

		ModelAndView model = new ModelAndView("register");
		return model;
	}
}
