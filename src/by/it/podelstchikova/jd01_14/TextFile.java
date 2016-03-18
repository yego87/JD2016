package by.it.podelstchikova.jd01_14;

import java.io.*;
import java.util.Scanner;

public class TextFile {
    public static void TextIntTheFile() throws FileNotFoundException
    { String fName = "textFile.txt";
        File file = new File(fName);
        int sumch = 0;
        int sumw = 0;

       int b=0;
        try
        {
            Scanner scan = new Scanner(file).useDelimiter("[!\"#$%&'()*+,\\-.\\/:;<=>?@\\[\\\\\\]^_`{|}~]");

            while (scan.hasNext())
            {
                sumw++;
            }
            Scanner scan1 = new Scanner(file).useDelimiter("^[!\"#$%&'()*+,\\-.\\/:;<=>?@\\[\\\\\\]^_`{|}~]");
            while (scan1.hasNext())
            {
                sumch++;
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("количество слов: "+sumw+"количество знаков"+sumch);



    }
}
