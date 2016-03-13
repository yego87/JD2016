package by.it.dorostchenok.jd01_14.a;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VariantA {

    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;
    private File file = new File("file.dat");
    private Random rand = new Random();
    private List<Integer> list = new ArrayList<>();

    public void run(){
        writeBinaryData();
        readBinaryData();
        System.out.println(Arrays.toString(list.toArray()));
        int sum  = 0;
        for (int i : list){
            sum += i;
        }
        System.out.println("Среднее арифметическое: " + sum / list.size());
    }

    private void writeBinaryData(){
        try {
            dataOutputStream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            for (int j = 0; j < 20; j++){
                    dataOutputStream.writeInt(rand.nextInt());
                }
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readBinaryData(){

        try {
            dataInputStream = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while (true) {
                try{
                    int i = dataInputStream.readInt();
                    list.add(i);

                } catch (EOFException e){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null)
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
