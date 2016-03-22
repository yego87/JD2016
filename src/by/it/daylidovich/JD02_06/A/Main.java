package by.it.daylidovich.JD02_06.A;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Log.getInstanse();
        Log.writeLog("Проверка связи!!!", new Date(System.currentTimeMillis()));
    }
}