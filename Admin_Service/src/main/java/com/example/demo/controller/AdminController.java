package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@GetMapping("/admin")
 public String hello() {
	 return "Hello World Welcom to Admin page";
 }
}
