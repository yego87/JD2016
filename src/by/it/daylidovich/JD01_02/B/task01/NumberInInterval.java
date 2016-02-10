package by.it.daylidovich.JD01_02.B.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumberInInterval {
    int N,a,b;
    public void Read() throws IOException {
        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rLine = reader.readLine();
        N = Integer.parseInt(rLine);

        System.out.println("Введите интервал:");

        rLine = reader.readLine();
        String[] st = rLine.split(" ");
        a = Integer.parseInt(st[0]);
        b = Integer.parseInt(st[1]);
    }
    public void InInterval(){
        if(N>a&&N<b)
            System.out.println("Число входит в интервал.");
        else
            System.out.println("Число не входит в интервал.");
    }
}
