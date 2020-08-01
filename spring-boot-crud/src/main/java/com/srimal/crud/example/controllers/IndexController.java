package com.srimal.crud.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* Home page controller.
*/
@Controller
public class IndexController {
      
	@RequestMapping("/")
	String login() {
		return "login";
	}
	
//	@RequestMapping("/home")
//	String index() {
//		return "index";
//	}
}

