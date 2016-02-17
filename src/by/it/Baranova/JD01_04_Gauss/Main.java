package by.it.Baranova.JD01_04_Gauss;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
	    double [] y={20,11,40,37};
        double [][]m={
                {2,5,4,1},
                {1,3,2,1},
                {2,10,9,7},
                {3,8,9,2}
        };
        double [] x=FindRoot.FindingRoot(m,y,false);
        InOut.arrayPrint(x,"X",1);
        InOut.arrayPrint(FindRoot.ArrayMulVector(m,x),"yy",4 );
        double det=FindRoot.FindDeterminant(m);
        System.out.println(" Определитель матрицы равен "+det);
        System.out.println(" Обратная матрица");
        double [][] inverseM=FindRoot.InverseMatrix(m);
        InOut.arrayPrint2D(inverseM);
        System.out.println("Проверка обратной матрицы");
        double [][] checkM=FindRoot.arrayMulVector(m,inverseM);
        InOut.arrayPrint2D(checkM);


    }
}
