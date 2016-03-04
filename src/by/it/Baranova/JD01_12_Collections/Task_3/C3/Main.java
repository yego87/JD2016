package by.it.Baranova.JD01_12_Collections.Task_3.C3;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String sBraces="2+(2+{4-1+[4/2}])+1";
        String s="56*{4+5}+[3]+({6-7}+{35*15})";
        ArrayList<String> braces1= CheckBraces.BracesToArray(sBraces);
        CheckBraces.Braces(braces1);
        ArrayList<String>  braces2=CheckBraces.BracesToArray(s);
        CheckBraces.Braces(braces2);
    }
}
