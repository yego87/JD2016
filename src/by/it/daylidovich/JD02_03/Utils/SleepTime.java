package by.it.daylidovich.JD02_03.Utils;

public class SleepTime {
    public static void sleepTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания.");
        }
    }
}
