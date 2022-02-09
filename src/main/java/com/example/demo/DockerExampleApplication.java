package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerExampleApplication {
	
	@GetMapping("/test")
	public String test() {
		return "docker isrunning";
	}
	
	@GetMapping("/test/test2")
	public String test2() {
		return "docker isrunning";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}

}
