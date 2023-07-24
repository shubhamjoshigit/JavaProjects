package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
//	
//	@RequestMapping("/submitHandler")
//	public String handler(@RequestParam("email") String email,@RequestParam("username") String username,@RequestParam("password") String password,Model model) {
//		System.out.println("Username :"+username+" email: "+email+" password: "+password);
//		model.addAttribute("email", email);
//		model.addAttribute("name",username);
//		model.addAttribute("passowrd", password);
//		return "success";
//	}
	@RequestMapping("/submitHandler")
    public String handler(@ModelAttribute User user, Model model) {
		System.out.println(user);
    	return "success";
    }

}
