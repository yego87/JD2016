package by.it.Baranova.JD02.JD02_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utils {

    public static String Readline()throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    public static void findNumbers(String rLine){
        Matcher m1= Pattern.compile("\\b0x[0-9A-Fa-f]+\\b").matcher(rLine);
        while (m1.find()){
            System.out.println(m1.group());
        }

    }

}
