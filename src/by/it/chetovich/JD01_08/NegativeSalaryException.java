package by.it.chetovich.JD01_08;

/**
 * My Exception for negative salary
 */
public class NegativeSalaryException extends Exception {

    int salary;
    public NegativeSalaryException(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary can't be negative, like "+this.salary;
    }
}
