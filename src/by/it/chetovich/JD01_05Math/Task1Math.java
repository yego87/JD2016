package by.it.chetovich.JD01_05Math;

/**
 * Created by user_2 on 10.02.2016.
 */
public class Task1Math {

    public double searchY (double x){
        //razbili uravnenie na 4 chasti: 3 v 4islitele i 1 v znamenatele

        double a = Math.sin(Math.pow((Math.PI/6-1),2));
        double b = Math.pow((3 + Math.pow(x, 2)), 1 / 4);
        double c = Math.pow(Math.log(Math.pow(x, 3) - 1), 3);
        //vmesto x v arcsinus stavlu 1
        double d = Math.asin(1/2) - 1.756*Math.pow(10, -2);
        return  (a+b-c)/d;

    }
}
