package by.it.dorostchenok.jd01_08.movie.interfaces;

/**
 * Интерфейс описывает возможности управления фильмом - прсмотр фильма
 */
public interface Playable {

    /**
     * Начать воспроизведение
     */
    void play();

    /**
     * Остановить воспроизведение
     */
    void stop();

    /**
     * Приостановить воспроизведение. В отличие от stop() позволяет продолжить
     * воспроизведение в будущем с момента остановки
     */
    void pause();
    /**
     * Продлжить воспризведения с момента вызова pause()
     */
    void unPause();

    /**
     * Возвращает состояние вспроизведения
     * @return
     */
    boolean isPlaying();

    /**
     * Возвращает состояние приостановки
     * @return
     */
    boolean isPaused();

}