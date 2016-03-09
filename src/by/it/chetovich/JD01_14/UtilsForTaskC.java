package by.it.chetovich.JD01_14;

import java.io.File;
import java.util.List;

/**
 * creates lists of files and directories
 */
public class UtilsForTaskC {

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
     * @param f File object
     * @param listFiles empty list, where we add a file if it's a file
     * @param listDirectories empty list, where we add a file if it's a directory
     */
    public static void whenDirectory (File f, List<File> listFiles, List<File> listDirectories) {

        listDirectories.add(f);
        File[] arrFiles = f.listFiles();

        if (arrFiles!=null)
            for (File file : arrFiles) {
                if (isFile(file)) listFiles.add(file);
                else whenDirectory(file,listFiles,listDirectories);
            }

    }

    public static void printFileList (List<File>list){
        for (File listFile : list) {
            System.out.println(listFile);
        }
    }
}

