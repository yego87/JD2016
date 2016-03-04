package by.it.knyazev.MathLab;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Mac on 03.03.16.
 */
public class TaskManager {

    public String line;

    public double answer;

    public int brR = 0, minSign, maxSign;

    public List<String> list = new ArrayList<String>();

    public List<String> tempList = new ArrayList<String>();

    public TaskManager(String line) {
        this.line = line;
    }

    public LineToArray lta = new LineToArray();

    public BracketsID bracketsID = new BracketsID();

    public TaskManager(){}

    public Brackets brackets = new Brackets();

    public Count count = new Count();

    public void requiredOperations(){ // менеджер операций
        list = lta.toArray(line); // String в List<String>
        checkBrackets(); // Проверка на скобки



        printAnswer(); // Выводим ответ
    }

    public void checkBrackets(){ // Проверка на скобки и выполнение операций взависимости от их наличия
        if (brackets.bracketsRound(line) && !brackets.bracketsSquare(line)){ // если { } - вектор
            System.out.println("Type of Brackets: RoundBrackets");

            //Получить id вектора
            brRemoveByID();

            // Проверить знаки до скобок, если умножить или делить (учесть возможность повторения) вырезать все (Вырезать вместе с знаком впереди стоящим)
            // В противном случае вырезать скобки "Найти способ хранить более 1 вектора ** Разделять опозновательным знаками в массиве???

            signCheck();
            cutOut();
            double tmp = count.count(list); // Результат вычисления первой части
            tempList.add(0,String.valueOf(tmp));
            System.out.println(tempList);

                // Прогнать часть со скобками в обе стороны на совпадения
                // если > 1 знака * | / то выполнить действия над ними и выполнить действия над вектором
                // Записать в TempList (В конец - был вырезаны знаки + - ...)

                // TempList отправить на вычисления векторов
                // Вернуть ответ


            // Закончить вычисления вернуть окончательный ответ
        }
        if (!brackets.bracketsRound(line) && brackets.bracketsSquare(line)){ // если [ ] - матрица
            System.out.println("Type of Brackets: SquareBrackets");
        }
        if (brackets.bracketsRound(line) && brackets.bracketsSquare(line)) // если {} и []
        {
            System.out.println("Type of Brackets: BothBrackets");
        }
        if (!brackets.bracketsRound(line) && !brackets.bracketsSquare(line)){ // если отсутствуют
           answer = count.count(list); // отправляем считать
        }
    }

    public void printAnswer(){
        System.out.println("Answer: " + answer);
    }

    public void brRemoveByID(){
        brR = bracketsID.bracketsRoundID(list);
    }

    public void signCheck(){ //Проверка на * / и их повторение подрят
        System.out.println("List contains: " + list);
        for (int i = brR; i >= 1; i--) {
            while (list.get(i).contains("*") | list.get(i).contains("/") ){
                if (!list.get(i-1).contains("*") | !list.get(i-1).contains("/")){
                    minSign = i;
                    break;
                }
            }
        }
        for (int i = brR; i < list.size() - 1; i++) {
            while (list.get(i).contains("*") | list.get(i).contains("/") ){
                if (!list.get(i+1).contains("*") | !list.get(i+1).contains("/")){
                    maxSign = i;
                    break;
                }
            }
        }
    }

    public void cutOut(){
        if (minSign!=brR | maxSign!=brR) {
            if (minSign-2>0){ // вырезаем зо знаком до первого вхождения подрят
                for (int i = minSign-2; i <= maxSign+1; i++) {
                    tempList.add(list.get(i));
                }
                remove(minSign-2,maxSign+1);
            }
            if (minSign-2<=0){ // не трогаем знак
                for (int i = minSign-1; i <= maxSign+1; i++) {
                    tempList.add(list.get(i));
                }
            }
        }
    }
    public void remove(int min, int max){
        for (int i = max; i >= min ; i--) {
            list.remove(i);
        }
    }
}
