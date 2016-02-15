package by.it.lukin.jd02.jd01_3B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Найти корни квадратного уравнения.Параметры уравнения передавать с командной строки
 */
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //String rLine = bufferedReader.readLine();


        System.out.printf("Введите число a (a ? 0) - ");
        int a = Integer.parseInt(bufferedReader.readLine());

        System.out.printf("Введите число b - ");
        int b = Integer.parseInt(bufferedReader.readLine());

        System.out.printf("Введите число c - ");
        int c = Integer.parseInt(bufferedReader.readLine());

        int D = b*b-(4*a*c);

        if(D < 0)
        {
            System.out.println("Корней нет! Ничего считать не надо!");
        }
        else if (D == 0)
        {
            System.out.println("Есть ровно один корень!");

            double d = Math.sqrt(D);

            double x = (-b+d)/2*a;

            System.out.printf("И мы его нашли x = %s", x);
        }
        else if(D > 0)
        {
            System.out.println("Корней будет два!");

            double d = Math.sqrt(D);

            double x1 = (-b+d)/2*a;
            int i1 = (int) x1;
            double x2 = (-b-d)/2*a;
            int i2 = (int) x2;

            System.out.printf("И мы их нашли x(1) = %s и x(2) = %s", i1, i2);
        }
        bufferedReader.close();
    }
}

