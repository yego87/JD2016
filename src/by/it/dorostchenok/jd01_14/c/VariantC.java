package by.it.dorostchenok.jd01_14.c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VariantC {

    private List<String> directoryList = new ArrayList<>();
    private List<String> fileList = new ArrayList<>();

    public void run(){
        File file = new File("./src/by/it");
        traverseFile(file);
        System.out.println("Directories:");
        for (String dirName : directoryList)
            System.out.println(dirName);
        System.out.println("Files:");
        for (String fileName : fileList)
            System.out.println(fileName);
    }

    private File traverseFile(File file){
        if (file.isDirectory()){
            for (File f : file.listFiles()){
                try {
                    if (f.isFile())
                        fileList.add(f.getCanonicalPath());
                    if (f.isDirectory())
                        directoryList.add(f.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                traverseFile(f);
            }
        }

        return file;
    }
}
