package by.it.predkel.JD15Flows;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 07.03.2016.
 */
public class WindowConsole {
    public static void window() throws IOException {
        String fin = System.getProperty("user.dir") + "/src/by/it/";
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String rLine = "";
        Pattern pat=Pattern.compile("cd\\\\([\\w]+(\\\\)?)?");
         do{
            rLine = bufferedReader.readLine();
            Matcher mat=pat.matcher(rLine);
            if (mat.matches()){
                /*char[] chars=mat.group().toCharArray();
                chars[1]=':';
                //rLine="";*/
                StringBuffer nwRln=new StringBuffer(rLine);
                    //nwRln.append(chars);
                //nwRln.insert(1,':');
                nwRln.setCharAt(1,':');
               // rLine=chars.toString();
                fin=nwRln.toString();
                System.out.print(nwRln);
            }
            File fl= new File(fin);
            if (fl.isFile()){
                //throw new IllegalArgumentException();
                System.out.println("Вы ввели путь к файлу, а не папке");
                continue;
            }
            if (!fl.exists()){
               // throw new IllegalArgumentException();
                System.out.println("Данного пути не существует");
                continue;
            }
            if (rLine.equals("dir")){
                if (fl.isDirectory()){
                    sopDir(fl);
                }
                   /* String[] s=fl.list();
                        for (String sq:s){
                        System.out.println(sq);
                    }
                }
            */}
        }while (!rLine.equals("end"));
    }
    public static void sopDir(File fn){
        if (fn.listFiles().length!=0) {
            System.out.printf("%-20s%-10s%-20s%n%n","Name","DIR?","Size");
            for (File it : fn.listFiles()) {
                String dir = "<DIR>";
                String size="";
                if (it.isFile()) {
                    dir = "";
                    size=(new Long(it.length())).toString();
                }
                System.out.printf("%-30s%-10s%-20s%n", it.getName(), dir, size);
            }
        }else System.out.print("В папке ничего нет");
    }
}
