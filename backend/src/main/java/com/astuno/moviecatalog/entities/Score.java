package com.astuno.moviecatalog.entities;

public class Score {

	private ScorePK id = new ScorePK();
	private Double value;
	
	public Score() {
		
	} // Constructor without fields;

	public Score(ScorePK id, Double value) {
		this.id = id;
		this.value = value;
	} // Constructor using fields;
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
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