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

    public TaskManager(String line) {
        this.line = line;
    }

    public LineToArray lta = new LineToArray();

    public BracketsID bracketsID = new BracketsID();

    public TaskManager(){

    }

    public Brackets brackets = new Brackets();

    public Count count = new Count();

    public void requiredOperations(){
        list = lta.toArray(line);
        checkBrackets();

        printAnswer();
    }

    public void checkBrackets(){
        if (brackets.bracketsRound(line)){
            System.out.println("RoundBrackets");
            brRemoveByID();
        }
        if (brackets.bracketsSquare(line)){
            System.out.println("SquareBrackets");
        }
        else{
           answer = count.count(list);
        }
    }

    public void printAnswer(){
        System.out.println("Answer: "+answer);
    }

    public void brRemoveByID(){
        bracketsID.bracketsRoundID(list);
    }
}
