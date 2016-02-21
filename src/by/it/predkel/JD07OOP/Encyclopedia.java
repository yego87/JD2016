package by.it.predkel.JD07OOP;

/**
 * Created by Admin on 18.02.2016.
 */
public class Encyclopedia extends Book {

    public Encyclopedia(String name, String text) {
        super(name, text);
    }

    public void setBookFullName() {
        this.name="Энциклопедия:"+super.name;
    }
}
