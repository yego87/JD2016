package by.it.predkel.MatLab;

import java.io.IOException;

/**
 * Created by Admin on 19.02.2016.
 */
public interface IOperation {

    Var add (Var value);
    Var mul (Var value);
    Var sub (Var value);
    Var div (Var value);
    boolean checkMatrixToSum(MatrixVar mat1,MatrixVar mat2);
    boolean checkMatrixToMul(MatrixVar mat1,MatrixVar mat2);
    void setForm(String str) throws IOException;
    void outPut();
}
