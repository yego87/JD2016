package by.it.Baranova.JD01_15.C;
import java.io.IOException;

/**
 * Created by Ekaterina on 3/6/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String src = System.getProperty("user.dir");
        System.out.println("Введите команду");
        String rLine = Utils.ReadLine();

        try {
            while (rLine.trim().length() != 0) {
                String key="";
                if (rLine.contains("cd")){key="cd";}
                if (rLine.contains("dir")){key="dir";System.out.println(key);}
                switch (key) {
                    case "cd": {

                        break;
                    }

                    case "dir": {
                        DirClass.Dir(rLine,src);
                        break;
                    }

                    default: {
                        //Преобразование переменных в переменные типа VarImpl
                        System.out.println("Введена некорректная команда");
                    }
                }
                System.out.println("Введите команду");
                rLine = Utils.ReadLine();
            }
        }
        catch (StringIndexOutOfBoundsException e){
            System.err.print("Введено некорректное выражение");
        }


    }
}