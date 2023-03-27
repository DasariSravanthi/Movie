// Write your code here

package com.example.movie.repository;

import com.example.movie.model.Movie;
import java.util.ArrayList;

public interface MovieRepository {
    ArrayList<Movie> getMovies();
    Movie addMovie(Movie movie);
    Movie getMovieById(int movieId);
    Movie updateMovie(int movieId, Movie Movie);
    void deleteMovie(int movieId);
}