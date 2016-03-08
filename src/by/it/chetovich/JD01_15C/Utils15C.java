package by.it.chetovich.JD01_15C;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Utils for 15_C
 */
public class Utils15C {

    /**
     *
     * @return line that has been entered by user
     * @throws IOException
     */
    public static String enterLine () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                return reader.readLine();

    }

    /**
     *
     * @param f File object
     * @return true if it's a file, false if it's a directory
     */
    public static boolean isFile (File f){

        return f.isFile();

    }

    /**
     *
     * @param file a file
     */
    public static void whenFile (File file){
        System.out.printf("       %6d  %s", file.length(),file.getName());
        System.out.println();
    }


    /**
     *
     * @param file File object that is a directory
     */
    public static void whenDirectory (File file) {

        File[] arrFiles = file.listFiles();
        System.out.printf(" <DIR>         %s", file.getName());
        System.out.println();

        if (arrFiles!=null)
            for (File f : arrFiles) {
                if (isFile(f)) whenFile(f);
                else whenDirectory(f);
            }

    }


    /**
     *
     * @param src String path to the file
     * @param file File object
     * @throws IOException
     */
    public static void chooseCommand(String src, File file) throws IOException {

        String line;
        while (!(line=enterLine()).isEmpty()) {
            if ("dir".equals(line)) DirCommand.runDIR(file);
            else {
                if ("cd".equals(line)){
                    if((file = CdCommand.runCD(src))!=null) System.out.println("You are at directory: "+file.getPath());
                    else System.out.println("The path you've entered doesn't exist, try again.");

                }
                else System.out.println("You've entered something wrong, try again.");
            }
            System.out.println("Enter a command: dir - file info, cd - change directory.");
        }
    }
}
