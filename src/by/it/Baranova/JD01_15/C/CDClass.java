package by.it.Baranova.JD01_15.C;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Ekaterina on 3/7/16.
 */
public class CDClass {
    public static String cdCommand(String src, String rLine) {
        String filename="";
        try {
            if (rLine.contains("cd ")) {
                rLine = rLine.replaceAll("cd ", "");
                rLine.trim();
            }
            File f=new File(rLine);
            if (f.isDirectory()) { filename=rLine;}
            else {System.out.println("Каталог не найден");
                 filename=src;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(filename);
        return filename;
    }
}