package by.it.chetovich.JD01_08;

import java.io.IOException;

/**
 * @author Yultos_
 * JD01_08
 */
public class Main {
    public static void main (String [] args) throws IOException {

        ManagerProduction manProd = new ManagerProduction("Ivanov",1500,true,6,"Assemblage",1);
        manProd.printName();
        manProd.isItr();
        manProd.showRank();
        System.out.println(manProd);

        try {
            if (manProd.getFired(false)) manProd.paySalary(200);
            else manProd.payCompensation(1000);
        } catch (NegativeSalaryException e) {
            System.out.println("Exception handling: "+e);
        }

        LearnDuties.learnDuties(manProd);
        manProd.goToVacation();
        System.out.println("Work place of "+manProd.name+": "+manProd.workPlace());
        System.out.println();

        ManagerLogistics manLog = new ManagerLogistics("Petrov",600,true, "Warehouse");
        System.out.println(manLog);
        System.out.println("Work place of "+manProd.name+": "+manProd.workPlace());
        manLog.goToVacation();

        try {
            if (manProd.getFired(true)) manProd.paySalary(200);
            else manProd.payCompensation(1000);
        } catch (NegativeSalaryException e) {
            System.out.println("Exception handling: " + e);
        }

        System.out.println();

        ManagerFinance manFin = new ManagerFinance("Sidorova",1200,false, "Accounting",false, "High" );
        System.out.println(manFin);
        System.out.println("Work place of " + manFin.name + ": " + manFin.workPlace());
        LearnDuties.learnDuties(manFin);
        System.out.println(manFin.name+manFin.businessTrips(false)+" go to business trips.");
        manFin.paySalary();


    }
}
