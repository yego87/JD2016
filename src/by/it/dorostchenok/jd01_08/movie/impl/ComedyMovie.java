package by.it.dorostchenok.jd01_08.movie.impl;

/**
 * Класс расширяет DomesticMovie
 * добавлением собственных методов и полей
 */
public class ComedyMovie extends DomesticMovie {

    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ComedyMovie(String title){
        super(title, Genre.COMEDY);
    }
    // переопределяем toString() чтобы отоброжать дополнитетное
    // поле Rating
    @Override
    public String toString(){
        return super.toString() + ". Rating: " + rating;
    }
}
