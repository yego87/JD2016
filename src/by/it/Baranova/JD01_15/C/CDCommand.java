package by.it.Baranova.JD01_15.C;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Ekaterina on 3/7/16.
 */
public class CDCommand {
    public static void cdCommand(String src, String rLine) {
        File f = new File(src);
        String[] paths;
        try {
            if (rLine.contains("cd ")) {
                rLine = rLine.replaceAll("cd ", "");
            }
            paths = f.list();
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
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}