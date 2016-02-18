package by.it.akhmelev.JD01_09.inner;

import by.it.akhmelev.JD01_09.nested.ParentForNested;

/**
 * Created by Alex on 18.02.2016.
 */
public class Main {
    public static void main(String[ ] args) {
        // вызов статического метода
        ParentClass.SubClass sc=new ParentClass().new SubClass();
        sc.launch();
    }
}


