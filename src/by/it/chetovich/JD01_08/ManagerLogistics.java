package by.it.chetovich.JD01_08;

/**
 * Class for managers at Engineer department
 */
public class ManagerLogistics extends Engineer {

    private String name;
    private int salary;
    private boolean itr;
    public ManagerLogistics(String name, int salary, boolean itr, int rank, String department){
        super(name,salary,itr,department,rank);

    }


    @Override
    public  void function() {
        System.out.println("Duties: operating supplies orders, transport organisation, transactional support, warehouse.");
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
        return "Logistics director "+this.name+(this.itr?" is itr ":" is not itr ")+ " and gets salary " + this.salary+" dollars";
    }

    @Override
    public void showRank() {
        System.out.println("The rank is " + this.rank);
    }
}
