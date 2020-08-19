package com.example.Assignment1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAssignmentController {

	@RequestMapping("/")
	public String bank() {
		return "Welcome to HDFC Bank";
	}
	
	@RequestMapping("/address")
	public String address() {
		return "Ansal Fortune, K Block\n" + 
				"Sector 18\n" + 
				"Noida-201301";
	}

}
