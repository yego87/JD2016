package by.it.predkel.MatLab;

import java.io.IOException;

/**
 * Created by Admin on 19.02.2016.
 */
public class Main{

    public static void main (String [] args) throws IOException {
        //FloatVar var = new FloatVar(5);
        //FloatVar var1 = new FloatVar(10);

       // System.out.println(var.addFloat(var1));
/*

        MatrixVar matrix=new MatrixVar(mass);
        matrix.outPut();*/
        double[][] mass={{5.0,5.0},{5.0,6.0}};
        MatrixVar a=new MatrixVar(mass);
        FloatVar b=new FloatVar("6");
        a.add(b);
        a.outPut();
    }
}