package kku.sqa.lab.service;

import java.util.List;
import java.util.stream.Collectors;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.model.Movie;

public class FavoriteMovie {
	private MovieService movieService;
	
	public FavoriteMovie(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	public List<Movie> getMovie(String username, String playlist) {
		// get all movies from movie service;
		List<Movie> allMovies = movieService.getMoviesByUsername(username);
		// filter by playlist;
		return allMovies.stream().filter(movie -> movie.getPlaylist().equalsIgnoreCase(playlist)).collect(Collectors.toList());
	}
}
