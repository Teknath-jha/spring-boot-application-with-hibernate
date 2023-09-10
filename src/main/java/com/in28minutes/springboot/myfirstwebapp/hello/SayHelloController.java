package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//say-hello => "AHello message"
	
	@RequestMapping("say-hello")
	@ResponseBody 
	public String sayHello() {
		return "Hello! what are you learning ?";
	}
	
	
	//say-hello-jsp -> sayHello.jsp
	// /src/main/resources/MET-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
