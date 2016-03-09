package by.it.predkel.JD14Flows;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by user_2 on 04.03.2016.
 */
public class Level3 {
    public static void level3() {
        String fin = System.getProperty("user.dir") + "/src/by/it/predkel";
        File fl = new File(fin);
        ArrayList<String> files=new ArrayList<>();//для отдельного вывода списка файлов
        if (fl.isDirectory()) {
            System.out.println("Список каталогов:");
                try {
                    for (File item : fl.listFiles()) {
                        if (item.isDirectory()) {
                            System.out.println(item.getName());
                        } else {
                            files.add(item.getName());
                        }
                    }
                    System.out.println("Список файлов:");
                    System.out.println(files);
                }catch (NullPointerException e){
                    System.out.print("Каталог пустой!");
                }
        }
    }
}
