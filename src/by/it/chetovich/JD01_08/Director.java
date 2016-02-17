package by.it.chetovich.JD01_08;

/**
 * Created by Yultos_ on 17.02.2016.
 */
public class Director {

    private String name;
    private int salary;
    private boolean itr;



    public static void function (){
        System.out.println("Duties: manage the department");

    }

    //@Override
    public void paySalary(int salary) {
        System.out.println("Pay "+salary+" to "+name);
    }

    //@Override
    public void paySalary(int salary, int bonus) {
        System.out.println("Pay "+salary+" and bonus "+bonus+" to "+name);
    }

    public void isItr (boolean itr){
        if (itr) System.out.println("Employee is itr");
        else System.out.println("Employee is not itr");
    }

    @Override
    public String toString (){
        return "Finance director "+this.name+(this.itr?" is itr ":" is not itr ")+ " and gets salary " + this.salary+" dollars";
    }



}
