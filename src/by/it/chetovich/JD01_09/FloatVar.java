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
        return "Result: "+val;
    }

    @Override
    public Var addFloat(FloatVar value) {
        return new FloatVar(Calculations.addFloats(this.val, value.val));
    }

    @Override
    public Var addVector(VectorVar value) {
        System.out.println("Невозможно сложить число и вектор.");
        return null;
    }

    @Override
    public Var addMatrix(MatrixVar value) {
        System.out.println("Невозможно сложить число и матрицу.");
        return null;
    }

    @Override
    public Var subFloat(FloatVar value) {
        return new FloatVar(Calculations.subFloats(this.val, value.val));
        //this.val = this.val - value.val;
        //return this;
    }

    @Override
    public Var subVector(VectorVar value) {
        System.out.println("Невозможно вычесть из числа вектор.");
        return null;
    }

    @Override
    public Var subMatrix(MatrixVar value) {
        System.out.println("Невозможно вычесть из числа матрицу.");
        return null;
    }

    @Override
    public Var multiFloat(FloatVar value) {
        return new FloatVar(Calculations.multiFloats(this.val, value.val));
    }

    @Override
    public Var multiVector(VectorVar value) {
        return new VectorVar(Calculations.multiFloatAndVector(this.val, value.getVector()));
    }

    @Override
    public Var multiMatrix(MatrixVar value) {
        return new MatrixVar(Calculations.multiFloatAndMatrix(this.val, value.getArray()));
    }
}
