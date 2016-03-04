package by.it.novik.JD01_14;


import java.io.File;


public class C1 {
    public static void main(String[] args) {
        File f = new File(System.getProperty("user.dir"));
            File[] arr = f.listFiles();
        System.out.println("Директории: ");
            for (File fl : arr) {

                if (fl.isDirectory()) {
                    System.out.println(fl);
                }
            }
        System.out.println("Файлы: ");
        for (File fl : arr) {

            if (! fl.isDirectory()) {
                System.out.println(fl);
            }
        }
    }
}
