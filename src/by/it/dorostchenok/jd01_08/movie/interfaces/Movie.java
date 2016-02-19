package by.it.dorostchenok.jd01_08.movie.interfaces;

import by.it.dorostchenok.jd01_08.movie.AbstractMovie.Genre;

public interface Movie extends Playable{
    Genre getGenre();
    String getTitle();
}
