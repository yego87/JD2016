package by.it.Baranova.JD01_15.B;

import java.io.*;

/**
 * Created by Ekaterina on 3/4/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_15/C/Utils.java";
        File f = new File(filename);
        StringBuilder stringBuilder=new StringBuilder();

        BufferedReader reader=null;
        try
        {
            reader=new BufferedReader(new FileReader(f));
            String line;
            while ((line=reader.readLine())!=null){
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e){
            System.err.println("Ошибка файла:"+e);
        }
        finally {
            if  (reader!=null){
                reader.close();
            }
        }
        System.out.println(stringBuilder);
        String newstr=DeleteComments.deleteComments(stringBuilder);
        Enumerate.enumerate(newstr);
    }
}