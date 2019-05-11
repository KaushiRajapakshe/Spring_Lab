package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Message;

public interface MessageRepository extends MongoRepository<Message, String>{

	
//	@RequestMapping(method = RequestMethod.POST)
//	public Message creatMessage(Message message);
//	
//	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
//	public Message updateMessage(String id, Message message);
//	
//	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
//	public void deleteMessage(String id);
//	
//	@RequestMapping(value="/{id}", method = RequestMethod.GET)
//	public Message findMessage(String id, Message message);
//	
//	@RequestMapping(method = RequestMethod.GET)
//	public List<Message> findAllMessage(Message message);
}
