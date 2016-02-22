package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * class for MatrixVar instance with float[][] array field
 */
public class MatrixVar extends Var{

    float [][] array;

    public MatrixVar (float[][]array){
        this.array = array;
    }

    public float[][] getArray() {
        return array;
    }

    public void setArray(float[][] array) {
        this.array = array;
    }

    @Override
    public String toString (){
        return Arrays.deepToString(array);
    }

    @Override
    public Var add(Var value) {

        if (value instanceof FloatVar) return super.add(value);
        if (value instanceof VectorVar) return super.add(value);
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array.length&&this.array[0].length==((MatrixVar) value).array[0].length) {
                return new MatrixVar(Calculations.add(this.array, ((MatrixVar) value).getArray()));
            }
            else return super.add(value);
        }
        return super.add(value);

    }
    @Override
    public Var sub(Var value) {
        if (value instanceof FloatVar) super.sub(value);
        if (value instanceof VectorVar) super.sub(value);
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array.length&&this.array[0].length==((MatrixVar) value).array[0].length)
                return new MatrixVar(Calculations.sub(this.array, ((MatrixVar) value).getArray()));
            else super.sub(value);
        }
        return super.sub(value);
    }

    @Override
    public Var multi(Var value) {
        if (value instanceof FloatVar) return new MatrixVar(Calculations.multi(((FloatVar) value).getVal(), this.array));
        if (value instanceof VectorVar) {
            if (this.array[0].length==((VectorVar) value).getVector().length)
                return new VectorVar(Calculations.multi(((VectorVar) value).getVector(), this.array));
            else super.sub(value);
        }
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array[0].length)
            return new MatrixVar(Calculations.multi(this.array, ((MatrixVar) value).getArray()));
            else super.multi(value);
        }
        return super.multi(value);
    }

    @Override
    public Var divide(Var value) {
        if (value instanceof FloatVar) {
            System.out.println("Деление матрицы на число заменяем умножением матрицы на величину, обратную числу.");
            return new MatrixVar(Calculations.multi(1/((FloatVar) value).getVal(), this.array));
        }
        if (value instanceof VectorVar) return super.divide(value);
        if (value instanceof MatrixVar) return super.divide(value);
        return super.divide(value);
    }
}
