package by.it.chetovich.JD01_15_B;

import java.io.*;

/**
 * JD01_15B
 * jgh
 */
public class Main {

    public static void main(String[] args) {

        /*hjgkh*/
        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_15_B/Main.java";
        File file = new File(src);
        StringBuilder s = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            //пока есть строки для считывания
            while ((line=reader.readLine())!=null) {
                //добавляем их в s
                s.append(line);
                s.append("\n");
            }
        }
        catch (IOException e){
            System.out.println("File not found.");
        }
        /*jh
        jhfkhj
        kl
         */
        System.out.println(s);
        StringBuilder noComment = Utils15B.deleteComments(s);
        String newFile = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_15_B/Main.txt";
        File mainTxt = new File(newFile);
        Utils15B.printToConsole(noComment, mainTxt);

    }
}
