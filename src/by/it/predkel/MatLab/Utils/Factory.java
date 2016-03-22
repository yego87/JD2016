package by.it.predkel.MatLab.Utils;

import by.it.predkel.MatLab.FloatVar;
import by.it.predkel.MatLab.MatrixVar;
import by.it.predkel.MatLab.Var;

import java.io.IOException;

/**
 * Created by Admin on 23.03.2016.
 */
public class Factory {
    public static Var createVariable(String str, String param) throws IOException {
        if (str.equals("mat"))
            return new MatrixVar(param);
        else if (str.equals("flo"))
            return new FloatVar(param);
        else return null;
    }
}
