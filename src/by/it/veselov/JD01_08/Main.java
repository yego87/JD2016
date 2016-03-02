package by.it.veselov.JD01_08;

/**
 * Created by yegorveselov on 26.02.16.
 */
public class Main {
    public static void main(String[] args)
    {
        NoteBookForPainting book = new NoteBookForPainting();
        book.sgech();
        book.tip("папирус");
        System.out.println(book.getMaterial());
    }
}
