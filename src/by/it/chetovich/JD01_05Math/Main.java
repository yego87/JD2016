package by.it.chetovich.JD01_05Math;
import static java.lang.Math.*;

/**
 * Created by user_2 on 10.02.2016.
 */
public class Main {
    public static void main (String [] args){

        //Task1
        double x = 12.6453;
        Task1Math task1 = new Task1Math();
        System.out.print("y = ");
        System.out.printf("%.5f", task1.searchY(x));
        System.out.println();

        //Task2
        double a = 0.3;
        double b = -21.17;
        Task2 task2 = new Task2();
        System.out.print("y = ");
        System.out.printf("%.5f", task2.searchY(a, b));
        System.out.println();

        //Task3
        x = 3.67;
        Task3 task3 = new Task3();
        task3.searchF(x);

        //Task4
        Task4 task4 = new Task4();
        System.out.print("d = ");
        System.out.printf("%.4f", task4.searchD());
        System.out.println();

        //Task5
        Task5 task5 = new Task5();
        task5.searchY(0.491*Math.pow(10,4));

        //Task6
        Task6 task6 = new Task6();
        task6.createArray(-1.2, 2.1, 20); //zamenila interval do 2.1 vmesto 2.7, t.k. polu4alsya nepravilniy argument arcsin

        //Task7
        Task7 task7 = new Task7();
        task7.createArrays();
        ArrayTableForTask7 arrayTable = new ArrayTableForTask7();





    }
}
