package org.cinema.project.cinema.view;

import org.cinema.project.cinema.model.entity.Movie;

import javax.swing.*;
import java.util.List;

public class MovieListModel extends AbstractListModel<Movie> {

    private List<Movie> movies;

    public MovieListModel(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public int getSize() {
        return movies.size();
    }

    @Override
    public Movie getElementAt(int index) {
        return movies.get(index);
    }
}

