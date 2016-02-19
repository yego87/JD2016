package by.it.dorostchenok.jd01_08.movie.impl;

import by.it.dorostchenok.jd01_08.movie.AbstractMovie;

public class DomesticMovie extends AbstractMovie {

    public DomesticMovie(String title, Genre genre) {
        super(title, genre);
    }

    @Override
    public String toString() {
        return "Title: " + super.getTitle() + " Genre: " + super.getGenre();
    }
}
