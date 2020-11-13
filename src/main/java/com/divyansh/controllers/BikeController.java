package com.divyansh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BikeController {

	@GetMapping("/bikes")
	public String getbike() {
		return "bikes";
	}
}
