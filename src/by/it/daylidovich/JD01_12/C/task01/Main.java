package by.it.daylidovich.JD01_12.C.task01;

import java.util.TreeMap;

import static by.it.daylidovich.JD01_12.C.task01.Encoding.*;

public class Main {
    public static void main(String[] args){
        String string = "лодка танк самолет танк ";
        TreeMap<Integer, String> cod = createC1(string);
        System.out.println("Кодировка.");
        printCod(cod);
        cod = squeezeC1(cod);
        System.out.println("Сжатая кодировка.");
        printCod(cod);
    }
}
