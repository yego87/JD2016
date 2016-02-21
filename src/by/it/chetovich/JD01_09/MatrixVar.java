package by.it.chetovich.JD01_09;


import java.util.Arrays;

/**
 * Created by user_2 on 19.02.2016.
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
        //Calculations calc = new Calculations();
        //System.out.println(Calculations.add(value.getVal(), value1.getVal()));
        if (value instanceof FloatVar) {
            System.out.println("Невозможно сложить число и матрицу.");
            return null;
        }
        if (value instanceof VectorVar) {
            System.out.println("Невозможно сложить вектор и матрицу.");
            return null;
        }
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array.length&&this.array[0].length==((MatrixVar) value).array[0].length) {
                new MatrixVar(Calculations.add(this.array, ((MatrixVar) value).getArray()));
            }
            else {
                System.out.println("Матрицы разных размеров, их нельзя сложить.");
                return null;
            }
        }
        return null;

    }
    @Override
    public void sub(Var value) {
        if (value instanceof FloatVar) System.out.println("Невозможно вычесть число из матрицы.");
        if (value instanceof VectorVar) System.out.println("Невозможно вычесть вектор из матрицы.");
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array.length&&this.array[0].length==((MatrixVar) value).array[0].length)
                Calculations.sub(this.array, ((MatrixVar) value).getArray());
            else System.out.println("Матрицы разных размеров, их нельзя вычитать.");
        }
    }

    @Override
    public void multi(Var value) {
        if (value instanceof FloatVar) Calculations.multi(((FloatVar) value).getVal(), this.array);
        if (value instanceof MatrixVar) {
            if (this.array[0].length==((MatrixVar) value).array.length)
                Calculations.multi(((VectorVar) value).getVector(), this.array);
            else System.out.println("Умножение выполнить невозможно, т.к. длина вектора не совпадает с количеством столбцов матрицы.");
        }
        if (value instanceof MatrixVar) {
            if (this.array.length==((MatrixVar) value).array[0].length)
            Calculations.multi(this.array, ((MatrixVar) value).getArray());
            else System.out.println("Размеры матриц не соответствуют условию для их перемножения " +
                    "(количество строк одной матрицы должно совпадать с количеством столбцов другой матрицы).");
        }
    }

    @Override
    public void divide(Var value) {
        if (value instanceof FloatVar) {
            System.out.println("Деление матрицы на число заменяем умножением матрицы на величину, обратную числу.");
            Calculations.multi(1/((FloatVar) value).getVal(), this.array);
        }
        if (value instanceof VectorVar) System.out.println("Деление на вектор невозможно.");
        if (value instanceof MatrixVar) System.out.println("Деление на матрицу невозможно.");;
    }
}
