package by.it.chetovich.JD01_09;


/**
 * class for float variable
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
        if (value instanceof VectorVar) return super.add(value); //переделать, сложить можно
        if (value instanceof MatrixVar) return super.add(value);
        return null;
    }

    @Override
    public Var sub(Var value) {
        if (value instanceof FloatVar) return new FloatVar(Calculations.sub(this.val, ((FloatVar) value).val));
        if (value instanceof VectorVar) return super.sub(value);
        if (value instanceof MatrixVar) return super.sub(value);
        return super.sub(value);
    }

    @Override
    public Var multi(Var value) {
        if (value instanceof FloatVar) return new FloatVar(Calculations.multi(this.val, ((FloatVar) value).getVal()));
        if (value instanceof VectorVar) return new VectorVar(Calculations.multi(this.val, ((VectorVar) value).getVector()));
        if (value instanceof MatrixVar) return new MatrixVar(Calculations.multi(this.val, ((MatrixVar) value).getArray()));
        return super.multi(value);
    }

    @Override
    public Var divide(Var value) {
        if (value instanceof FloatVar) return new FloatVar(Calculations.divide(this.val, ((FloatVar) value).getVal()));
        if (value instanceof VectorVar) return super.divide(value);
        if (value instanceof MatrixVar) return super.divide(value);
        return super.divide(value);
    }
}
