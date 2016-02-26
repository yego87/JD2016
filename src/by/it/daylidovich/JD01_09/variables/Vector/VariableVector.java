package by.it.daylidovich.JD01_09.variables.Vector;

import by.it.daylidovich.JD01_09.interfaces.IVarable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableVector extends OperationVector implements IVarable {
    private double[] vector;

    public double[] getVector() {
        return vector;
    }

    public VariableVector(double[] vector){
        this.vector = new double[vector.length];
        System.arraycopy(vector, 0, this.vector, 0, vector.length);
    }

    /*
    public VarableVector(VarableVector varableVector){
        this.vector = new double[varableVector.getVector().length];
        System.arraycopy(this.vector, 0, varableVector.getVector(), 0, varableVector.getVector().length);
    }
    */

    public VariableVector(String string){
        Matcher matcher = Pattern.compile("[0-9]+[.]?[0-9]*").matcher(string);
        vector = new double[string.split(",").length];
        int i = 0;
        while (matcher.find()){
            vector[i] = Double.parseDouble(matcher.group());
            i++;
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
