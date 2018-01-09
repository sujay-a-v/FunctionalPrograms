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
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String viewLogin(Map<String, Object> model) {
        User user = new User();
        model.put("userForm", user);
        return "LoginForm";
    }
	
	@RequestMapping(value = "/loginSuccess", method = RequestMethod.POST)
    public ModelAndView doLogin(@Valid @ModelAttribute("userForm") User userForm,
            BindingResult result) {
        if (result.hasErrors()) {
           
			ModelAndView modelandview=new ModelAndView("LoginForm");
			return modelandview;
        }
 
        ModelAndView modelandview=new ModelAndView("Abc");
        System.out.println("send to login success");
        return modelandview;
        //return "LoginSuccess";
    }
	
}
