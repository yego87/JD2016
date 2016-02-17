package by.it.predkel.jd01.LevelB;

import by.it.predkel.jd01.SimplyUsefulClasses.InputString;

import java.io.IOException;
import java.util.Scanner;

/**
 * Ввод строки и преобразование ее в матрицу
 */
public class CreateMatrix {
    public static void createMatrix() throws IOException {
        String[] str= InputString.inputString();
        int[] mass=new int[str.length];
        for (int i=0;i<str.length;i++){
            mass[i]=Integer.parseInt(str[i]);
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int col=0;
        for (int i=0; i<mass.length;i++){
            System.out.printf("5d",mass[i]);
            col++;
            if ((col%n==0)||(mass.length-1==i))
                System.out.println();
        }
    }
}
