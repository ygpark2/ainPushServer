package org.ain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/login")
	public String login(Model model, @RequestParam(required=false) String message) {
		model.addAttribute("message", message);
		return "access/login";
	}

	@RequestMapping(value = "/denied")
 	public String denied() {
		return "access/denied";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/signup")
 	public String signupForm() {
		return "user/signup";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
 	public String signupCreate() {
		return "user/signup";
	}

	@RequestMapping(value = "/delete")
 	public String delete() {
		return "user/delete";
	}

	@RequestMapping(value = "/login/failure")
 	public String loginFailure() {
		String message = "Login Failure!";
		return "redirect:/login?message="+message;
	}

	@RequestMapping(value = "/logout/success")
 	public String logoutSuccess() {
		String message = "Logout Success!";
		return "redirect:/login?message="+message;
	}
}