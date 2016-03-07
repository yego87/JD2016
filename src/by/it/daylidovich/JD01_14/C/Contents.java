package by.it.daylidovich.JD01_14.C;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contents {
    public static void contentFolder(String path){
        File folder = new File(path);
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd.MM.yyyy HH:mm");
        if (folder.isDirectory()){
            File[] files = folder.listFiles();
            System.out.println("Содержимое папки " + path);
            int countFiles = 0;
            int countFolder = 0;
            for (File file: files){
                if (file.isFile()){
                    System.out.printf("%-25s         %-16s  %6d байт\n", file.getName(), dateFormat.format(new Date(file.lastModified())),file.length());
                    countFiles++;
                }
                else{
                    System.out.printf("%-25s  <DIR>  %-16s  %6d байт\n", file.getName(), dateFormat.format(new Date(file.lastModified())), file.length());
                    countFolder++;
                }
            }
            System.out.println("Катологов " + countFolder + ". Файлов " + countFiles + ".");
        }
        else
            System.out.printf("%-25s  <DIR> %-16s  %6d байт\n", folder.getName(), dateFormat.format(new Date(folder.lastModified())), folder.length());

    }
}
