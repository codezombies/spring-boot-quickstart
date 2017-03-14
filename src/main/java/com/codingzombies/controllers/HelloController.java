package com.codingzombies.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingzombies.services.UserRepository;

@Controller
public class HelloController {

	@Autowired 
	UserRepository userRepository;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("date", new Date());
		model.addAttribute("users", userRepository.findAll());
		return "hello";
	}
	
}
