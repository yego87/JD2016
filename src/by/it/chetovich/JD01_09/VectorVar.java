package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * Created by user_2 on 19.02.2016.
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
        //Calculations calc = new Calculations();
        //System.out.println(Calculations.add(value.getVal(), value1.getVal()));
        if (value instanceof FloatVar) {
            System.out.println("Невозможно сложить число и вектор.");
            return null;
        }
        if (value instanceof VectorVar) return new VectorVar(Calculations.add(this.vector, ((VectorVar) value).getVector()));
        if (value instanceof MatrixVar) {
            System.out.println("Невозможно сложить вектор и матрицу.");
            return null;
        }
        return null;

    }

    @Override
    public void sub(Var value) {
        if (value instanceof FloatVar) System.out.println("Невозможно вычесть число из вектора.");
        if (value instanceof VectorVar) Calculations.sub(this.vector, ((VectorVar) value).getVector());
        if (value instanceof MatrixVar) System.out.println("Невозможно вычесть число из вектора.");
    }

    @Override
    public void multi(Var value) {
        if (value instanceof FloatVar) Calculations.multi(((FloatVar) value).getVal(), this.vector);
        if (value instanceof VectorVar) Calculations.multi(this.vector, ((VectorVar) value).getVector());
        if (value instanceof MatrixVar) {
            if (this.vector.length==((MatrixVar) value).array[0].length)
            Calculations.multi(this.vector, ((MatrixVar) value).getArray());
            else System.out.println("Умножение выполнить невозможно, т.к. длина вектора не совпадает с количеством столбцов матрицы.");
        }
    }

    @Override
    public void divide(Var value) {
        if (value instanceof FloatVar) {
            System.out.println("Деление на число мы заменяем умножением на величину, обратную числу.");
            Calculations.multi(1/((FloatVar) value).getVal(), this.vector);
        }
        if (value instanceof VectorVar) System.out.println("Деление на вектор невозможно.");
        if (value instanceof MatrixVar) System.out.println("Деление на матрицу невозможно.");;
    }
}
