package by.it.daylidovich.JD01_02.B.task01;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NumberInInterval numberInInterval = new NumberInInterval();
        System.out.println("Привет");
        numberInInterval.Read();
        numberInInterval.InInterval();
    }
}
