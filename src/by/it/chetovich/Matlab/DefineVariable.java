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
        }

        mat.reset();

        Creator c;

        if(lineQuantity==0) { //если в строке нет круглых или квадратных скобок, значит это просто число
            c = new FloatCreator();
        }
        else{
            if (lineQuantity==1){ //если есть одна строка чисел в скобках, значит это одномерный массив вектор
                c = new VectorCreator();
            }
            else { //если вхождений цифр, заключёных в скобки, больше 1, значит это матрица
                c = new MatrixCreator();
            }
        }
        return c.create(s, lineQuantity);

    }
}
