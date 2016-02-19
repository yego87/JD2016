package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public abstract class Var implements IAddable {

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
}
