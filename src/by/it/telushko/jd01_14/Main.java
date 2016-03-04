package by.it.telushko.jd01_14;

import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        //Задание А-1
        System.out.println("Задание А-1");
        String src = System.getProperty("user.dir")+"/src/by/it/telushko/";
        String filename = src+"jd01_14/integer.dat";

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
            System.out.println("среднее арифметическое: " + sum/b);
        }
        catch (IOException e){System.err.println("Ошибка файла"+ e);}
        //Задание В-1;
        System.out.println("\nЗадание В-1");

        String textfilename = src+"jd01_14/text.txt";

        FileReader fileReader = new FileReader(textfilename);
        int res;
        int marksCount=0;
        String marks=",.!?:;";
        while ((res=fileReader.read())!=-1){
            for (int i = 0; i <marks.length() ; i++) {
                if(marks.charAt(i)==(char)res) marksCount++;
            }
        }
        fileReader.close();                            //вопрос про повторное создание потока

        fileReader= new FileReader(textfilename);
        int currentFlag=0;                             //слово считается найденным, если текущий символ
        int pastFlag=0;                                 //знак препинания или пробел, а предыдуший символ- НЕТ.
        int wordCount=0;
        String wordMark=",.!?:; ";
        while ((res=fileReader.read())!=-1){
            for (int i = 0; i <wordMark.length() ; i++) if ((wordMark.charAt(i)==(char)res) ) currentFlag=1;
            if ((currentFlag==1)&&(pastFlag==0)) wordCount++;
           pastFlag=currentFlag;
            currentFlag=0;
            System.out.print((char)res);
        }
        System.out.println("\n\nВ тексте обнаружено:\n" +
                "знаков препинания: "+marksCount+"\n" +
                "слов: "+wordCount);

        //Задание C-1;
        System.out.println("\nЗадание C-1\n+");

        File file = new File(System.getProperty("user.dir"));
        File[] list = file.listFiles();

        System.out.println("Каталоги:");
        for (int i = 0; i <list.length ; i++) {
            if (list[i].isDirectory()) System.out.println(list[i]);
        }
        System.out.println("Файлы:");
        for (int i = 0; i <list.length ; i++) {
            if (list[i].isFile()) System.out.println(list[i]);
        }

    }
}
