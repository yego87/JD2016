package by.it.daylidovich.JD02_01_and_02.Utils;

public class SleepTime {
    public static void sleepTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания.");
        }
    }
}
