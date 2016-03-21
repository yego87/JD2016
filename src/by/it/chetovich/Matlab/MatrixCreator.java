package by.it.chetovich.Matlab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * MatrixVar Creator
 */
public class MatrixCreator extends Creator {

    @Override
    public Var create(String s, int lineQuantity) {

        //ищем цифры в строке
        Pattern pat1 = Pattern.compile(Patterns.number);
        Matcher mat1 = pat1.matcher(s);
        int numQuantity = 0;
        while (mat1.find()){
            numQuantity++;
        }

        mat1.reset();

        //создаём массив и заполняем его цифрами, найденными в предыдущем паттерне
        float [][] array = new float[lineQuantity][numQuantity/lineQuantity];
        for (int i = 0; i < lineQuantity; i++) {
            for (int j = 0; j < numQuantity/lineQuantity; j++) {
                if (mat1.find()) {
                    array[i][j] = Float.parseFloat(mat1.group());
                }
            }
        }
        return new MatrixVar(array);
    }
}
