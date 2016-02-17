package by.it.chetovich.JD01_02_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yultos_ on 03.02.2016.
 */
public class B1interval {
    public void interval() throws IOException {
        System.out.println("Enter a number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Enter 2 numbers of the range");
        int rangeBegin = Integer.parseInt(reader.readLine());
        int rangeEnd = Integer.parseInt(reader.readLine());
        if (number<=rangeEnd&&number>=rangeBegin) System.out.println("This number is in the range.");
        else System.out.println("This number is out of the range.");
    }
}
