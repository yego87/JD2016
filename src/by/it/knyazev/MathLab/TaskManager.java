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

    public List<String> list = new ArrayList<String>();

    public List<String> listTemp = new ArrayList<String>();

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
            System.out.println("RoundBrackets");
            brRemoveByID();
        }
        if (!brackets.bracketsRound(line) && brackets.bracketsSquare(line)){ // если [ ] - матрица
            System.out.println("SquareBrackets");
        }
        if (brackets.bracketsRound(line) && brackets.bracketsSquare(line)) // если {} и []
        {
            System.out.println("BothBrackets");
        }
        if (!brackets.bracketsRound(line) && !brackets.bracketsSquare(line)){ // если отсутствуют
           answer = count.count(list); // отправляем считать
        }
    }

    public void printAnswer(){
        System.out.println("Answer: "+answer);
    }

    public void brRemoveByID(){
        int brR = 0;
        brR = bracketsID.bracketsRoundID(list);

    }
}
