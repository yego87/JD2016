package by.it.daylidovich.FreeMathLab.variables.Matrix;

import by.it.daylidovich.FreeMathLab.interfaces.IVarable;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableMatrix extends OperationMatrix implements IVarable {
    private double[][] matrix;

    public double[][] getMatrix() {
        return matrix;
    }

    public VariableMatrix(double[][] matrix){
        this.matrix = new double[matrix.length][matrix[0].length];
        System.arraycopy(matrix, 0, this.matrix, 0, matrix.length);
    }

    public VariableMatrix(String string) throws ArrayIndexOutOfBoundsException{
        Matcher matcher = Pattern.compile("[\\[\\{][0-9.,]+[\\}\\]]").matcher(string);
        ArrayList<String> arrayList = new ArrayList<>();
        while (matcher.find())
           arrayList.add(matcher.group());

        if (!isMatrixSquare(arrayList))
            throw new ArrayIndexOutOfBoundsException("Матрица не прямоугольная.");

        this.matrix = new double[arrayList.size()][arrayList.get(0).split(",").length];
        for (int i = 0; i < arrayList.size(); i++) {
            matcher = Pattern.compile("[0-9]+[.]?[0-9]*").matcher(arrayList.get(i));
            int j = 0;
            while (matcher.find()){
                this.matrix[i][j] = Double.parseDouble(matcher.group());
                j++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < matrix.length; i++) {
            stringBuilder.append("{");
            for (int j = 0; j < matrix[i].length; j++){
                stringBuilder.append(matrix[i][j]).append(",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.append("}");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    //Метод проверяет одинаковой ли длинны строки в матрице.
    private boolean isMatrixSquare(ArrayList<String> arrayList){
        boolean out = true;
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i-1).split(",").length != arrayList.get(i).split(",").length)
                out = false;
        }
        return out;
    }
}
