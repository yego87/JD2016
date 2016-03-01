package by.it.akhmelev.JD01_14;

import java.io.*;

public class Class01_Autoclose {
    public static void main(String[] args) {
        String src = System.getProperty("user.dir") + "/src/by/it/akhmelev/";
        String fin = src + "JD01_14/text.txt";

        //указание ресурса в try автоматически закроет его при выходе (Java 7)
        //возможный способ автоматического закрытия потоков  (Java 7 и выше)
        try (FileInputStream is = new FileInputStream(new File(fin))) {

            int b;
            while ((b = is.read()) != -1) { /* чтение */
                System.out.print((char) b);
            }
        } catch (IOException e) {
            System.err.println("ошибка файла: " + e);
        }
    } //main
}
