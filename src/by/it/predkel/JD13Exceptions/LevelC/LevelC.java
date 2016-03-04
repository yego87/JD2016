package by.it.predkel.JD13Exceptions.LevelC;

import by.it.predkel.JD07OOP.Directory;
import by.it.predkel.JD07OOP.MyException;

/**
 * Created by Admin on 29.02.2016.
 */
public class LevelC {
    public static void runner(){//реализвация Exception-а находиться в пакете с первой работой с ООП (JD007OOP)
        Directory Novels=new Directory("Novels",null);
        try {
            Novels.buy();
            Novels.openBook();
            Novels.closeBook();
            Novels.burnIt();
            Novels.burnIt();
        }catch (MyException e){
            System.out.print(e.getMessage());
        }
    }
}
