package by.it.telushko.jd01_14;


import by.it.akhmelev.JD01_06.Level_A.Data;

import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        //Задание А-1
        String src = System.getProperty("user.dir")+"/src/by/it/telushko/";
        String filename = src+"jd01_14/integer.dat";
        File f = new File(filename);
        System.out.println(filename);

        // записываем челые числа в файл
        DataOutputStream outSream = null;
        try {
            outSream = new DataOutputStream(new FileOutputStream(filename));
            for (int i = 0; i <4 ; i++) {
                int q = (int)(Math.random() * 20) + 10;
                outSream.writeInt(q);
            }
        }
        catch (FileNotFoundException e){System.out.println("Файла не существует" + filename);}
        finally {if (outSream!=null){outSream.close();}}

        //Читаем данные из файла
        try (DataInputStream inStream = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream(filename)))){
            int b=0;
            int sum=0;
            while (inStream.available()>0){
                int element=inStream.readInt();
                System.out.println(element);
                sum+=element;
                b++;
            }
            System.out.println("среднее арифметическое" + sum/b);
        }
        catch (IOException e){System.err.println("Ошибка файла"+ e);}
    }
}
