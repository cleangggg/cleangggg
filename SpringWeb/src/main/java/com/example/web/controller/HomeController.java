package com.example.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	
	@RequestMapping("/index")
	public String adf() {
		return "hello";

	}

	@RequestMapping("/aaabb")
	public String aaa() {
		return "aaa";
	}
}
