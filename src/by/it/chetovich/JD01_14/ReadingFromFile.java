package by.it.chetovich.JD01_14;

import java.io.*;

/**
 * Created by user_2 on 02.03.2016.
 */
public class ReadingFromFile {

    public static void readFile (File f) throws IOException {

        try (DataInputStream inp = new DataInputStream(new BufferedInputStream(new FileInputStream(f)))) {
            double sum = 0;
            double count = 0;
            int i = 0;
            while (inp.available()>0){
                i=inp.readInt();
                sum+=i;
                count++;
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Average: "+sum/count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
