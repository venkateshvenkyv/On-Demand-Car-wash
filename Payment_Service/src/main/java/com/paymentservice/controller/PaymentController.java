package com.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	@GetMapping("/payment")
	public String payment() {
		return "Hello-world- welcome to Payment page";
	}
}
