package by.it.predkel.JD07OOP;

/**
 * Created by Admin on 18.02.2016.
 */
public interface IEdition {
    String getBookName();
    void setBookName(String newName);
    void issueABook() throws MyException;
    void findText(String neededText) throws MyException;
    void burnIt() throws MyException;
    void openBook() throws MyException;
    void closeBook() throws MyException;
    void buy() throws MyException;

}
