package by.it.novik.JD01_14;


import java.io.*;

public class A {

    public static void main(String[] args) throws IOException {
        String way = System.getProperty("user.dir") + "/src/by/it/novik/";
        String filename = way + "/JD01_14/randomNumbers.dat/";

        File f = new File(filename);


        try (DataOutputStream ds = new DataOutputStream
                        (new FileOutputStream(f)))
        {
            for(int i = 0; i < 20; i++ ) {
                int r = 1 +(int)(Math.random()*10);
                ds.writeInt(r);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Not found " + filename.toString());
        }

    }

}
