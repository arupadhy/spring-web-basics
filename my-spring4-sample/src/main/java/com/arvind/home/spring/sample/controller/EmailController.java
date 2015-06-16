package com.arvind.home.spring.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@RequestMapping("/mail")
	public void sendEmail() {
		
	}
}
