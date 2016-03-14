package by.it.dorostchenok.jd01_15.b;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by misha on 3/14/16.
 */
public class VariantB {

    /*
    test
    comment
     */
    public static final String COMMENT_REGEX = "(\\/\\*([^*]|[\\r\\n]|(\\*+([^*/]|[\\r\\n])))*\\*+\\/)|(\\/\\/.*)";
    private StringBuilder sb = new StringBuilder();
    private String filePath = System.getProperty("user.dir") + "/src/by/it/dorostchenok/jd01_15/b/VariantB.";
    private File file = new File(filePath + "java");

    public void run(){
        readFile();
        String str = Pattern.compile(COMMENT_REGEX).matcher(sb).replaceAll("");
        writeFile(str);

    }
    // new line comment
    private void readFile(){

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                sb.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) { // end of line comment
            e.printStackTrace();
        }

    }

    private void writeFile(String s){
        try (PrintWriter writer = new PrintWriter(new File(filePath + "txt"))) {
            int lineNumber = 1;
            for (String line : s.split("\n")){
                System.out.printf("%02d %s\n", lineNumber, line);
                writer.printf("%02d %s\n", lineNumber, line);
                lineNumber++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
