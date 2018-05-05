package com.smh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	/*@RequestMapping(value="/home.htm", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal ) {
 
		String name = principal.getName();
		model.addAttribute("username", name);
		return "home";
 
	}*/
 
	@RequestMapping(value="/login.htm", method = RequestMethod.GET)
	public String login(ModelMap model) {
 
		return "login";
		//return "redirect:/login/signIn.htm";
 
	}
	
	@RequestMapping(value="/signIn.htm", method = RequestMethod.GET)
	public String signIn(ModelMap model) {
 
		return "login";
 
	}

	@RequestMapping(value="/loginfailed.htm", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
	
	@RequestMapping(value="/logout.htm", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "login";
 
	}
}
