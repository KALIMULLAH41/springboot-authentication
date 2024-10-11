package com.authentication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@GetMapping("/loginPage")
	public String loginPage() {
		return "login";
	}

	@GetMapping("/signUpPage")
	public String signUpPage() {
		return "signUp";
	}


	
}
