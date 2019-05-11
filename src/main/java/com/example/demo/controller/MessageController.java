package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Message;
import com.example.demo.service.MessageService;
import com.google.common.base.Optional;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Message creatMessage(Message message) {
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Message updateMessage(String id, Message message) {
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMessage(String id) {

	}

	

	@RequestMapping(method = RequestMethod.GET)
	public List<Message> findAllMessage(Message message) {
		return null;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public HttpEntity<Message> findMessage(@PathVariable("id") String id) {
		Optional<Message> messageOpt = messageService.findMessage(id);
		if (messageOpt.isPresent()) {
			return new ResponseEntity<Message>(messageOpt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Message>(HttpStatus.NOT_FOUND);
		}
	}

}
