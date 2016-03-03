package by.it.Baranova.JD01_08_OOP;

/**
 * Created by Ekaterina on 3/3/16.
 */
public class WrongCourseNumberException extends Exception {
    public WrongCourseNumberException() {
    }
    public WrongCourseNumberException(String message, Throwable exception) {
        super(message, exception);
    }
    public WrongCourseNumberException(String message) {
        System.out.println("Ошибка:"+message);
    }
    public WrongCourseNumberException(Throwable exception) {
        super(exception);
    }
}
