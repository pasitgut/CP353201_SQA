package kku.sqa.lab.api;

import java.util.List;

import kku.sqa.lab.model.Movie;

public interface MovieService {
	
	public List<Movie> getMoviesByUsername(String username);
}
