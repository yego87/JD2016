package by.it.chetovich.JD01_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * JD01_14
 */
public class Main {

    public static void main(String[] args) throws IOException {

        //Задание А
        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_14/integer.dat";
        File f = WritingNumbersIntoFile.writesFile(src);

        ReadingFromFile.readFile(f);

        //Задание В
        String line = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_14/1.txt";
        File file = new File(line);
        String text = "Pasta (Italian pronunciation: [ˈpasta]) is a staple food of traditional Italian cuisine,"+
        "with the first reference dating to 1154 in Sicily.";
        try(PrintWriter print = new PrintWriter(new FileWriter(file))){
            print.println(text);
        }
        catch (IOException e){
            System.out.println("Writing to file "+file+" failed.");
        }

        String regexWords = "[^\\w]+";
        System.out.println("There are "+CountingWithScanner.count(file, regexWords)+" words.");
        String regexPunctuation = "[.,:;!?]+";
        System.out.println("There are "+(CountingWithScanner.count(file, regexPunctuation)-1)+" punctuation marks.");

        //Задание С

        File projectFile = new File(System.getProperty("user.dir")+ "/src/by/it/chetovich");
        List<File> listFiles = new ArrayList<>();
        List<File> listDirectories = new ArrayList<>();
        UtilsForTaskC.whenDirectory(projectFile, listFiles, listDirectories);
        System.out.println("File list: ");
        UtilsForTaskC.printFileList(listFiles);
        System.out.println("Directories list: ");
        UtilsForTaskC.printFileList(listDirectories);

    }
}
