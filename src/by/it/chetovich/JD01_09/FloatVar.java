package by.it.chetovich.JD01_09;


/**
 * Created by user_2 on 19.02.2016.
 */
public class FloatVar extends Var {

    private float val;

    public FloatVar(float value){
        this.val = value;
    }

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }

    @Override
    public String toString (){
        return Float.toString(val);
    }

    @Override
    public Var add(Var value) {
        if (value instanceof FloatVar) return new FloatVar(Calculations.add(this.val, ((FloatVar) value).val));
        if (value instanceof VectorVar) {
            System.out.println("Невозможно сложить число и вектор.");
            return null;
        }
        if (value instanceof MatrixVar) {
            System.out.println("Невозможно сложить число и матрицу.");
            return null;
        }
        return null;
    }

    @Override
    public void sub(Var value) {
        if (value instanceof FloatVar) System.out.println(Calculations.sub(this.val, ((FloatVar) value).getVal()));
        if (value instanceof VectorVar) System.out.println("Невозможно вычесть из числа вектор.");
        if (value instanceof MatrixVar) System.out.println("Невозможно вычесть из числа матрицу.");
    }

    @Override
    public void multi(Var value) {
        if (value instanceof FloatVar) System.out.println(Calculations.multi(this.val, ((FloatVar) value).getVal()));
        if (value instanceof VectorVar) System.out.println(new VectorVar(Calculations.multi(this.val, ((VectorVar) value).getVector())));
        if (value instanceof MatrixVar) Calculations.multi(this.val, ((MatrixVar) value).getArray());
    }

    @Override
    public void divide(Var value) {
        if (value instanceof FloatVar) Calculations.divide(this.val, ((FloatVar) value).getVal());
        if (value instanceof VectorVar) System.out.println("Деление на вектор невозможно.");
        if (value instanceof MatrixVar) System.out.println("Деление на матрицу невозможно.");;
    }
}
