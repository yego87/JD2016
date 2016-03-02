package by.it.chetovich.JD01_14;

import java.io.*;
import java.util.Random;

/**
 * Created by user_2 on 02.03.2016.
 */
public class WritingNumbersIntoFile {

    public static File writesFile(String src) throws IOException {

        Random rand = new Random();

        File f = new File(src);
        DataOutputStream data = null;

        try {
            data = new DataOutputStream(new FileOutputStream(f));
            for (int i = 0; i < 20; i++) {
                data.writeInt(rand.nextInt(100));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file: " + src);
        }
        return f;
    }
}
