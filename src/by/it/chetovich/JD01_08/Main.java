package by.it.chetovich.JD01_08;

/**
 * Created by user_2 on 17.02.2016.
 */
public class Main {
    public static void main (String [] args){
        DirectorFinance dirFin = new DirectorFinance("Ivan", 500, true);
        //dirFin.printName("Ivan"); rabotaet esli nasledovatsa ot interfeysa
        dirFin.isItr(true);
        System.out.println(dirFin);
        dirFin.paySalary(500, 100);
        LearnDuties.learnDuties(dirFin);

    }
}
