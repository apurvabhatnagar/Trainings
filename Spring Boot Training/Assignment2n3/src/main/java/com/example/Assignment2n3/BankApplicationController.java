package com.example.Assignment2n3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankApplicationController {

	@GetMapping("/welcome")
	@ResponseBody
	public String bank(Model model) {
		return "bankWelcome";
	}
	
	@GetMapping("/services")
	@ResponseBody
	public String address(Model model) {
		return "bankBranches";
	}

}
