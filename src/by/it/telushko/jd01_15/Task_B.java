package by.it.telushko.jd01_15;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_B {
    public static void taskB1() throws IOException {
        String src = System.getProperty("user.dir")+"/src/by/it/telushko/";
        String inputFilename = src+"jd01_15/Main.java";
        String outputFilename = src+"jd01_15/Main.txt";

        // cчитываем текст программы в SttingBuilder

        StringBuilder javatext = new StringBuilder();

        try (BufferedReader reader=new BufferedReader(new FileReader(inputFilename))){
            String line;
            while ((line=reader.readLine())!=null){
                javatext.append(line);
                javatext.append("\n");
            }
            reader.close();

        //  паттерны для коментариев и построчного вывода.

            Pattern comment = Pattern.compile("(/\\*\\n(.*\\n)*\\*/)|(//.*)|(/\\*.*\\n(.*\\n)*.*\\*/)");
            Pattern codeLine = Pattern.compile("(.*\\n)");


              //ищем вхождения и пишем их в линкед
            LinkedList<Integer[]> comments=new LinkedList<Integer[]>();
            Matcher okComment = comment.matcher(javatext);

            Integer[] find = new Integer[2]; //временный массивсчик для переборов

            while (okComment.find()){

                find[0]=okComment.start();
                find[1]=okComment.end()-1;
                comments.add(find);
                System.out.println(javatext.substring(okComment.start(),okComment.end()));

            }

            //посчитали
            //удаляем

            while(!(comments.isEmpty())){

                find=comments.pollLast();
                System.out.println(find [0]);
                System.out.println(find [1]);
            }

System.out.println(javatext);

            // пишем в файл
            PrintWriter writer = new PrintWriter(new FileWriter(outputFilename));
            Matcher okCodeLine = codeLine.matcher(javatext);
            while (okCodeLine.find()){
                writer.println(javatext.substring(okCodeLine.start(),okCodeLine.end()));
            }
            writer.close();
        }
        catch (IOException e){
            throw new IOException("Ошибка  чтения"+inputFilename,e);
        }

    }
}