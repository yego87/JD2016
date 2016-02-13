package by.it.podelstchikova.jd05;


import java.io.IOException;

public class Main {
    public static void  main(String[] args) throws IOException {
        Task1.printValue(756.13,0.3);

        double a=Task2.scanValue();
        double b=Task2.scanValue();
        System.out.println(Task2.printValue(a,b));
        Task3.printTable();
        Task4.printValue();
        Task5.printValue();
        Task6.printValue();
        Task7.printVal();
    }

}
