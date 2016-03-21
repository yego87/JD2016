package by.it.zebnitskiy.Math_lab;

/**
 * Created by Зебницкий Максим on 3/10/2016.
 */

public class Project {
    //это основной класс учебного проекта, поэтому нужно добавить
    public static void main(String[] args){
        //проверим сложение
        Variable one = new Variable("2.2");
        Variable two = new Variable("3.3");
        //создадим результат сложения
        Variable res = one.add(two);
        //проверяем ли работает проект
        System.out.println( one + " + " + two+" = " + res );
    }

}

