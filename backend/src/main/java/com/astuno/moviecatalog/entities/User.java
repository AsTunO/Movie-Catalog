package com.astuno.moviecatalog.entities;

public class User {
	
	private Long idLong;
	private String email;
	
	public User() {
		
	} // Constructor without fields;

	public User(Long idLong, String email) {
		this.idLong = idLong;
		this.email = email;
	} // Constructor using fields;

// Boilerplate code;
		
	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}