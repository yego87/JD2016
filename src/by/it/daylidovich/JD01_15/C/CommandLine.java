package by.it.daylidovich.JD01_15.C;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLine {

    private static String address = System.getProperty("user.dir");

    public static String getAddress() {
        return address;
    }

    public static void contentFolder(){
        File folder = new File(address);
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd.MM.yyyy HH:mm");
        if (folder.isDirectory()){
            File[] files = folder.listFiles();
            System.out.println("Содержимое папки " + address);
            int countFiles = 0;
            int countFolder = 0;
            if (files != null) {
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
            }
            System.out.println("Катологов " + countFolder + ". Файлов " + countFiles + ".");
        }
        else
            System.out.printf("%-25s  <DIR> %-16s  %6d байт\n", folder.getName(), dateFormat.format(new Date(folder.lastModified())), folder.length());

    }

    public static void changeDirectory(String command){
        String newAddress =Reader.readNewAddress(command);
        if (new File(newAddress).isDirectory()){
            address = newAddress;
        }
        else
        if (new File(address + "\\" + newAddress).isDirectory())
            address = address + "\\" + newAddress;
        else
            System.out.println("Каталога не существует.");
    }
}
