package by.it.solonovich.JD01_work;

/**
 * Created by Кирилл on 11.02.2016.
 */
public class Zadanie12 {
    public static void main(String[] args) {
        int grupp[] = new int[5];

        grupp[0] = 3;
        grupp[1] = 9;
        grupp[2] = 5;
        grupp[3] = 7;
        grupp[4] = 6;
        int max = grupp[0];

        for (int i = 0; i < grupp.length; i++)
            if (max < grupp[i])
                max = grupp[i];

                System.out.println(max);
        for (int i = 0; i < grupp.length; i++)
        if (max==grupp[i]);

System.out.println();

    }}

