package by.it.Baranova.JD01_14.C;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ekaterina on 3/6/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String src = System.getProperty("user.dir");
        File f = new File(src);
        String [] paths;
        try {
            paths = f.list();
            System.out.println("Каталоги");
            for (String path : paths) {
                String filename = src + "/" + path;
                File fn = new File(filename);

                if (fn.isDirectory()) {
                    System.out.println(path);
                }
            }

            System.out.println("Файлы");
            for (String path : paths) {
                String filename = src + "/" + path;
                File fn = new File(filename);

                if (!fn.isDirectory()) {
                    System.out.println(path);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}