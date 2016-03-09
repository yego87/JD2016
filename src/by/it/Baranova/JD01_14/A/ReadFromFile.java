package by.it.Baranova.JD01_14.A;

import java.io.*;

/**
 * Created by Ekaterina on 3/5/16.
 */
public class ReadFromFile {

    public static void readFromFile()throws IOException{
        String src = System.getProperty("user.dir") + "/src/by/it/Baranova/";
        String filename = src + "JD01_14/A/numbers.dat";
        File f = new File(filename);

        //DataInputStream dos = null;
        try (DataInputStream inp=new DataInputStream
                (new BufferedInputStream
                        (new FileInputStream(filename))
                )
        )
        {   double sum=0;
            double count=0;
            int i=0;
            while (inp.available()>0){
                i=inp.readInt();
                sum=sum+i;
                count++;
            }
            System.out.println("Average "+sum+"/"+count+"="+sum/count);
        }
        catch (FileNotFoundException e){
            System.out.println();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
