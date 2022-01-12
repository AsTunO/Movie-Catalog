package com.astuno.moviecatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astuno.moviecatalog.dto.MovieDTO;
import com.astuno.moviecatalog.dto.ScoreDTO;
import com.astuno.moviecatalog.entities.Movie;
import com.astuno.moviecatalog.entities.Score;
import com.astuno.moviecatalog.entities.User;
import com.astuno.moviecatalog.repositories.MovieRepository;
import com.astuno.moviecatalog.repositories.ScoreRepository;
import com.astuno.moviecatalog.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0;
		for(Score s : movie.getScores()) {
			sum += s.getValue();
		}
		
		double average = sum / movie.getScores().size();
		
		movie.setScore(average);
		movie.setCount(movie.getScores().size());
		
		movie = movieRepository.save(movie);
		
		return new MovieDTO(movie);
		
	}
}