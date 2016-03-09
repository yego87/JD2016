package by.it.daylidovich.JD01_15.B;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaderWriter {
    //Медот для чтения файла и сохранения его текста в переменную типа StringBuilder
    public static StringBuilder readFile(String nameFile){
        StringBuilder text = new StringBuilder();
        try{
            BufferedReader reader =new BufferedReader(new FileReader(nameFile));
            String line;
            int n = 1;
            while (null != (line = reader.readLine())){
                text.append(n).append(" ").append(line).append("\n");
                n++;
            }
        }
        catch (IOException e){
            System.out.println("Ошибка чтения файла.");
        }
        return text;
    }

    //Метод удаляет коментарии из текста
    public static StringBuilder deleteComment(StringBuilder text){
        Matcher matcher = Pattern.compile("[0-9]{1,2}[ ]*[/]{2}.*[\\n]").matcher(text);
        ArrayList<int[]> listStartEnd = new ArrayList<>();

        //нахождение индексов начала и конца строки с однострочным коментарием
        while (matcher.find()){
            int[] array = new int[2];
            array[0] = matcher.start();
            array[1] = matcher.end();
            listStartEnd.add(array);
        }

        //удаление из текста коментариев
        for (int i = listStartEnd.size()-1; i >= 0; i--) {
            int start = listStartEnd.get(i)[0];
            int end = listStartEnd.get(i)[1];
            text.delete(start, end);
        }

        //нахождение идексов начала и конца многострочного коментария
        matcher = Pattern.compile("[/][*].*[*][/]").matcher(text);
        listStartEnd = new ArrayList<>();
        while (matcher.find()){
            int[] array = new int[2];
            array[0] = matcher.start();
            array[1] = matcher.end();
            System.out.println(matcher.group());
            listStartEnd.add(array);
        }

        //удаление из текста коментариев
        for (int i = listStartEnd.size()-1; i >= 0; i--) {
            int start = listStartEnd.get(i)[0];
            int end = listStartEnd.get(i)[1];
            text.delete(start, end);
        }
        return text;
    }

    public static void printText(StringBuilder text){
        try{
            PrintWriter printer = new PrintWriter(new FileWriter("src\\by\\it\\daylidovich\\JD01_15\\B\\ReaderWriter.txt"));
            printer.print(text);
            System.out.println(text);
        }
        catch (IOException e){
            System.out.println("Ошибка записи.");
        }
    }
}