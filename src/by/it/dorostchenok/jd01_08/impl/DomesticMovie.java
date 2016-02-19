package by.it.dorostchenok.jd01_08.impl;

public class DomesticMovie extends AbstractMovie {

    public DomesticMovie(String title) {
        super(title);
        super.setGenre(Genre.COMEDY);
    }

    @Override
    public String toString() {
        return null;
    }
}
