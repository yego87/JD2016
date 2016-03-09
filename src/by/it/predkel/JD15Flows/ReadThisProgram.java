package by.it.predkel.JD15Flows;

import java.io.*;

/**
 * Created by Admin on 06.03.2016.
 */
public class ReadThisProgram {// proverka

    public static void readProg() throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD15Flows/ReadThisProgram.java";
        File fl = new File(fin);
        StringBuilder str = new StringBuilder();
        try (BufferedReader data = new BufferedReader(new FileReader(fl))) {
            String line;
            while ((line = data.readLine()) != null) {
                str.append(line + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет: " + fin);
        }

        String[] mass = str.toString().split("[/]{2}[^*].*");
        str.delete(0, str.length());
        for (String s : mass) {
            str.append(s);
        }
        String[] mass1 = str.toString().split("/[*]{1,2}.+?((\\n.+)+)?[*]/");
        str.delete(0, str.length());
        for (String s : mass1) {
            str.append(s);
        }
        System.out.print(str);
        // str.toString().replaceAll("

        fin = src + "JD15Flows/ReadThisProgram.txt";
        fl = new File(fin);
        try (PrintWriter data = new PrintWriter(new FileWriter(fl))) {
            data.print(str);
        }
    }
}
