package by.it.dorostchenok.jd01_08.movie.interfaces;

public interface Playable {
    void play();
    void stop();
    void pause();
    void unPause();
    void seek(int second);
    boolean isPlaying();
    boolean isPaused();

}
