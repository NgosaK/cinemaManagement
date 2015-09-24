package za.ac.ngosa.services;

import za.ac.ngosa.domain.Movie;

import java.util.List;

/**
 * Created by User on 2015/09/12.
 */
public interface MovieService {

    List<Movie> getMovie();

    Movie getMovieByID(long id);
    Movie addMovie(Movie movie);
    void removeMovie(Movie movie);
    Movie updateMovie(Movie movie);

}
