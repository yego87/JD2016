package by.it.dorostchenok.jd01_08.movie;

import by.it.dorostchenok.jd01_08.movie.interfaces.Movie;
import by.it.dorostchenok.jd01_08.movie.interfaces.Playable;

public abstract class AbstractMovie implements Movie, Playable {

    public AbstractMovie(String title, Genre genre){
        this.title = title;
        this.genre = genre;
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
    public String getTitle() {
        return this.title;
    }

    @Override
    public void play() {
        if (!isPlaying){
            System.out.println("Start playing: " + title + " From class: " + getClass().getSimpleName());
            isPlaying = true;
        }
    }

    @Override
    public void stop() {
        if (isPlaying){
            System.out.println("Stop playing: " + title + " From class: " + getClass().getSimpleName());
            isPlaying = false;
            isPaused = false;
        }
    }

    @Override
    public void pause() {
        if (isPlaying && !isPaused){
            System.out.println("Pause playing: " + title + " From class: " + getClass().getSimpleName());
            isPaused = true;
            isPlaying = false;
        }
    }

    @Override
    public void unPause() {
        if (isPaused){
            System.out.println("Continue playing: " + title + " From class: " + getClass().getSimpleName());
            isPaused = false;
            isPlaying = true;
        }
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
