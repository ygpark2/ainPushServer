package org.ain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.android.gcm.server.Message;

@Controller
@RequestMapping("/android")
public class AndroidController {

	@RequestMapping
	public String getDeviceList() {
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
	
	@RequestMapping(value="/register")
	public String registerDevice() {
		System.out.println("register device!!!!");
		return "user";
	}
	
	@RequestMapping(value="/unregister")
	public String unregisterDevice() {
		System.out.println("unregister device!!!!");
		return "admin";
	}

	@RequestMapping(value="/message")
	public String sendMessageForm() {
		System.out.println("unregister device!!!!");
		return "admin";
	}

	@RequestMapping(value="/message/send")
	public String sendMessage() {
		System.out.println("unregister device!!!!");
		return "admin";
	}

}
