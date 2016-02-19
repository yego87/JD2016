package by.it.veselov.JD01_02;

import java.io.IOException;

/**
 * Created by yegorveselov on 18.02.16.
 */
public class Task_B_2 {
    public static void main(String[] args) throws IOException {
        int k = 9;
        int [] array = new int [k];
        int n = 3;
        int l=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++,l++) {
                System.out.print(l);
                if( l==k) break;
            }
            if (l==k) break;
            System.out.println();
        }
        }}

