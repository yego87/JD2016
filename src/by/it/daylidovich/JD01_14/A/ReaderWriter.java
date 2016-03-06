package by.it.daylidovich.JD01_14.A;

import java.io.*;

public class ReaderWriter {
    public static void createFile(int n){
        try{
            DataOutputStream stream = new DataOutputStream(new FileOutputStream(new File("src\\by\\it\\daylidovich\\JD01_14\\A\\FileA.txt")));
            for (int i = 0; i < n; i++) {
                stream.writeInt((int) (Math.random() * 100));
            }
            stream.close();
        } catch (IOException e){
            System.out.println("Ошибка записи файла.");
        }
    }

    public static void readNumbers(){
        try{
            File input = new File("src\\by\\it\\daylidovich\\JD01_14\\A\\FileA.txt");
            DataInputStream stream = new DataInputStream(new FileInputStream(input));
            int sum = 0;
            int count = 0;
            while (0 != stream.available()){
                int k = stream.readInt();
                sum += k;
                System.out.print(k + " ");
                count++;
            }
            System.out.printf("\n" + "Среднее арифмитическое %2.2f",(1.0 * sum / count));
            stream.close();
            input.delete();
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        }
        catch (IOException e){
            System.out.println("Ошибка чтения файла.");
        }
    }
}
