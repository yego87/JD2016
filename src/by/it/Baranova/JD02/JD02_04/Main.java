package by.it.Baranova.JD02.JD02_04;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Введите выражение, которое хотите вычислить");
        String rLine=Utils.Readline();
        Utils.findNumbers(rLine);
    }

}
