package by.it.predkel.JD14Flows;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user_2 on 04.03.2016.
 */
public class Level2 {
    public static void lev2() throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD14Flows/text1.txt";
        File fl = new File(fin);

     //   Scanner scan = new Scanner(fin);

        //ArrayList<String> txtLn= new ArrayList<>();
        try (BufferedReader data = new BufferedReader(new FileReader(fl))) {
            String line;Pattern pat1 = Pattern.compile("[a-zA-Z]+"); Pattern pat = Pattern.compile(",");
            int sum=0,count=0;
            while ((line = data.readLine()) != null) {
                Matcher mat = pat.matcher(line);
                while (mat.find()) {
                    sum++;
                }
                Matcher mat1 = pat1.matcher(line);
                while (mat1.find()) {
                    count++;
                }
            }
            System.out.println(sum + " / " + count);
        }
    }
}

