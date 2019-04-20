package com.example.demo.domain;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.xml.crypto.Data;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Document("message")

public class Message {
@Id
private String id;

@NotEmpty
private String message;

@JsonIgnore
private boolean deleted;

@CreatedDate
private Data createdAt;

@LastModifiedDate 
private Data updatedAt;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public boolean isDeleted() {
	return deleted;
}

public void setDeleted(boolean deleted) {
	this.deleted = deleted;
}

public Data getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date date) {
	this.createdAt = (Data) date;
}

public Data getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Data updatedAt) {
	this.updatedAt = updatedAt;
}
}
