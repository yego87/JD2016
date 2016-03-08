package by.it.Baranova.JD01_15.B;

import by.it.Baranova.JD01_15.C.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ekaterina on 3/7/16.
 */
public class Enumerate {
    public static void enumerate (String newstr) throws IOException {
        String[] codeLines;
        codeLines = newstr.split("\\n");
        for (int i = 0; i < codeLines.length; i++) {
            System.out.println(codeLines[i]);
        }
        Map<String, String> code = new HashMap<>();
        Integer key = 1;
        for (String lines : codeLines) {
            if (key < 10) {
                String lineNumber = "0" + key.toString();
                code.put(lineNumber, lines);
            } else {
                code.put(key.toString(), lines);
            }
            key++;
        }
        Map<String, String> codeTree = new TreeMap<String, String>(code);
        Utils.printHashmap(codeTree);

        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_15/B/Utils.txt";
        File f = new File(filename);
        PrintWriter wr = null;
        try {
            wr = new PrintWriter(new FileWriter(f));
            for (Map.Entry<String, String> pair : codeTree.entrySet()) {
                wr.println(pair.getKey() + "  " + pair.getValue());

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файла нет:" + filename);
        } finally {
            if (wr != null) {
                wr.close();
            }

        }
    }
}
