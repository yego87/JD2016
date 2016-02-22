package by.it.daylidovich.JD01_09.varables.Vector;

import by.it.daylidovich.JD01_09.interfaces.IVarable;

public class VarableVector extends OperationVector implements IVarable {
    private double[] vector;

    public double[] getVector() {
        return vector;
    }

    public VarableVector(double[] vector){
        this.vector = new double[vector.length];
        System.arraycopy(vector, 0, this.vector, 0, vector.length);
    }

    /*
    public VarableVector(VarableVector varableVector){
        this.vector = new double[varableVector.vector.length];
        System.arraycopy(this.vector, 0, varableVector.vector, 0, varableVector.vector.length);
    }
    */

    public VarableVector(String string){
        String[] stringArray = string.split(",");
        vector = new double[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            vector[i] = Double.parseDouble(stringArray[i].trim());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (double elem: vector)
        stringBuilder.append(elem).append(",");
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
