package com.food.beans;

public class User {

	private Integer id;
	public String username;
	private String password;
	
	public Integer getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String Password() {
		return password;
	}
	public void setId( Integer id) {
		this.id=id;
	}
	public void setUsername( String username) {
		this.username=username;
	}
	public void setPassword( String password) {
		this.password=password;
	}
	public String toString() {
		return id+" "+username+" "+password;
	}

}
