package by.it.predkel.MatLab.OtherClasses;

import by.it.predkel.MatLab.FloatVar;
import by.it.predkel.MatLab.MatrixVar;
import by.it.predkel.MatLab.Var;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * работа с окончательными объектами
 */
public class RunnerObj {

    private TreeMap<String,Var> assignment=new TreeMap<>();

    private static void one(Var v){
        if (v!=null) v.outPut();
    }

    public void sortvar() {
        if (!assignment.isEmpty()) {
            Set set = assignment.entrySet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();
                System.out.println(me);
            }
        }else
            System.out.print("Присваиваний не было");
    }

    public void input(String rLine) throws IOException,IllegalArgumentException,ArithmeticException {

        String[] expression = rLine.trim().split(" ");

        ArrayList<Var> varArr = new ArrayList<>();

        Pattern pat = Pattern.compile(Patterns.exMat);
        Pattern pat1 = Pattern.compile(Patterns.exVec);
        Pattern pat2 = Pattern.compile(Patterns.exVal);

        if (expression[1].trim().equals("=")) {//проверка на наличие присваивания
            Matcher mat = pat.matcher(expression[2]);
            Matcher mat1 = pat1.matcher(expression[2]);
            Matcher mat2 = pat2.matcher(expression[2]);

            if ((mat.matches()) || (mat1.matches())) {
                assignment.put(expression[0].trim(), new MatrixVar(expression[2]));
            } else if (mat2.matches()) {
                assignment.put(expression[0].trim(), new FloatVar(expression[2]));
            } else
                throw new IllegalArgumentException();
        } else {

            for (int i = 0; i < expression.length; i += 2) {
                Matcher mat = pat.matcher(expression[i]);
                Matcher mat1 = pat1.matcher(expression[i]);
                Matcher mat2 = pat2.matcher(expression[i]);
                if ((mat.matches()) || (mat1.matches())) {// определение переменных и запись в коллекции
                    varArr.add(new MatrixVar(expression[i]));
                } else if (mat2.matches()) {
                    varArr.add(new FloatVar(expression[i]));
                } else
                    throw new IllegalArgumentException();
            }

            for (int i = 1, count = 0; i < expression.length; i += 2, count += 2) {
                switch (expression[i].trim().charAt(0)) {
                    case '+':
                        one(varArr.get(count).add(varArr.get(count + 1)));
                        break;
                    case '-':
                        one(varArr.get(count).sub(varArr.get(count + 1)));
                        break;
                    case '*':
                        one(varArr.get(count).mul(varArr.get(count + 1)));
                        break;
                    case '/':
                        one(varArr.get(count).div(varArr.get(count + 1)));
                        break;
                }
            }
        }
    }
}
