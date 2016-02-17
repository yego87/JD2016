package by.it.chetovich.JD01_08;

/**
 * Created by Yultos_ on 17.02.2016.
 */
public class DirectorMarketing extends Director {
    private String name;
    private int salary;
    private boolean itr;
    public DirectorMarketing(String name, int salary, boolean itr){
        this.name = name;
        this.salary = salary;
        this.itr = itr;
    }


    public static void function() {
        System.out.println("Duties: market research, sales reports, ads.");
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

    @Override public String toString (){
        return "Marketing director "+this.name+(this.itr?" is itr ":" is not itr ")+ " and gets salary " + this.salary+" dollars";
    }



}
