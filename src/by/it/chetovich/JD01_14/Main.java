package by.it.chetovich.JD01_14;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Writes to the file, reads from it
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_14/integer.dat";
        File f = WritingNumbersIntoFile.writesFile(src);

        ReadingFromFile.readFile(f);


        String line = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_14/Pasta.docx";
        File file = new File(line);
        Scanner scan = new Scanner(file);
    }
}
