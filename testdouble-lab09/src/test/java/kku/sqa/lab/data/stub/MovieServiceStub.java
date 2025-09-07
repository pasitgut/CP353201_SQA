package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MovieService;
import kku.sqa.lab.model.Movie;

public class MovieServiceStub implements MovieService {
	
	public List<Movie> getMoviesByUsername(String username) {
		return Arrays.asList(
				new Movie("The Notebook","datenight"),
				new Movie("50 First Dates","datenight"),
				new Movie("About Time","datenight"),
				new Movie("La La Land","datenight"),
				new Movie("10 Things I Hate About You","datenight"),
				new Movie("The Conjuring","horror"),
				new Movie("Get Out","horror"),
				new Movie("Hereditary","horror"),
				new Movie("A Quiet Place","horror"),
				new Movie("Scream","horror")
				);
	}

}
