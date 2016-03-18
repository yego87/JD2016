package by.it.dorostchenok.jd01_15.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class VariantA {

    private Random rand = new Random(System.currentTimeMillis());
    private File file = new File(System.getProperty("user.dir") + "/src/by/it/dorostchenok/jd01_15/a/output.txt");

    public void run(){
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int j = 0; j < 4; j++){
                writer.printf("% 3d % 3d % 3d % 3d\n",
                        getRandomInRange(),
                        getRandomInRange(),
                        getRandomInRange(),
                        getRandomInRange());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private int getRandomInRange(){
        int tmp = rand.nextInt();
        int i = rand.nextInt(16);
        if (tmp < 0)
            i *= -1;

        return i;
    }
}
