package org.ain.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.ain.domain.User;
import org.ain.repository.UserRepository;
import org.ain.service.CustomUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.android.gcm.server.Message;

@Controller
@RequestMapping("/")
public class MainController {

	private Logger logger = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private UserRepository userRepository;
	
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
		User user = new User();
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			logger.debug("::::::::::::::::::::: found user ::::::::::::::::::");
			user = userRepository.findByUsername(((UserDetails) principal).getUsername());
		}
		System.out.println("user executed!!!!");
		return "user";
	}
	
	@RequestMapping(value="/admin")
	public String getAdminPage() {
		System.out.println("admin executed!!!!");
		return "admin";
	}
}
