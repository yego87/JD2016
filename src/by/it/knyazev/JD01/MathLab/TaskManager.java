package by.it.knyazev.JD01.MathLab;

import by.it.knyazev.JD01.MathLab.Interfaces.ITaskManager;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class TaskManager implements ITaskManager{

    public String line;

    public String answer;

    public int brR = 0, minSign, maxSign;

    public List<String> list = new ArrayList<String>();

    public List<String> tempList = new ArrayList<String>();

    public TaskManager(String line) {
        this.line = line;
    }

    public LineToArray lta = new LineToArray();

    public BracketsType brackets = new BracketsType();

    public BracketsID bracketsID = new BracketsID();

    public TaskManager(){}

    public Count count = new Count();



    public void requiredOperations(){
        // менеджер операций
        list = lta.toArray(line); // String в List<String>
        checkBrackets(); // Проверка на скобки и выполняем действия в зависимости от их наличия
        printAnswer(); // Выводим ответ
    }

    public void checkBrackets(){
        // Проверка на скобки и выполнение операций взависимости от их наличия
        switch (brackets.bracketsType(line)){
            case 0: {
                // Brackets undetected
                answer = String.valueOf(count.count(list));
            }
            case 1:{
                //RoundBrackets
                brRemoveByID(); // Возвращает id вхождение скобок (Доработать для нескольких векторов)
                signCheck(); // Проверяем на повторение знаков
                cutOut(); // Вырезаем фрагмент уравнения со скобками (сверясь с информацией полученной выше)
                System.out.println("List: " + list + " TempList: " + tempList);

                double tmp = 0;
                tmp = Double.parseDouble(list.get(0));
                if (list.size() > 2) {
                    tmp = count.count(list);
                }// Результат вычисления первой части
                tempList.add(0,String.valueOf(tmp));
            }
            case 2:{
                //SquareBrackets

            }
            case 3:{
                //Both types
            }
        }
    }

    public void printAnswer(){
        System.out.println("Answer: " + answer);
    }
    public void brRemoveByID(){
        brR = bracketsID.bracketsRoundID(list);
    }


    @Deprecated
    public void signCheck(){
        //Проверка на * / и их повторение подрят
        for (int i = brR; i >= 1; i--) {
            while (list.get(i).contains("*") | list.get(i).contains("/") ){
                if (!list.get(i-1).contains("*") | !list.get(i-1).contains("/")){
                    minSign = i-1;
                    break;
                }
            }
        }
        for (int i = brR; i <= list.size() - 1; i++) {
            while (list.get(i).contains("*") | list.get(i).contains("/") ){
                if (!list.get(i+1).contains("*") | !list.get(i+1).contains("/")){
                    maxSign = i+1;
                }
                break;
            }
        }
        if (minSign > maxSign){
            maxSign = brR;
        }
        System.out.println("Min: " + minSign + " Max: " + maxSign);
    }

    @Deprecated
    public void cutOut(){
        if (minSign-1 > 0 && maxSign>brR){
            // вырезаем зо знаком до первого вхождения подрят
            for (int i = minSign-1; i <= maxSign; i++) {
                tempList.add(list.get(i));
            }
            remove(minSign-2,maxSign);
        }

        if (minSign == 0 && maxSign>brR){
            for (int i = minSign; i <= maxSign; i++) {
                tempList.add(list.get(i));
            }
            remove(minSign-1,maxSign);
            list.add("0");
        }

        if (minSign == 0 && maxSign == 0){
            maxSign = brR;
            for (int i = minSign; i <= maxSign; i++) {
                tempList.add(list.get(i));
            }
            remove(minSign-1,maxSign);
            list.add("0");
        }
    }

    @Deprecated
    public void remove(int min, int max){
        for (int i = max; i > min ; i--) {
            list.remove(i);
        }
    }
}
