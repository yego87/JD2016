package by.it.predkel.MatLab;

/**
 * Created by Admin on 19.02.2016.
 */
public interface IOperation {
/*
    Var addFloat (FloatVar value);
    Var addMatrix (MatrixVar value);
    Var mulFloat (FloatVar value);
    Var mulMatrix (MatrixVar value);
    Var robFloat (FloatVar value);
    Var robMatrix (MatrixVar value);
    Var divFloat (FloatVar value);
    Var divMatrix (MatrixVar value);
*/
    Var add (Var value);
    Var mul (Var value);
    Var sub (Var value);
    Var div (Var value);
    boolean checkMatrixToSum(MatrixVar mat1,MatrixVar mat2);
    boolean checkMatrixToMul(MatrixVar mat1,MatrixVar mat2);
}
