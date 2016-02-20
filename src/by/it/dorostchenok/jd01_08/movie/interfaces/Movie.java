package by.it.dorostchenok.jd01_08.movie.interfaces;

import by.it.dorostchenok.jd01_08.movie.impl.AbstractMovie.Genre;

/**
 * Базовый тип для сущности "фильм" расширяет интерфейс Playable
 * чтобы избежать множественной реализации интерфейсов
 * и сохранить Movie как базовый тип для всех фильмов
 */
public interface Movie extends Playable{
    /**
     * Возвращает жанр фильма
     * @return
     */
    Genre getGenre();

    /**
     * Возвращает название фильма
     * @return
     */
    String getTitle();
}
