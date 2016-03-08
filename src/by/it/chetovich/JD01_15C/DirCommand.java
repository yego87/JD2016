package by.it.chetovich.JD01_15C;

import by.it.chetovich.JD01_14.UtilsForTaskC;

import java.io.File;

/**
 * Dir Command
 */
public class DirCommand {

    public static void runDIR (File file){

        System.out.println("You are at directory: "+file.getPath());
        if (UtilsForTaskC.isFile(file)){
            Utils15C.whenFile(file);
        }
        else Utils15C.whenDirectory(file);
    }

}
