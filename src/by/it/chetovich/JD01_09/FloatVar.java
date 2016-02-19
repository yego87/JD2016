package by.it.chetovich.JD01_09;

/**
 * Created by user_2 on 19.02.2016.
 */
public class FloatVar extends Var {

    private float val;

     public FloatVar(float value){
        this.val = value;
    }

    @Override
    public Var addFloat(FloatVar value) {
        this.val = this.val+value.val;
        return this;
    }

    @Override
    public Var addVector(VectorVar value) {
        System.out.println("Невозможно сложить число и вектор");
        return null;
    }
}
