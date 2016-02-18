package by.it.chetovich.JD01_08;

/**
 * Interface for all employees
 */
public interface Iemployee {

    String name = "";
    int salary = 0;
    boolean itr = true;
    String department = "";

    void printName ();
    void function();
    void isItr ();
    void paySalary ();
    void paySalary (int bonus);
    void goToVacation ();
    boolean getFired (boolean fired);
    void payCompensation(int compensation);








}
