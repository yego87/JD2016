package by.it.zebnitskiy.JD_01.JD_01_08.zadanie_A;

/**
 * Created by Зебницкий Максим on 3/3/2016.
 */
public class VideoPlayer extends Player {

    @Override
    public String showState(){
        String state = "Плеер остановлен";
        if (this.isStatePlay()){
            state = "Воспроизведение видео";
            if (this.isStatePause());
            state = "Плеер на паузе";
        }
        return state;
    }




}
