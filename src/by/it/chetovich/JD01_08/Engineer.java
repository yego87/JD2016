package by.it.chetovich.JD01_08;

/**
 * Class for employees at Engineer department
 */
public abstract class Engineer implements Iemployee{

    String name;
    int salary;
    boolean itr;
    String department;
    int rank;

    public Engineer(String name, int salary, boolean itr,String department, int rank){
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.itr = itr;
        this.rank = rank;
    }

    public void showRank (){  //sobstvenniy metod

    }

    @Override
    public void printName() {
        System.out.println("Name: "+this.name);
    }

    @Override
    public void paySalary(){

    }

    @Override
    public void paySalaryAndBonus(int bonus){

    }

    @Override
    public void function(){
        System.out.println("Duties: engineering. ");
    }

    @Override
    public void isItr() {
        System.out.println("Employee is itr. ");
    }

    @Override
    public void goToVacation() {
        System.out.println("Engineers go to Turkey. ");
    }

    @Override
    public boolean getFired(boolean fired) {
        if (fired) {
            System.out.println("Bad employee, should be fired! ");
            return true;
        }
        else {
            System.out.println("Good employee, should get bonus. ");
            return false;
        }
    }


}
