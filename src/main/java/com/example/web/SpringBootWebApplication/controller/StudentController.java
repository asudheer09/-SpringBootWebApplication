package com.example.web.SpringBootWebApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String showHomePage(){
		return "home";
	}
}
