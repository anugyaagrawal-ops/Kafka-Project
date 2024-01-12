package com.example.policybazaar.com.customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.policybazaar.com.customer.Services.Producer;

@RestController
@RequestMapping("/rest/api")
public class Controller {
	
	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMsgToTopic(message);
	}

}
