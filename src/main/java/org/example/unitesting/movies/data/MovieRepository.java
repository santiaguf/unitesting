package org.example.unitesting.movies.data;


import org.example.unitesting.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {

    Movie findById(long id);

    Movie findByName(String name);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}