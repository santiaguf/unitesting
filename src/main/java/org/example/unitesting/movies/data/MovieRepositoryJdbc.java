package org.example.unitesting.movies.data;

import org.example.unitesting.movies.model.Movie;

import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {
    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }
}
