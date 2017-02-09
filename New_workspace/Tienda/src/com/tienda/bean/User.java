package com.tienda.bean;

import java.util.Set;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="user")
public class User {
	
	private int userId;
	private String emailId,username;
	
	private Set<Link> links;
	
	
	public User() {
		super();
	}
	public User(int userId,String username, String emailId) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.username = username;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@XmlElementWrapper(name="links")
	@XmlElementRef
	public Set<Link> getLinks() {
		return links;
	}
	
	public void setLinks(Set<Link> links) {
		this.links = links;
	}

}
