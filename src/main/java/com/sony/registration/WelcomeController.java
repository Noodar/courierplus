package com.sony.registration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to 思洋快遞!");
		model.addAttribute("tagline", "The simple but not dumb Delivery Service");

		return "welcome";
	}
}
