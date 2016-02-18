package by.it.chetovich.JD01_08;

/**
 * Class for managers at Engineer Department
 */
public class ManagerProduction extends Engineer {


    public ManagerProduction(String name, int salary, boolean itr, int rank, String department){
        super(name,salary,itr,department,rank);

    }

    @Override
    public void function() {
        System.out.println("Duties: production reports, technical documantation.");

    }

    @Override
    public void goToVacation() {
        System.out.println("Directors go to Italy.");
    }

    @Override
    public void paySalary() {
        System.out.println("Pay "+this.salary+" to "+this.name);
    }

    @Override
    public void paySalaryAndBonus(int bonus) {
        System.out.println("Pay "+this.salary+" and bonus "+bonus+" to "+this.name);
    }

    @Override
    public String toString (){
        return "Production director "+this.name+(this.itr?" is itr ":" is not itr ")+ ", works at "+department+" and gets salary " + this.salary+" dollars. ";
    }

    @Override
    public void showRank() {
        System.out.println("The rank is "+this.rank);
    }
}
