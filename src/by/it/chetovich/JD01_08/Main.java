package by.it.chetovich.JD01_08;

import java.io.IOException;

/**
 * @author Yultos_
 * JD01_08
 */
public class Main {
    public static void main (String [] args) throws IOException {

        //Engineer engineer = new Engineer("Production");
        ManagerProduction dirProd = new ManagerProduction("Ivanov", 500, true, 6, "Production");
        dirProd.printName();
        LearnDuties.learnDuties(dirProd);
        dirProd.isItr();
        System.out.println(dirProd);
        dirProd.paySalaryAndBonus(100);
        ShowRank.showRank(dirProd);

        if (dirProd.getFired(false)) dirProd.paySalary();
        else dirProd.paySalaryAndBonus(100);

        ManagerFinance dirFin = new ManagerFinance("Pavlov", 1000, false, "Administration" );
        System.out.println(dirFin);
        LearnDuties.learnDuties(dirFin);

        dirFin.printName();


    }
}
