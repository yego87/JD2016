package by.it.predkel.JD07OOP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 18.02.2016.
 */
public abstract class Book implements IEdition {
    String name;
    String text;
    @Override
    public String getBookName() {
        System.out.println(this.name);
        return this.name;
    }

    public Book(String name,String text){
        this.name=name;
        this.text=text;
    }
    @Override
    public void setBookName(String newName) {
        this.name=newName;
    }

    @Override
    public void issueABook() {
        System.out.print("The book is issured");
    }

    @Override
    public void findText(String neededText) {
        Pattern pat = Pattern.compile(neededText);
        Matcher mat = pat.matcher(text);
        while (mat.find()) {
            System.out.println("The text is found");
        }
    }

    @Override
    public void burnIt(){
        System.out.print("The book is opened");
    }

    @Override
    public void openBook() {
        System.out.print("The book is opened");
    }

    @Override
    public void closeBook() {
        System.out.print("The book is closed");
    }

    @Override
    public void buy() {
        System.out.print("The book is bought");
    }
}
