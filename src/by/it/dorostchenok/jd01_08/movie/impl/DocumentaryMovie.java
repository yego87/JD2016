package by.it.dorostchenok.jd01_08.movie.impl;

/**
 * Еще один класс для демонстрации полиморфизма
 */
public class DocumentaryMovie extends DomesticMovie{

    public DocumentaryMovie(String title) {
        super(title, Genre.DOCUMENTARY);
    }
}
