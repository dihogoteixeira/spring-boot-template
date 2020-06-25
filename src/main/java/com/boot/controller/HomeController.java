package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {

		return "Validação dev (SPRINT 1) - Review - hello word with gitlab CI/CD, nexus, spring boot on EKS by dteixeira.";
	}

}
