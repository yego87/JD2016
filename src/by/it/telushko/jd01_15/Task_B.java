package by.it.telushko.jd01_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_B {
    public static void taskB1() throws IOException {
        String src = System.getProperty("user.dir")+"/src/by/it/telushko/";
        String inputFilename = src+"jd01_15/Main.java";

        try (BufferedReader reader=new BufferedReader(new FileReader(inputFilename))){
            String line;
            while ((line=reader.readLine())!=null){

            }
        }
        catch (IOException e){
            throw new IOException("Ошибка  чтения"+inputFilename,e);
        }
    }
}