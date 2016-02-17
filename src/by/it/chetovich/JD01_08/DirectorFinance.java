package by.it.chetovich.JD01_08;

/**
 * Created by user_2 on 17.02.2016.
 */
public class DirectorFinance extends Director {

    private String name;
    private int salary;
    private boolean itr;
    public DirectorFinance(String name, int salary, boolean itr){
        this.name = name;
        this.salary = salary;
        this.itr = itr;
    }


    public static void function() {
        System.out.println("Duties: financial reports, taxes, budget.");
    }




    public void isItr (boolean itr){
        if (itr) System.out.println("Employee is itr");
        else System.out.println("Employee is not itr");
    }

    @Override
    public void paySalary(int salary) {
        System.out.println("Pay "+salary+" to "+this.name);
    }

    @Override
    public void paySalary(int salary, int bonus) {
        System.out.println("Pay "+salary+" and bonus "+bonus+" to "+this.name);
    }

    @Override
    public String toString (){
        return "Finance director "+this.name+(this.itr?" is itr ":" is not itr ")+ " and gets salary " + this.salary+" dollars";
    }



}
