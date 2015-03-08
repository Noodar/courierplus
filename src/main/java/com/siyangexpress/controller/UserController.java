package com.siyangexpress.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.siyangexpress.domain.User;
import com.siyangexpress.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}

	@RequestMapping("/all")
	public String allUser(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}

	@RequestMapping("/{category}")
	public String getUsersByCategory(Model model, @PathVariable String category) {
		model.addAttribute("users", userService.getUsersByCategory(category));
		return "users";
	}

	@RequestMapping("/filter/{ByCriteria}")
	public String getUsersByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams, Model model) {
		model.addAttribute("users", userService.getUsersByFilter(filterParams));
		return "users";
	}

	@RequestMapping("/user")
	public String getProductById(@RequestParam("id") String productId, Model model) {
		model.addAttribute("user", userService.getUserById(productId));
		return "user";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(Model model) {
	   User newUser = new User();
	   model.addAttribute("newUser", newUser);
	   return "addUser";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newUser") User newUser) {
	   userService.addUser(newUser);
	   return "redirect:/users";
	}
}