package by.it.predkel.JD14Flows;

import java.io.*;

/**
 * Created by user_2 on 04.03.2016.
 */
public class Level1 {
    public static void lev1() throws IOException {
        String src = System.getProperty("user.dir") + "/src/by/it/predkel/";
        String fin = src + "JD14Flows/text.txt";
        File fl=new File(fin);

        try(DataOutputStream data=new DataOutputStream(new FileOutputStream(fl))){
            for (int i = 0; i < 20; i++) {
                data.writeInt((int)(Math.random()*20+10));
            }
        } catch (FileNotFoundException e) {
                System.out.println("Файла нет: " + fin);
        }

        try (DataInputStream data= new DataInputStream(new FileInputStream(fl))){
            double sum=0;
            double count=0;
            while (data.available()>0) {
                int i=data.readInt();
                sum=sum+i;
                count++;
            }
            System.out.println(sum / count);
            }
    }
}
