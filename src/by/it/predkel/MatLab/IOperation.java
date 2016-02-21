package by.it.predkel.MatLab;

import by.it.akhmelev.JD01_07.matrixOk.Matrix;

/**
 * Created by Admin on 19.02.2016.
 */
public interface IOperation {

    Var addFloat (FloatVar value);
    Var addMatrix (MatrixVar value);
    Var mulFloat (FloatVar value);
    Var mulMatrix (MatrixVar value);
    Var robFloat (FloatVar value);
    Var robMatrix (MatrixVar value);
    Var divFloat (FloatVar value);
    Var divMatrix (MatrixVar value);
}
