package by.it.predkel.JD15Flows;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 06.03.2016.
 */
public class ReadThisProgram {
    public static void readProg() throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD15Flows/ReadThisProgram.java";
        File fl=new File(fin);
        StringBuilder str=new StringBuilder();
        try(BufferedReader data=new BufferedReader(new FileReader(fl))){
            String line;
            while ((line = data.readLine()) != null) {
                str.append(line+"\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет: " + fin);
        }

        Pattern pat=Pattern.compile("//.*");
        Matcher mat=pat.matcher(str);
        Pattern pat1=Pattern.compile("(/\\*([^(/\\*)]|\\n)+\\*/)");//проблема с многострочным паттерном
        Matcher mat1=pat1.matcher(str);
       // str.toString().replaceAll("\\/\\*([^(\\/\\*)]|\\n)+\\*\\/"," ");
        while (mat.find()){
            System.out.println(mat.group());
        }
        while (mat1.find()){
            System.out.println(mat1.group());
        }

/*
        String src1 = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin1 = src + "JD15Flows/ReadThisProgram.txt";
        File flname=new File(fin1);
        try(BufferedWriter data=new BufferedWriter(new FileWriter(fl))){
            String line;
            while ((line = data.readLine()) != null) {
                str.append(line+"\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет: " + fin);
        }
*/
    }
}
