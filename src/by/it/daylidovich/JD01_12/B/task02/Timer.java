package by.it.daylidovich.JD01_12.B.task02;

public class Timer{
    private  long iniTime;
    private  Double Delta;
    public Timer(){
        iniTime=System.nanoTime();
    }
    public  String toString(){
        Delta=(double)(System.nanoTime()-iniTime)/1000;
        iniTime=System.nanoTime();
        return Delta.toString()+" микросекунд.";
    }

}
