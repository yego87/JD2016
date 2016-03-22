package by.it.predkel.MatLab.Utils;

import by.it.predkel.MatLab.Var;

import java.io.IOException;
import java.util.GregorianCalendar;

/**
 * Created by Admin on 23.03.2016.
 */
public abstract class Builder {
    StringBuilder text = new StringBuilder();
    public abstract void createHeader();
    public abstract void createTime();
    public abstract void createOperation(String operation);
    public abstract void createResult(String operation);
    public abstract void getText() throws IOException;
}
