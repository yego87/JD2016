package by.it.chetovich.JD01_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scanner
 */
public class CountingWithScanner {

    public static int count (File file, String regex) throws FileNotFoundException {

        int sum = 0;
        try {
            Scanner scan = new Scanner(file).useDelimiter(regex);
            while (scan.hasNext()){
                scan.next();
                sum++;
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file.");

        }
        return sum;
    }

}

