package by.it.predkel.MatLab;

/**
 * Created by Admin on 19.02.2016.
 */
public class Main{

    public static void main (String [] args){
        FloatVar var = new FloatVar(5);
        FloatVar varr = new FloatVar(10);

        System.out.println(var.addFloat(varr));
    }
}