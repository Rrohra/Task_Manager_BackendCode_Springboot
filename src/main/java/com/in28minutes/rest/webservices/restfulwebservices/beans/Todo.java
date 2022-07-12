package com.in28minutes.rest.webservices.restfulwebservices.beans;
//this is todo bean
import java.util.Date;

public class Todo {
	private int id;
	private String username;
	private String description;
	private Date tragetDate;
	private boolean isDone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTragetDate() {
		return tragetDate;
	}
	public Todo() {
		super();
	}
	public void setTragetDate(Date tragetDate) {
		this.tragetDate = tragetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	public Todo(int id, String username, String description, Date tragetDate, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.tragetDate = tragetDate;
		this.isDone = isDone;
	}
	

}
