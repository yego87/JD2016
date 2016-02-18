package by.it.veselov.JD01_02.Task_1_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yegorveselov on 18.02.16.
 */
public class Task_B_4 {
    public static void main(String[] args) throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    String sa = bufferedReader.readLine();// тут строку переводим в стринг
    String [] d=sa.split(" ");//тут создаем массив стринг
    int month=Integer.valueOf(d[0]);// тут переводим массив стринг в массив инт(а нельзя сразу что бы инт был??)
    bufferedReader.close();//это за чем??

    switch (month) {
        case 1:{System.out.println("январь");break; }
        case 2:{System.out.println("февраль");break; }
        case 3:{System.out.println("март");break; }
        case 4:{System.out.println("апрель");break; }
        case 5:{System.out.println("май");break; }
        case 6:{System.out.println("июнь");break; }
        case 7:{System.out.println("июль");break; }
        case 8:{System.out.println("август");break; }
        case 9:{System.out.println("сентябрь");break; }
        case 10:{System.out.println("октябрь");break; }
        case 11:{System.out.println("ноябрь");break; }
        case 12:{System.out.println("декабрь");break; }


    }
}}
