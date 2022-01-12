package com.astuno.moviecatalog.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	private ScorePK id = new ScorePK();
	private Double value;
	
	public Score() {
		
	} // Constructor without fields;

	public Score(ScorePK id, Double value) {
		this.id = id;
		this.value = value;
	} // Constructor using fields;
	
	
	/**
	 * @param movie
	 * This class will connect the score with the Movie;
	 */
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	/**
	 * @param user
	 * This class will connect the score with the User;
	 */
	public void setUser(User user) {
		id.setUser(user);
	}
	
// Boilerplate code;	

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}