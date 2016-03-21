package by.it.zebnitskiy.JD_01.hw1_mesyci;

/**
 * Created by Зебницкий Максим on 2/10/2016.
 */
//ax^2+bx+c=0
public class Main {
    public  static void main(String[] args){
    double a = 2, b = 5, c = 2;
    double D = Math.pow(b, 2) - 4 * a * c;
    double x1, x2;
    if (D  >  0){
        x1 = (-b + Math.sqrt(D)) / (2 * a);
        x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("Число действительных корней!");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    } else if (D < 0) {
        System.out.println("не верное решение");    //не получается задать условие  D = 0 чтоб была проверка на один корень

    }    else if(D == 0) {
        x1 = (-b) / (2 * a);
        x2 = (-b) / (2 * a);
        System.out.println("x1 = " + x1 + "x2 = " + x2);
        System.out.println("Нет корней!))))");
    }
}

}




