package by.it.predkel.JD12Collections;

/**
 * Created by Admin on 28.02.2016.
 */
public class Timer {
    public long iniTime;
    private Double Delta;
    public Timer(){ iniTime=System.nanoTime();}
    public String toString(){
        Delta=(double)System.nanoTime()-iniTime/1000;
        iniTime=System.nanoTime();
        return "Прошло "+Delta.toString()+" микросекунд.";
    }
}
