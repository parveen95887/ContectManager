package com.smart.contact.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.contact.Entity.contact;
import com.smart.contact.Entity.user;
import com.smart.contact.Repository.userRepository;


@Controller
public class HomeController {
      @Autowired
	 private userRepository ur;
	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("title", "welcome to home page");
		 return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "about";
	}
}
