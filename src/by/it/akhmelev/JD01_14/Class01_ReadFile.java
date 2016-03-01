package by.it.akhmelev.JD01_14;

import java.io.*;

public class Class01_ReadFile {
    public static void main(String[] args) {
        //путь к файлу от корня проекта, здесь корень System.getProperty("user.dir")
        String src=System.getProperty("user.dir")+"/src/by/it/akhmelev/";
        String filename = src+"JD01_14/text.txt";

        File f = new File(filename); // объект для связи с файлом на диске
        int b, count = 0;
        FileReader is = null;         //посимвольное чтение
        //FileInputStream is2 = null;   //а так было бы побайтовое чтение
        try {
            is = new FileReader(f);                 //так читаем СИМВОЛЫ
            //is2 = new FileInputStream(filename);  //а так читаем байты - числа от 0 до 255.
                                                    // Но может вернуть и -1 в конце, поэтому int b
            while ((b = is.read()) != -1) {         // чтение одного байта.
                System.out.print((char) b);
                count++;
            }
            System.out.println("\nчисло байт = " + count);
            System.out.println("Кодировка "+is.getEncoding());
        } catch (IOException e) {
            System.err.println("Ошибка файла: " + e );
        } finally {
            try {
                if (is != null) {
                    is.close(); // закрытие потока ввода. НУЖНО ДЕЛАТЬ ВСЕГДА И ОБЯЗАТЕЛЬНО!!!
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия: " + e);
            }
        }
    }

}
