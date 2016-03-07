package by.it.daylidovich.JD01_15.C;

import java.io.IOException;

import static by.it.daylidovich.JD01_15.C.CommandLine.*;
import static by.it.daylidovich.JD01_15.C.Reader.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String command;
        System.out.println(getAddress());
        while (!"exit".equals(( command = readInput()).trim())){
            switch (readCommand(command)){
                case "dir":{
                    contentFolder();
                    break;
                }
                case "cd":{
                    changeDirectory(command);
                    break;
                }
                default:{
                    System.out.println("Некоректный ввод.");
                }
            }
            System.out.println(getAddress());
        }
    }
}
