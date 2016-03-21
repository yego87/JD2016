package by.it.zebnitskiy.JD_01.JD_01_08.zadanie_A;

/**
 * Created by Зебницкий Максим on 3/3/2016.
 */
public abstract class Player implements ITechnic{

    //теперь два состояния, общие для любых возможных реализаций плеера
    //первое - играет он или нет
    private boolean statePlay = false;
    //второе - стоит ли плеер на паузе
    private boolean statePause = true;
    //теперь реализуем интерфейсы

    @Override
    public boolean play(){
        //при воспроизведении флаг паузы получает значение false а флаг воспроищведении true
        statePlay  = true;
        statePause = false;
        return statePlay;
    }
    @Override
    public boolean stop(){
        //при остановке флаг воспроизводениея и паузы переходит в состояние false
        boolean result = statePlay;
        statePlay = false;
        statePause = false;
        return result;

    }
    @Override
    public void pause(){
        //при паузе флаг инвертирует свое состояние
        statePause =! statePause;
    }

    public abstract String showState();

    public boolean isStatePlay(){
        return statePlay;
    }
    public boolean isStatePause(){
        return statePause;
    }


}
