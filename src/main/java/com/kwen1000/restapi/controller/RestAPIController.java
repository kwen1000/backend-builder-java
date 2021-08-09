package com.kwen1000.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

	@GetMapping("/")
	public String index() {
		return "Hello World";
	}

}
