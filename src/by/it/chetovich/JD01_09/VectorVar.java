package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * class for VectorVar instance with float[] vector field
 */
public class VectorVar extends Var {

    private float[] vector;

    public VectorVar(float[] vector){
        this.vector = vector;
    }

    public float[] getVector() {
        return vector;
    }

    public void setVector(float[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString (){
        return Arrays.toString(vector);
    }

    @Override
    public Var add(Var value) {

        if (value instanceof FloatVar) return super.add(value); //переделать, можно сложить
        if (value instanceof VectorVar) return new VectorVar(Calculations.add(this.vector, ((VectorVar) value).getVector()));
        if (value instanceof MatrixVar) return super.add(value); // переделать, можно сложить
        return super.add(value);

    }

    @Override
    public Var sub(Var value) {
        if (value instanceof FloatVar) return super.add(value); //переделать, можно вычесть
        if (value instanceof VectorVar) return new VectorVar(Calculations.sub(this.vector, ((VectorVar) value).getVector()));
        if (value instanceof MatrixVar) return super.add(value); //переделать, можно вычесть
        return super.add(value);
    }

    @Override
    public Var multi(Var value) {
        if (value instanceof FloatVar) return new VectorVar(Calculations.multi(((FloatVar) value).getVal(), this.vector));
        if (value instanceof VectorVar) return new FloatVar(Calculations.multi(this.vector, ((VectorVar) value).getVector()));
        if (value instanceof MatrixVar) {
            if (this.vector.length==((MatrixVar) value).array[0].length)
            return new VectorVar(Calculations.multi(this.vector, ((MatrixVar) value).getArray()));
            else return super.add(value);
        }
        return super.add(value);
    }

    @Override
    public Var divide(Var value) {
        if (value instanceof FloatVar) {
            System.out.println("Деление на число мы заменяем умножением на величину, обратную числу.");
            return new VectorVar(Calculations.multi(1/((FloatVar) value).getVal(), this.vector));
        }
        if (value instanceof VectorVar) return super.divide(value);
        if (value instanceof MatrixVar) return super.divide(value);
        return super.divide(value);
    }
}
