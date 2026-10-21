package com.sanjay.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/")
    public String getWelcome() {
    	return "Welcome to my first Docker Application....!!";
    }
}
