package com.in28minutes.rest.webservices.restfulwebservices.beans;

public class HellowWorldBean {

	private String message;
	public HellowWorldBean(String msg) {
		// TODO Auto-generated constructor stub
		this.message = msg;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "HellowWorldBean [message=" + message + "]";
	}

}
