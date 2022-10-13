package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	public WebController() {
		// TODO Auto-generated constructor stub
		
	}
	@GetMapping("/h")
	
 public String home()
 {
	 return "home";
 }
}
