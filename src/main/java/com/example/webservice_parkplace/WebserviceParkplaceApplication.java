package com.example.webservice_parkplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class WebserviceParkplaceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(WebserviceParkplaceApplication.class, args);
		System.out.println("Hi");
		//SpringApplication.run(WebserviceParkplaceApplication.class, args);
	}

}

@RestController
class HelloWebService {
	@GetMapping("/")
	String hello() {
		return "Hallo Digga";
	}

}