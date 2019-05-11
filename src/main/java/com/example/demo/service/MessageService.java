package com.example.demo.service;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.Message;
import com.example.demo.repository.MessageRepository;
import com.google.common.base.Optional;


@Service
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;
	
	public Message creatMessage(Message message) {
		return null;
	}
	
	public Message updateMessage(String id, Message message) {
		message.setId(UUID.randomUUID().toString());
		message.setDeleted(false);
		message.setCreatedAt(Calendar.getInstance().getTime());
		
		return messageRepository.save(message);
	}

	public void deleteMessage(String id) {
		
	}
	
	public Message findMessage(String id, Message message) {
		return null;
	}
	
	public List<Message> findAllMessage(Message message){
		return null;
	}
	
	public Optional<Message> findMessage(String id) {
		return null;
	}
}
