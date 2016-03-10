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
            LinkedList<Comment> comments=new LinkedList<Comment>();
            Matcher okComment = comment.matcher(javatext);

            while (okComment.find()){
               comments.add(new Comment(okComment.start(), okComment.end()));
            }

            //удаляем
            while(!(comments.isEmpty())){
                Comment c = comments.pollLast();
                javatext.delete(c.getStart(),c.getEnd()+1);
            }

            // пишем в файл
            PrintWriter writer = new PrintWriter(new FileWriter(outputFilename));
            PrintWriter consoleWriter = new PrintWriter(System.out);
            Matcher okCodeLine = codeLine.matcher(javatext);
            int count=0;
            while (okCodeLine.find()){
                count++;
                writer.printf("%2d ", count);
                writer.print(javatext.substring(okCodeLine.start(),okCodeLine.end()));
                System.out.printf("%2d ", count);
                System.out.print(javatext.substring(okCodeLine.start(),okCodeLine.end()));
            }
            writer.close();
        }
        catch (IOException e){
            throw new IOException("Ошибка  чтения"+inputFilename,e);
        }

    }
}