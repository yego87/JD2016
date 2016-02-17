package by.it.solonovich.JD01_work;

import java.util.Arrays;

/**
 * Created by Кирилл on 09.02.2016.
 */
public class Zadanie9Var2 {
    public static void main(String[] args) {
        int [] random = {10, 20, 30, 40, 50};
        int max = random[0];
        for (int i = 0; i < random.length; i++ )
        {if (max<random[i]);
            max=random[i];}



        System.out.println(max);
    }}