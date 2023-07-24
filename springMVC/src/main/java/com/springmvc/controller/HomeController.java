package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getView() {
		System.out.println("HomeController");
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView getHelp() {
		ModelAndView mv = new ModelAndView();
		System.out.println("HelpController");
		List<String> list = new ArrayList<String>();
		list.add("Shuham");
		list.add("abc");
		list.add("xyz");
		mv.addObject("list", list);
		mv.setViewName("help");
		return mv;
	}
}
