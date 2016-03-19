package by.it.Baranova.JD02.JD02_05;

import javafx.scene.input.DataFormat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;


public class Main {
    public static void main(String[] args)throws IOException {
        DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.US);
        for (Integer j=0;j<3;j++) {
            String i = j.toString();
            PrintToConsole.printToConsole(i);
        }
        System.out.println("Введите язык: en/ be/ ru");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine=bufferedReader.readLine();

        while (rLine.trim().length()>0){
            PrintToConsole.printToConsole(rLine);
            System.out.println("Введите язык: en/ be/ ru");
            rLine=bufferedReader.readLine();
        }
    }
}
