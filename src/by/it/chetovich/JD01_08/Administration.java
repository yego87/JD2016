package by.it.chetovich.JD01_08;

/**
 * Class for employees at Administration department
 */
public abstract class Administration implements Iemployee {

    String name;
    int salary;
    boolean itr;
    String department;

    public Administration(String name, int salary, boolean itr,String department){
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.itr = itr;
    }

    @Override
    public void paySalary(){

    }

    @Override
    public void paySalaryAndBonus(int bonus){

    }

    @Override
    public void printName() {
        System.out.println("Name: "+this.name);
    }

    @Override
    public void function(){
        System.out.println("Duties: administration. ");
    }

    @Override
    public void isItr() {
        System.out.println("Employee is not itr. ");
    }

    @Override
    public void goToVacation() {
        System.out.println("Administration go to Italy. ");
    }

    @Override
    public boolean getFired(boolean fired) {
        if (fired) {
            System.out.println("Bad director, should be fired! ");
            return true;
        }
        else {
            System.out.println("Good director, should get bonus. ");
            return false;
        }
    }




}
