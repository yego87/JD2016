package by.it.dorostchenok.jd01_08.impl;

import by.it.dorostchenok.jd01_08.iface.Movie;
import by.it.dorostchenok.jd01_08.iface.Playable;

public abstract class AbstractMovie implements Movie, Playable {

    public AbstractMovie(String title){
        this.title = title;
    }

    public enum Genre {COMEDY, HORROR, DOCUMENTARY, SCIENCE;}
    private String title;
    private Genre genre;
    private boolean isPlaying;
    private boolean isPaused;

    @Override
    public Genre getGenre() {
        return this.genre;
    }

    @Override
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void unPause() {

    }

    @Override
    public boolean isPlaying() {
        return this.isPlaying;
    }

    @Override
    public boolean isPaused() {
        return isPaused;
    }

    @Override
    public void seek(int second) {

    }

    public abstract String toString();
}
