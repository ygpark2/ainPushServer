package org.ain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediatorController {

	@RequestMapping
	public String getHomePage() {
		System.out.println("home executed!!!!");
		return "home";
	}
	
	@RequestMapping(value="/user")
	public String getUserPage() {
		System.out.println("user executed!!!!");
		return "user";
	}
	
	@RequestMapping(value="/admin")
	public String getAdminPage() {
		System.out.println("admin executed!!!!");
		return "admin";
	}
}
