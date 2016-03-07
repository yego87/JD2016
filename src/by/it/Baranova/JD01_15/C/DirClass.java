package by.it.Baranova.JD01_15.C;

import java.io.File;
import java.util.Date;

/**
 * Created by Ekaterina on 3/6/16.
 */
public class DirClass {
    public static void Dir(String rLine,String src){
        File f = new File(src);
        rLine = rLine.trim();
        try {
            String[] paths = new String[10];
            if (rLine.equals("dir")) {
                paths = f.list();
            }

            for (String path : paths) {
                String filename = src + "/" + path;
                File fn = new File(filename);
                Date d=new Date(fn.lastModified());
                long size=fn.length();
                if (fn.isDirectory()) {
                    System.out.printf("%25s   <DIR>   %4s   %30s",path,size, d);
                    System.out.println();
                }
                else {
                        System.out.printf("%25s   %12s   %30s",path,size,d);
                        System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
