package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	//authenticate a user 
	public boolean authenticate(String username , String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("teknath");
		boolean isValidPassword =  password.equalsIgnoreCase("jha");
		
		return (isValidPassword && isValidUserName);
	}

}
