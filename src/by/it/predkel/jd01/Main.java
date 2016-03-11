package by.it.predkel.jd01;


import by.it.predkel.jd01.GaussJordan.*;
import by.it.predkel.jd01.LevelA.*;
import by.it.predkel.jd01.LevelB.*;
import by.it.predkel.jd01.LevelC.*;
import by.it.predkel.SimplyUsefulClasses.*;


import java.io.IOException;

public class Main {//не хватает последних трёх пунктов из С и последнего из Гаусса-Жордана

    public static void main(String[] args) throws IOException {
        //levelA
        String[] str= InputString.inputString();
        ShortLong.shortLong(str);
        AverageLenght.averageLenght(str);
        DifferentSymbols.differentSymbols(str);
        Palindrom.palindrom(str);
        //levelB
        ChooseMonth.chooseMonth();
        CreateMatrix.createMatrix();
        Interval.interval();
        QuadraticEquation.quadraticEquation();
        //levelC
        int[][] mass=RandomMatrix.randomMatrix();
        NegativeSum.negativeSum(mass);
        AverageOfLine.averageOfLine(mass);
        Transposition.transposition(mass);
        TurnMatrix90.turnMatrix90(mass);
        MaxElem.maxElem(mass);
        //GaussJordan
        double[][] m0 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        double[][] mA = {
                {2, 5, 4, 1},
                {1, 3, 2, 1},
                {2, 10, 9, 7},
                {3, 8, 9, 2}
        };
        double[] mY = {20, 11, 40, 37};
        double[] massX= FindRoot.findRoot(mA,mY);
        PrintArray1D.arrayPrint1D(massX);
        PrintArray1D.arrayPrint1D(ArrayMul.arrayMulVector(mA,massX));
        System.out.print(FindDeterminant.findDeterminant(mA));

    }
}
