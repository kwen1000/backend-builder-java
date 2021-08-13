package com.backendbuilder.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* @RestController does not require @ResponseBody */
@RestController
public class RestAPIController {

  @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public String index() throws Exception {
  	return "{ \"message\": \"Cool\" }";
  }
	
}
