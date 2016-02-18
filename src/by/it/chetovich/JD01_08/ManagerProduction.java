package by.it.chetovich.JD01_08;

/**
 * Class for managers at Engineer Department
 */
public class ManagerProduction extends Engineer {

    int shift; //rabo4aya smena
    int rank; //rabo4iy razrad

    public ManagerProduction( String name, int salary, boolean itr, int rank, String department, int shift){
        super(name,salary,itr,department);
        this.shift = shift;
        this.rank = rank;
    }

    public void showRank (){  //sobstvenniy metod
        System.out.println("The rank is "+this.rank);
    }

    @Override
    public void function() {
        System.out.println("Duties: production reports, technical documantation, production control. ");
    }

   /* @Override
    public void showRank() {
        System.out.println("The rank is "+this.rank);
    }*/

    /*@Override
    public void paySalary() {
        System.out.println("Pay "+this.salary+" to "+this.name);
    }*/

    /*@Override
    public void paySalaryAndBonus(int bonus) {

    }*/

    @Override
    public void goToVacation() {
        if (this.rank>4&&this.salary>1000) System.out.println(this.name+" can afford going to Italy to vacation. ");
        else System.out.println(this.name+" goes to Turkey to vacation. ");
    }

    @Override
    public String toString (){
        return "Production manager "+this.name+(this.itr?" is itr ":" is not itr ")+ ", works at "+
                department+" Department at "+shift+" shift and gets salary " + this.salary+" dollars. ";
    }


}
