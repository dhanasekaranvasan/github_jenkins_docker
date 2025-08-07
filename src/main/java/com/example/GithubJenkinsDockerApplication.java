package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubJenkinsDockerApplication.class, args);
	}

	@GetMapping("/")
	public String getRoot() {
		return "Welcome to Github Jenkins Docker AWS Project";
	}
}
