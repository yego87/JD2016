package by.it.chetovich.JD01_08;

/**
 * Class for managers at Administration department
 */
public class ManagerFinance extends Administration {

    public ManagerFinance(String name, int salary, boolean itr, String department){
        super(name,salary,itr,department);

    }


    @Override
    public  void function() {
        System.out.println("Duties: finance reports, budget control, tax regulation. ");
        super.function();
    }

    @Override
    public void paySalary() {
        System.out.println("Pay "+this.salary+" to "+this.name);
    }

    @Override
    public void paySalaryAndBonus(int bonus) {
        System.out.println("Pay "+this.salary+" and bonus "+bonus+" to "+this.name);
    }

    @Override public String toString (){
        return "Finance director "+this.name+(this.itr?" is itr ":" is not itr ")+ ", works at "+department+" department and gets salary " + this.salary+" dollars";
    }


    @Override
    public void goToVacation() {
        System.out.println("Directors go to Italy.");
    }




}
