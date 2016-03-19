package by.it.chetovich.Matlab;

import java.io.IOException;

/**
 * Line entered by user
 */
public class InitialLine {

    private static String line;

    public static String getLine() {
        return line;
    }

    public static String enterLine () throws IOException {

        line = UtilsMatlab.enterLine();
        return line;
    }
}
