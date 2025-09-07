package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.data.stub.MovieServiceStub;
import kku.sqa.lab.model.Movie;

class FavoriteMovieTest {

	@Test
	void test_FavoriteMovie_withStub() {
		MovieService movieService = new MovieServiceStub();
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		
		List<Movie> movieList = favoriteMovie.getMovie("username", "horror");
		
		assertEquals(5, movieList.size());
	}

}
