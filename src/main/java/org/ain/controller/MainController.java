package org.ain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.android.gcm.server.Message;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping
	public String getHomePage() {
		System.out.println("home executed!!!!");
		/*
		Message message = new Message.Builder()
		    .collapseKey(collapseKey)
		    .timeToLive(3)
		    .delayWhileIdle(true)
		    .addData("key1", "value1")
		    .addData("key2", "value2")
		    .build();
		*/
		// message.
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
