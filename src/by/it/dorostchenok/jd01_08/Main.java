package by.it.dorostchenok.jd01_08;

import by.it.dorostchenok.jd01_08.movie.impl.ComedyMovie;
import by.it.dorostchenok.jd01_08.movie.impl.DocumentaryMovie;
import by.it.dorostchenok.jd01_08.movie.interfaces.Movie;

public class Main {
    public static void main(String[] args){

        // Пример полиморфизма. Ссылка одного типа, но вызываются методы соотвествующего
        // класса
        Movie comedyMovie = new ComedyMovie("Приключения Шурика");
        Movie docMovie = new DocumentaryMovie("Полет на Луну");
        comedyMovie.play();
        docMovie.play();
        // Приведение типа дает доступ к специфическим методам класса
        ((ComedyMovie)comedyMovie).getRating();

        // Вызываем соотвествующий классу (переопределенный) метод
        System.out.println(comedyMovie);
        System.out.println(docMovie);
    }
}
