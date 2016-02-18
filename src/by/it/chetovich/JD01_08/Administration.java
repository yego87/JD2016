package by.it.chetovich.JD01_08;

/**
 * Class for employees at Administration department
 */
public abstract class Administration implements Iemployee {

    String name;
    int salary;
    boolean itr;
    String department;
    boolean businessTrip;

    public Administration(String name, int salary, boolean itr,String department, boolean businessTrip){
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.itr = itr;
        this.businessTrip = businessTrip;
    }

    public String workPlace(){ //sobstvenniy metod klassa
        return "Administration employees work in the office in the city center. ";
    }

    public String businessTrips(boolean trip){
        if (trip) return " has to ";
        else return " doesn't have to";
    }

    @Override
    public void printName() {
        System.out.println("Name: "+this.name);
    }

    @Override
    public void function(){
        System.out.print("Duties: administration. ");
    }

    @Override
    public void isItr() {
        System.out.println("Employee is not itr. ");
    }

    @Override
    public void paySalary(){
        System.out.println("Pay "+this.salary+" to "+this.name);
    }

    @Override
    public void paySalary(int bonus){
        System.out.println("Pay "+this.salary+" and bonus "+bonus+" to "+this.name);
    }

    @Override
    public void goToVacation() {
        if (this.salary>1000) System.out.println(this.name+" can afford going to Italy to vacation. ");
        else System.out.println(this.name+" goes to Turkey. ");
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

    @Override
    public void payCompensation(int compensation) {
        System.out.println("Pay to "+this.name+" a compensation "+compensation+". ");
    }




}
