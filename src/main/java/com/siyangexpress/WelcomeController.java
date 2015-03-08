package com.siyangexpress;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to 思洋快遞!");
		model.addAttribute("tagline", "The simple but not dumb Delivery Service");

		return "home";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {

		return "home";
	}
	
	@RequestMapping("/classes")
	public String classes(Model model) {

		return "classes";
	}
}
