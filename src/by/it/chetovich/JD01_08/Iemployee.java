package by.it.chetovich.JD01_08;

/**
 * Interface for all employees
 */
public interface Iemployee {

    void printName ();
    void function();
    void isItr ();
    void paySalary () throws NegativeSalaryException;
    void paySalary (int bonus) throws NegativeSalaryException;
    void goToVacation ();
    boolean getFired (boolean fired);
    void payCompensation (int compensation) throws NegativeSalaryException;








}
