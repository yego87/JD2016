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
        File [] paths;
        try {
            paths = f.listFiles();
            System.out.println("Каталоги");
            for (File path : paths) {
                if (path.isDirectory()) {
                    System.out.println(path);
                }
            }

            System.out.println("Файлы");
            for (File path : paths) {
                if (path.isFile()) {
                    System.out.println(path);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}