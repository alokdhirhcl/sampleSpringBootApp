package com.sample.spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/welcomeSpring6App")
	public String welcomeApp() {
		
		return "Welcome Java Spring JBOSS Application 6" ;
	}

}
