package com.example.gitcommandpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Controller {
	
	@GetMapping("/greet")
	public String greetMsg()
	{
		return "Hello GitHub";
	}
	
	@GetMapping("/greet2")
	public String greetMsg2()
	{
		return "Good Mrng GitHub and hello stash";
		
	}

}
