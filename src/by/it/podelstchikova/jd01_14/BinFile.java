package by.it.podelstchikova.jd01_14;

import java.io.*;


public class BinFile {
    public static void ReadWriteBinFile() throws IOException {
        String nFile="data.dat";
        File file = new File(nFile);
        DataOutputStream dataOutputStream =null;
        try{
            dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt((int) (Math.random()*100));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            dataOutputStream.close();
        }
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            int b=0;
            int k=0;
            int sum = 0;
            while ((dataInputStream.available()>0))
            {
                k=dataInputStream.readInt();
                System.out.printf("k[%d]= %d\n",b,k);
                sum+=k;
                b++;
            }
            System.out.printf("summ= %d\n",sum/20);
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
