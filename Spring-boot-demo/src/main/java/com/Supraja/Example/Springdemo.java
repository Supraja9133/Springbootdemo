package com.Supraja.Example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Springdemo {
		@GetMapping("/hi")
		public String sayHi() {
			System.out.println("Hello!...Spring Boot");
			return "Hi Welcome To Spring Boot";
		}
	}
