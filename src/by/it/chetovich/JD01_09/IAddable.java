package by.it.chetovich.JD01_09;

import by.it.akhmelev.JD01_07.matrixOk.Matrix;

/**
 * Created by user_2 on 19.02.2016.
 */
public interface IAddable {

    Var addFloat (FloatVar value);
    Var addVector (VectorVar value);
    Var addMatrix (MatrixVar value);

}
