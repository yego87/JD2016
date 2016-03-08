package by.it.chetovich.JD01_15_C;

import java.io.File;
import java.io.IOException;

/**
 * JD01_15_C
 */
public class Main {

    public static void main(String[] args) throws IOException {

        String src = System.getProperty("user.dir");
        File file = new File(src);
        System.out.println("Enter a command: dir - file info, cd - change directory.");
        System.out.println("If you want to end the session, press enter.");
        Utils15C.chooseCommand(src, file);

    }
}
