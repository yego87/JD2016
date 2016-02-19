package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public abstract class Var implements IAddable, ISubtractable, IMultiplicable {

    @Override
    public Var addFloat(FloatVar value) {
        return null;
    }

    @Override
    public Var addVector(VectorVar value) {
        return null;
    }

    @Override
    public Var addMatrix(MatrixVar value) {
        return null;
    }

    @Override
    public Var subFloat(FloatVar value) {
        return null;
    }

    @Override
    public Var subVector(VectorVar value) {
        return null;
    }

    @Override
    public Var subMatrix(MatrixVar value) {
        return null;
    }

    @Override
    public Var multiFloat(FloatVar value) {
        return null;
    }

    @Override
    public Var multiVector(VectorVar value) {
        return null;
    }

    @Override
    public Var multiMatrix(MatrixVar value) {
        System.out.println("Деление на матрицу невозможно.");
        return null;
    }
}
