package by.it.predkel.JD07OOP;

/**
 * Created by Admin on 18.02.2016.
 */
public class Main {
    public static void main(String[] args){
        Directory Novels=new Directory("Novels",null);
        try {
            Novels.buy();
            Novels.openBook();
            Novels.closeBook();
            Novels.burnIt();
            Novels.closeBook();
        }catch (MyException e){
            System.out.print(e.getMessage());
        }


    }
}
