package com.kubecon2019.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@Value("${appruntime:Spring Boot}")
	private String appruntime;
	
	@GetMapping("/")
	public String SayHi() {
		return "Hello KubeCon San Diego! Greetings from " + appruntime;
	}

}
