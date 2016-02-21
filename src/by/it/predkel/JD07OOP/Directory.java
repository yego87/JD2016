package by.it.predkel.JD07OOP;

/**
 * Created by Admin on 18.02.2016.
 */
public class Directory extends Book {

    public Directory(String name, String text) {
        super(name, text);
    }

    public void setBookFullName() {
        this.name="Cправочник по:"+super.name;
    }
}
