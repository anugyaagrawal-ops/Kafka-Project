package com.example.policybazaar.com.customer.Services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "codeDecodeTopic" , groupId = "codeDecode_group" )
	public void listenToTopic(String receivedMessage) {
		System.out.println(receivedMessage);
	}

}
