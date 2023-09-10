package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	@Autowired   //or you can go for constructor injection
	private AuthenticationService authenticationService;
	
	//GET login page  
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String gotoLogin() {
		return "login";
	}
	
	//GET login page  
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String gotoWelcome(@RequestParam String name,@RequestParam String password,ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
		
		
	}

}
