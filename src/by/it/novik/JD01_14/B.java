package by.it.novik.JD01_14;



import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
    public static void main(String[] args) {
        String way = System.getProperty("user.dir") + "/src/by/it/novik/";
        String filename = way + "/JD01_14/text.txt/";

        File f = new File(filename);
        String line;
        int count = 0;
        int wCount = 0;
        FileReader fr = null;
        BufferedReader bfr = null;
        try {
            fr = new FileReader(f);
            bfr = new BufferedReader(fr);
            while( (line = bfr.readLine()) != null ) {
                Pattern p = Pattern.compile(",");
                Matcher m = p.matcher(line);
                while (m.find()) {
                    count++;
                }
                Pattern p1 = Pattern.compile("[a-zA-Z0-9'-;:./ ]+");
                Matcher m1 = p1.matcher(line);
                while (m1.find()) {
                    wCount++;

                }
            }
            System.out.println("Commas in text: " + count);
            System.out.println("Word in text: " + wCount);

        } catch (IOException e) {
            System.out.println("Not found " + filename.toString());
        }
    }


}
