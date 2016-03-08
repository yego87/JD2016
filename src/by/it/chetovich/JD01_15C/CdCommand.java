package by.it.chetovich.JD01_15C;

import java.io.File;
import java.io.IOException;

/**
 * Command CD
 */
public class CdCommand {

    public static File runCD (String s) throws IOException {

        System.out.println("Enter the directory you wanna go: ");
        String line = Utils15C.enterLine();
        //для быстрой проверки путь указываем, считая папку проекта корневой
        //иначе можем создавать файл сразу от line
        String src = s+line;
        if ((new File(src)).exists()) return new File(src);
        else return null;
    }
}
