package com.arvind.home.spring.email;

import org.apache.log4j.Logger;

public class SampleEmailSender {
	
	private static Logger LOGGER = Logger.getLogger(SampleEmailSender.class);
	
	public void send(String to, String from, String body) {
		System.out.println("here is the logic to send the emails");
	}

}
