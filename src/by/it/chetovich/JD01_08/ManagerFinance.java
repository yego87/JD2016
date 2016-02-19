package by.it.chetovich.JD01_08;

/**
 * Class for managers at Administration department
 */
public class ManagerFinance extends Administration {

    String education; //добавляем новое поле
    public ManagerFinance(String name, int salary, boolean itr, String department, boolean businessTrip, String education){
        super(name,salary,itr,department,businessTrip); //вызываем конструктор предка
        this.education = education;
    }

    @Override
    public  void function() {
        super.function();
        System.out.println("Finance reports, budget control, tax regulation. ");
    }

    @Override public String toString (){
        return "Finance manager "+this.name+(this.itr?" is itr ":" is not itr ")+ ", works at "+department+
                " department and gets salary " + this.salary+" dollars.";
    }
}
