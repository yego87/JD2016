package by.it.dorostchenok.jd01_08.movie.impl;

/**
 * Первый в иерархии класс расширяющий AbstractMovie
 */
public class DomesticMovie extends AbstractMovie {

    public DomesticMovie(String title, Genre genre) {
        super(title, genre);
    }

    /**
     * Реализуем единственный астрактный метод суперкласса
     * @return
     */
    @Override
    public String toString() {
        return "Title: " + super.getTitle() + ". Genre: " + super.getGenre();
    }
}
