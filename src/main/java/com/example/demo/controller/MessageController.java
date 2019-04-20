package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;
@RestController
@RequestMapping(value = "/messages")
public class MessageController {

	@RequestMapping(method = RequestMethod.POST)
	public Message creatMessage(Message message) {
		return null;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public Message updateMessage(String id, Message message) {
		return null;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteMessage(String id) {
		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Message findMessage(String id, Message message) {
		return null;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Message> findAllMessage(Message message){
		return null;
	}
}
