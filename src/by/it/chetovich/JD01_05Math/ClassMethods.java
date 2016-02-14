package by.it.chetovich.JD01_05Math;

import java.lang.reflect.Method;

/**
 * Prints Math methods
 */
public class ClassMethods {
    public void printClassMethods(){
        Class mathMethods = Math.class;
        Method[] methods = mathMethods.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType().getName()+" "+method.getName());
        }
    }
}
