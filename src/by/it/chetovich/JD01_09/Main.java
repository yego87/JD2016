package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public class Main {

    public static void main (String [] args){
        FloatVar fl1 = new FloatVar(5);
        FloatVar fl2 = new FloatVar(10);
        float [] vec1 = {3,2};
        float [][] mat1 = {{1,2},{4,6}};
        float [][] mat2 = {{0,4,4},{2,8,5}};

        VectorVar v1 = new VectorVar(vec1);
        MatrixVar m1 = new MatrixVar(mat1);
        MatrixVar m2 = new MatrixVar(mat2);

        System.out.println(fl1.addFloat(fl2));
        System.out.println(v1.multiMatrix(m1));
        System.out.println(m1.multiMatrix(m2));
    }
}
