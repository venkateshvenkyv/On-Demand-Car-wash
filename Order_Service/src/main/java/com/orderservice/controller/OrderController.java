package com.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@GetMapping("/order")
	public String order() {
		return "Helloworld-Welcome to Order page";
	}
}
