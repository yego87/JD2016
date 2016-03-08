package by.it.chetovich.Matlab;


import java.util.Arrays;

/**
 * class for MatrixVar instance with float[][] array field
 */
public class MatrixVar extends Var {

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
    public String getType() {
        return " (array) ";
    }


    @Override
    public Var add(Var value) throws ErrorException {

        if (value instanceof FloatVar) return new MatrixVar(Calculations.add(this.array, ((FloatVar) value).getVal()));
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
    public Var sub(Var value) throws ErrorException {
        if (value instanceof FloatVar) return new MatrixVar(Calculations.sub(this.array, ((FloatVar) value).getVal()));
        if (value instanceof VectorVar) super.sub(value);
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array.length&&this.array[0].length==((MatrixVar) value).array[0].length)
                return new MatrixVar(Calculations.sub(this.array, ((MatrixVar) value).getArray()));
            else super.sub(value);
        }
        return super.sub(value);
    }

    @Override
    public Var multi(Var value) throws ErrorException {
        if (value instanceof FloatVar) return new MatrixVar(Calculations.multi(((FloatVar) value).getVal(), this.array));
        if (value instanceof VectorVar) {
            try {
                return new VectorVar(Calculations.multi(((VectorVar) value).getVector(), this.array));
            } catch (DifferentSizesException e) {
                System.out.println(e.getMessage());
            }
        }
        if (value instanceof MatrixVar) {
            try {
                return new MatrixVar(Calculations.multi(this.array, ((MatrixVar) value).getArray()));
            } catch (DifferentSizesException e) {
                System.out.println(e.getMessage());
            }
        }
        return super.multi(value);
    }

    @Override
    public Var divide(Var value) throws ErrorException {
        if (value instanceof FloatVar) {

            float divider;
            try {
                divider = Calculations.divide(1, ((FloatVar) value).getVal());
                return new MatrixVar(Calculations.multi(divider, this.array));

            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        }
        if (value instanceof VectorVar) return super.divide(value);
        if (value instanceof MatrixVar) return super.divide(value);
        return super.divide(value);
    }
}
