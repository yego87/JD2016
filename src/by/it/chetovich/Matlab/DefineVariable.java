package by.it.chetovich.Matlab;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class for definition of variable type
 */
public class DefineVariable {
    /**
     *
     * @param s variable in String, which type should be defined
     * @return FloatVar, VectorVar or MatrixVar instance
     */
    public static Var defineVar (String s) throws NumberFormatException{


        //проверяем, является ли полученная строка является именем переменной, которая уже содержится в карте переменных
        Map<String, Var> map = MapVariables.getMap();
        for (Map.Entry<String, Var> entry : map.entrySet()) {
            //если да, возвращаем из карты её значение
            if (s.equalsIgnoreCase(entry.getKey())) return entry.getValue();
        }



        Pattern pat = Pattern.compile(Patterns.vector); //ищем числа, заключённые в круглые или квадратные скобки
        Matcher mat = pat.matcher(s);
        int lineQuantity = 0;
        while (mat.find()) {
            lineQuantity++; //считаем количество вхождений в строке
            //System.out.println(mat.group());
        }
        //System.out.println(lineQuantity);

        Pattern pat1 = Pattern.compile(Patterns.number); //ищем цифры в строке
        Matcher mat1 = pat1.matcher(s);
        int numQuantity = 0;
        while (mat1.find()){
            numQuantity++;
            //System.out.println(mat1.group());
        }
        //System.out.println(numQuantity);

        mat1.reset();
        mat.reset();

        Creator c = null;

        if(lineQuantity==0) { //если в строке нет круглых или квадратных скобок, значит это просто число
            //return new FloatVar(Float.parseFloat(s));
            c = new FloatCreator();
        }
        else{
            if (lineQuantity==1){ //если есть одна строка чисел в скобках, значит это одномерный массив вектор
                float [] array = new float[numQuantity];
                int i = 0;
                while (mat1.find()){
                    array[i] = Float.parseFloat(mat1.group()); //заполняем его цифрами
                    i++;
                }
                return new VectorVar(array);
            }
            else { //если вхождений цифр, заключёных в скобки, больше 1, значит это матрица
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
        return null;


    }


}
