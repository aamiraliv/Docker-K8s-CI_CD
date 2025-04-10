package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/hello")
    public String hello() {
        return "Hello, Kubernetes!";
    }

    @GetMapping("/users")
    public String users() {
        return "User List: Alice, Bob";
    }

    @GetMapping("/test")
    public String test() {
        return "testing the ci -> continues integration";
    }
}
