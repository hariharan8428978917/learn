package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class HomeController {
	

	public HomeController() {
		super();
		System.out.println("HOme controller");
	}

	@GetMapping("hi")
	public String get() {
		return "hi";
	}

}
