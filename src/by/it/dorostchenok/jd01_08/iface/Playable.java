package by.it.dorostchenok.jd01_08.iface;

public interface Playable {
    void play();
    void stop();
    void pause();
    void unPause();
    void seek(int second);
    boolean isPlaying();
    boolean isPaused();

}