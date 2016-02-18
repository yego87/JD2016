package by.it.akhmelev.JD01_09.inner;

/**
 * Created by Alex on 18.02.2016.
 */
public class ExtendedClass extends ParentClass{
    protected class SubExtended extends SubClass {
        public SubExtended() {
            System.out.println("SubExtended создан");
        }
    }
}
