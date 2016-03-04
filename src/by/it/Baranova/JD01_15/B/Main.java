package by.it.Baranova.JD01_15.B;

import java.io.*;

/**
 * Created by Ekaterina on 3/4/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_15/Program.txt";
        File f = new File(filename);
        StringBuilder stringBuilder=new StringBuilder();

        BufferedReader reader=null;
        try
        {
            reader=new BufferedReader(new FileReader(f));
            String line;
            while ((line=reader.readLine())!=null){
                stringBuilder.append(reader.readLine());
            }
        } catch (IOException e){
            System.err.println("Ошибка файла:"+e);
        }
        finally {

        }

    }
}