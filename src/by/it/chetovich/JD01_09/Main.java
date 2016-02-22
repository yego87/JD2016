package by.it.chetovich.JD01_09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


/**
 * Created by user_2 on 19.02.2016.
 */
public class Main {

    public static void main (String [] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //вводим строку
        String line = reader.readLine();

        String[] array = LineToArray.convertLineToArray(line); //разбиваем строку на массив из 2 операндов

        Var a = DefineVariable.defineVar(array[0]);  //первый операнд
        Var b = DefineVariable.defineVar(array[1]);  //второй операнд

        if (line.contains("+")) {
            System.out.print(a + " + " + b + " ");
            Print.print(a.add(b));
        }

        if (line.contains("-")) {
            System.out.print(a + " - " + b + " ");
            Print.print(a.sub(b));
        }

        if (line.contains("*")) {
            System.out.print(a + " * " + b + " ");
            Print.print(a.multi(b));
        }

        if (line.contains("/")) {
            System.out.print(a + " / " + b + " ");
            Print.print(a.divide(b));
        }

    }
}
