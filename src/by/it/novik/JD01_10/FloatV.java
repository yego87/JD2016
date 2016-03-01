package by.it.novik.JD01_10;


public class FloatV extends AVar implements StrOperations {

    private double var;

    public FloatV(String str) {
        setFrom(str);
    }

    public double getVar() {
        return var;
    }

    public FloatV(double var) {
        this.var = var;
    }

    @Override
    public void setFrom(String str) {
        var = Double.valueOf(str);
    }

    @Override
    public String toString() {
        return ((Double)var).toString();
    }

    @Override
    public AVar add(AVar var) {
        return super.add(var);
    }

    @Override
    public AVar sub(AVar var) {
        return super.sub(var);
    }

    @Override
    public AVar div(AVar var) {
        return super.div(var);
    }

    @Override
    public AVar mul(AVar var) {
        return super.mul(var);
    }
}
