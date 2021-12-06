package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WasherController {
	@GetMapping("/washer")
	public String controller() {
		return "Hello-World- welcome to Washer page";
	}
}


 