package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Session {
	
	@Id
	private Integer id;
	private String subject;
	private Integer startTime;
	private Integer expiryTime;
	private Integer createdByTeacher;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getExpiryTime() {
		return expiryTime;
	}
	public void setExpiryTime(Integer expiryTime) {
		this.expiryTime = expiryTime;
	}
	public Integer getCreatedByTeacher() {
		return createdByTeacher;
	}
	public void setCreatedByTeacher(Integer createdByTeacher) {
		this.createdByTeacher = createdByTeacher;
	}

}
