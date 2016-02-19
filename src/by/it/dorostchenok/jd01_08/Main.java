package by.it.dorostchenok.jd01_08;

import by.it.dorostchenok.jd01_08.iface.Movie;
import by.it.dorostchenok.jd01_08.impl.DomesticMovie;

public class Main {
    public static void main(String[] args){
        Movie movie = new DomesticMovie("Приключения Шурика");

        System.out.println(movie.getGenre());
    }
}
