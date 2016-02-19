package by.it.dorostchenok.jd01_08;

import by.it.dorostchenok.jd01_08.movie.interfaces.Movie;
import by.it.dorostchenok.jd01_08.movie.impl.ComedyMovie;
import by.it.dorostchenok.jd01_08.movie.impl.DocumentaryMovie;

public class Main {
    public static void main(String[] args){
        Movie movie = new ComedyMovie("Приключения Шурика");
        Movie docMovie = new DocumentaryMovie("Полет на Луну");

        movie.play();
        docMovie.play();
        System.out.println(movie);
        System.out.println(docMovie);
    }
}
