package com.in28minutes.rest.webservices.restfulwebservices.beans;

public class AuthenticationBean {

	public String authMessage;
	@Override
	public String toString() {
		return "AuthenticationBean [authMessage=" + authMessage + "]";
	}
	public String getAuthMessage() {
		return authMessage;
	}
	public void setAuthMessage(String authMessage) {
		this.authMessage = authMessage;
	}
	public AuthenticationBean(String s) {
		this.authMessage=s;
	}
}
