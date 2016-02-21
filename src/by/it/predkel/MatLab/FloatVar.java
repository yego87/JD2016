package by.it.predkel.MatLab;

/**
 * Created by Admin on 19.02.2016.
 */
public class FloatVar extends Var {

    float val;

    public FloatVar(float value){
        this.val = value;
    }

    @Override
    public FloatVar addFloat(FloatVar value) {//число+матрица
        this.val += value.val;
        return this;
    }
    @Override
    public MatrixVar addMatrix(MatrixVar value) {//число+матрица
        return new MatrixVar(value.matrix).addFloat(this);
    }
    @Override
    public FloatVar mulFloat(FloatVar value) {//число*число
        this.val *= value.val;
        return this;
    }
    @Override
    public MatrixVar mulMatrix(MatrixVar value){//число*матрицу
        return new MatrixVar(value.matrix).mulFloat(this);
    }
    @Override
    public FloatVar robFloat(FloatVar value){//число-число
        this.val-=value.val;
        return this;
    }
    @Override
    public MatrixVar robMatrix(MatrixVar value){//число-матрица
        System.out.println("Нельзя отнять от числа матрицу!");
        return null;
    }
    @Override
    public FloatVar divFloat(FloatVar value) {//число/число
        this.val /= value.val;
        return this;
    }
    @Override
    public MatrixVar divMatrix(MatrixVar value){//число/матрица
        System.out.println("Нельзя делить число на матрицу!");
        return null;
    }

    @Override
    public int intValue() {
        return (int)this.val;
    }

    @Override
    public long longValue() {
        return (long)this.val;
    }

    @Override
    public float floatValue() {
        return this.val;
    }

    @Override
    public double doubleValue() {
        return (double)this.val;
    }
}