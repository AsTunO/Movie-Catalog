package com.astuno.moviecatalog.entities;

public class ScorePK {

	private Movie movie;
	private User user;
	
	public ScorePK() {
		
	} // Constructor without fields;

	public ScorePK(Movie movie, User user) {
		this.movie = movie;
		this.user = user;
	} // Constructor using fields;

// Boilerplate code;
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
}