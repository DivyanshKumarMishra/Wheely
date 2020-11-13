package com.divyansh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PricingController {

	@GetMapping("/pricing")
	public String getPricing() {
		return "pricing";
	}
}
