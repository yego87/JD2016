package by.it.podelstchikova.jd05;


import java.io.IOException;

public class Main {
    public static void  main(String[] args) throws IOException {
        Task1.printValue(756.13,0.3,true);
        Task1.printValue(756.13,0.3,false);

        double a=Task2.scan();
        double b=Task2.scan();
        System.out.println(Task2.printValue(a,b));
        Task3.printTable();

        Task5.printValue();
        Task6.printValue();
    }

}
