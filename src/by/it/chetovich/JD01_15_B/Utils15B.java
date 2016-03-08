package by.it.chetovich.JD01_15_B;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Methods for deleting comments and reading String to file and console
 */
public class Utils15B {

    public static StringBuilder deleteComments (StringBuilder s){

        String str = s.toString();
        //Pattern pat = Pattern.compile("[/]{2}.+");
        //Pattern pat = Pattern.compile("/[*]{1,2}.+?((\n.+)+)?[*]/|[/]{2}.+");
        String regex = "/[*]{1,2}.+?((\n.+)+)?[*]/|[/]{2}.+";
        //Pattern pat = Pattern.compile(regex);
        /*int count = 0;
        Matcher mat = pat.matcher(s);
        while (mat.find()) count++;*/
        //String [] array = new String[count];
        String [] array = str.split(regex);
        StringBuilder result = new StringBuilder();
        for (String s1 : array) {

            result.append(s1);
        }
        return result;

    }

    public static void printToConsole (StringBuilder s, File file){

        String str = s.toString();
        try (BufferedReader reader = new BufferedReader(new StringReader(str))){
            String line;
            int count=1;
            while ((line = reader.readLine())!=null){
                System.out.print(count+": ");
                System.out.println(line);
                printToFile(count,line,file);
                count++;
            }
        }
        catch (IOException e){
            System.out.println("Failed reading from String.");
        }
    }

    public static void printToFile (int count, String line, File file){

        try (PrintWriter print = new PrintWriter(new FileWriter(file, true))){
            print.print(count+": ");
            print.println(line);
        }
        catch (IOException e){
            System.out.println("File not found.");
        }
    }
}
