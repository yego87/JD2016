package by.it.predkel.MatLab;

/**
 * Created by Admin on 19.02.2016.
 */
public abstract class Var extends Number implements IOperation {

    @Override
    public Var add(Var value) {
        if (value instanceof FloatVar) this.add((FloatVar) value);
        if (value instanceof MatrixVar) this.add((MatrixVar) value);
        return null;
    }

    @Override
    public Var mul(Var value) {
        if (value instanceof FloatVar) this.mul((FloatVar) value);
        if (value instanceof MatrixVar) this.mul((MatrixVar) value);
        return null;
    }

    @Override
    public Var sub(Var value) {
        if (value instanceof FloatVar) this.sub((FloatVar) value);
        if (value instanceof MatrixVar) this.sub((MatrixVar) value);
        return null;
    }

    @Override
    public Var div(Var value) {
        if (value instanceof FloatVar) this.div((FloatVar) value);
        if (value instanceof MatrixVar) this.div((MatrixVar) value);
        return null;
    }

    @Override
    public boolean checkMatrixToSum(MatrixVar mat1, MatrixVar mat2) {//проверка матриц перед сложением
        return ((mat1.matrix.length == mat2.matrix.length)&&(mat1.matrix[0].length == mat2.matrix[0].length));
    }

    @Override
    public boolean checkMatrixToMul(MatrixVar mat1, MatrixVar mat2) {
        return (mat1.matrix[0].length == mat2.matrix.length);
    }
}
