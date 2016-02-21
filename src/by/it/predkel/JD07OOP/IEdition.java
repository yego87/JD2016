package by.it.predkel.JD07OOP;

/**
 * Created by Admin on 18.02.2016.
 */
public interface IEdition {
    String getBookName();
    void setBookName(String newName);
    void issueABook();
    void findText(String neededText);
    void burnIt();
    void openBook();
    void closeBook();
    void buy();

}
