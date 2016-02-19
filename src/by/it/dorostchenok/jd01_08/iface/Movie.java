package by.it.dorostchenok.jd01_08.iface;

import by.it.dorostchenok.jd01_08.impl.AbstractMovie.Genre;

public interface Movie {
    Genre getGenre();
    String getTitle();
    void setGenre(Genre genre);
}
