package org.ain.controller;

import javax.servlet.http.HttpServletRequest;

import org.ain.domain.User;
import org.ain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/login")
	public String login(Model model, @RequestParam(required=false) String message) {
		model.addAttribute("message", message);
		return "user/login";
	}

	@RequestMapping(value = "/denied")
 	public String denied() {
		return "access/denied";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/signup")
 	public ModelMap signupForm(final HttpServletRequest request, ModelMap model) {
		User user = new User();
		model.addAttribute("ain_user", user);
		return model;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/signup")
 	public String signupCreate(@ModelAttribute("ain_user") User new_user, BindingResult result, HttpServletRequest request) {
		userRepository.save(new_user);

		return "user/signup";
	}

	@RequestMapping(value = "/delete")
 	public String delete() {
		return "user/delete";
	}

	@RequestMapping(value = "/login/failure")
 	public String loginFailure() {
		String message = "Login Failure!";
		return "redirect:/user/login?message="+message;
	}

	@RequestMapping(value = "/logout")
 	public String logout() {

		return "user/logout";
	}

	@RequestMapping(value = "/logout/success")
 	public String logoutSuccess() {
		String message = "Logout Success!";
		return "redirect:/user/login?message="+message;
	}
}