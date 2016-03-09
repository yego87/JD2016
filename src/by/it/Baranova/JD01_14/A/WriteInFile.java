package by.it.Baranova.JD01_14.A;

import java.io.*;

/**
 * Created by Ekaterina on 3/5/16.
 */
public class WriteInFile {

    public static void writeInFile() throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_14/A/numbers.dat";
        File f = new File(filename);

        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream(f));
            for (int i = 0; i < 20; i++) {
                int n = (int) (Math.random()* 21+1);
                System.out.print(n+" ");
                dos.writeInt(n);

            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.print("Файла нет:" + filename);
        } finally {
            if (dos != null) {
                dos.close();
            }
        }
    }
}
