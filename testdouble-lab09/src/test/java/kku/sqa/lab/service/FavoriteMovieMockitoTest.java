package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.model.Movie;

class FavoriteMovieMockitoTest {

	@Test
	void test_FavoriteMovie_withMockito() {
		MovieService movieService = mock(MovieService.class);
		List<Movie> movieList = Arrays.asList(new Movie("The Notebook","datenight"),
				new Movie("50 First Dates","datenight"),
				new Movie("About Time","datenight"),
				new Movie("La La Land","datenight"),
				new Movie("10 Things I Hate About You","datenight"),
				new Movie("The Conjuring","horror"),
				new Movie("Get Out","horror"),
				new Movie("Hereditary","horror"),
				new Movie("A Quiet Place","horror"),
				new Movie("Scream","horror"));
		
		when(movieService.getMoviesByUsername("username")).thenReturn(movieList);
		
		FavoriteMovie favoriteMovie = new FavoriteMovie(movieService);
		List<Movie> datenightMovieList = favoriteMovie.getMovie("username", "datenight");
		
		assertEquals(5, datenightMovieList.size());
	}
}
