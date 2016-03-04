package by.it.predkel.JD07OOP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Admin on 18.02.2016.
 */
public abstract class Book implements IEdition {
    String name;
    String text;
    boolean burned=false;

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
    public void issueABook() throws MyException {
        if (burned)
            throw new MyException("You have already burned it!");
        System.out.println("The book is issured");
    }

    @Override
    public void findText(String neededText) throws MyException {
        if (burned)
            throw new MyException("What text you what to find!? You have already burned this book!");
        Pattern pat = Pattern.compile(neededText);
        Matcher mat = pat.matcher(text);
        while (mat.find()) {
            System.out.println("The text is found");
        }
    }

    @Override
    public void burnIt() throws MyException {
        if (burned)
            throw new MyException("Are you joking??? You have already burned it!");
        System.out.println("Why you did it!?");
        this.burned=true;
    }

    @Override
    public void openBook() throws MyException {
        if (burned)
            throw new MyException("You have already burned it!");
        System.out.println("The book is opened");
    }

    @Override
    public void closeBook() throws MyException {
        if (burned)
            throw new MyException("You have already burned it!");
        System.out.println("The book is closed");
    }

    @Override
    public void buy() throws MyException {
        if (burned)
            throw new MyException("You have already burned it!");
        System.out.println("The book is bought");
    }
}
