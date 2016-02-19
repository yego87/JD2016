package by.it.chetovich.JD01_08;

/**
 * Class for employees at Engineer department
 */
public abstract class Engineer implements Iemployee{

    String name; //общие поля для всех классов, отнаследованных от Engineer
    int salary;
    boolean itr;
    String department;

    public Engineer(String name, int salary, boolean itr,String department){
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.itr = itr;
    }

    public String workPlace(){ //sobstvenniy metod klassa
        return "Engineer employees work at the fabric outside the city.";
    }

    @Override
    public void printName() {
        System.out.println("Name: "+this.name);
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
    public void paySalary(){
        System.out.println("Pay "+this.salary+" to "+this.name+".");
    }

    @Override
    public void paySalary(int bonus){
        System.out.println("Pay "+this.salary+" and bonus "+bonus+" to "+this.name+".");
    }

    @Override
    public void goToVacation() {
        if (this.salary>1000) System.out.println(this.name+" can afford going to Italy to vacation. ");
        else System.out.println(this.name+" goes to Turkey to vacation. ");
    }

    @Override
    public boolean getFired(boolean fired) {
        if (!fired) {
            System.out.println(this.name+" is a good employee, should get bonus. ");
            return true;
        }
        else {
            System.out.println(this.name+" is a bad employee, should be fired! ");
            return false;
        }
    }

    @Override
    public void payCompensation(int compensation) {
        System.out.println("Pay to "+this.name+" a compensation "+compensation+". ");
    }
}
