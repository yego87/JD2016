package by.it.predkel.MatLab;

import java.io.IOException;

import static by.it.predkel.MatLab.InputExpression.input;

/**
 * Created by Admin on 19.02.2016.
 */
public class Main{

    public static void main (String [] args) throws IOException {
        //FloatVar var = new FloatVar(5);
        //FloatVar var1 = new FloatVar(10);

       // System.out.println(var.addFloat(var1));
/*
        float[][] mass=input();
        MatrixVar matrix=new MatrixVar(mass);
        matrix.outPut();*/
        FloatVar a=new FloatVar(5);
        FloatVar b=new FloatVar(6);
        a.add(b);
        System.out.print(a);
    }
}