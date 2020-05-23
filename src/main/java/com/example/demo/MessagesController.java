package com.example.demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messages")
public class MessagesController {
	final List<Messages> message = new CopyOnWriteArrayList<>();
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Message> getMessages() {
		return messages;
		       
	}
	@RequestMapping(method = RequestMethod.POST)
	public Messages postMessages(@RequestBody Messages message) {
		messages.add(message);
		return message;
	}
	

}
