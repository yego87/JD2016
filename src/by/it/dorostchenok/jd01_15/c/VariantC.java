package by.it.dorostchenok.jd01_15.c;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VariantC {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy  HH:mm");

    public void run(){


        String line;
        try {
            do {
                line = bufferedReader.readLine();
                if ("dir".equals(line.toLowerCase())){
                    File file = new File(".");
                    System.out.println(" Содержимое папки " + file.getCanonicalPath() + "\n");
                    File[] files = file.listFiles();

                    int fileCount = 0;
                    int totalFileSize = 0;
                    int directoryCount = 0;

                    for (File currentFile : files){
                        if (currentFile.isDirectory()){
                            directoryCount++;
                        } else {
                            totalFileSize += currentFile.length();
                            fileCount++;
                        }
                    }

                    for (File f1 : files){
                        String name = f1.getName();
                        String date = sdf.format(new Date(f1.lastModified()));
                        String dirString = "\t";
                        long size = 0;
                        if (f1.isDirectory()){
                            dirString = "<DIR>";
                        } else {
                            size = f1.length();
                        }
                        System.out.printf("%s\t%s\t%8s  %s\n", date, dirString, sizeToString(size), name);


                    }
                    System.out.printf("\t\t\t%d файлов %16d байт\n", fileCount, totalFileSize);
                    System.out.printf("\t\t\t%d папок  %16d байт свободно\n", directoryCount, file.getFreeSpace());
                }

            } while (!"q".equals(line.toLowerCase()));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private String sizeToString(long size){
        if (size == 0){
            return "";
        } else {
            StringBuilder builder = new StringBuilder(String.valueOf(size));
            int cycleCount = 0;
            for (int j = builder.length(); j > 0; j--){
                cycleCount++;
                if (cycleCount % 3 == 0){
                    builder.insert(j - 1, " ");
                    cycleCount = 0;
                }
            }

            return builder.toString().trim();
        }
    }
}
