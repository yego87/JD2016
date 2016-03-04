package by.it.novik.JD01_14;


import java.io.File;

public class C1 {
    public static void main(String[] args) {
        File f = new File(System.getProperty("user.dir"));
        File [] arr = f.listFiles();
        //System.out.println(arr);
        for (File fl: arr) {

        }
    }
}
