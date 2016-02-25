package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.exception.OperationNotFoundException;
import by.it.dorostchenok.jd01_09.values.Operation;
import by.it.dorostchenok.jd01_09.values.Value;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static final String REGEX_REAL_NUMBER = "[-+]?[0-9]*\\.?[0-9]*";
    public static final String REGEX_VECTOR = "({([-\\d,|.]{1,})(?!-).})|{\\d}";
    public static final String REGEX_OPERATION = "(?<=\\}|\\d)([+\\-*/])(?=\\{|\\d|-)";

    private String inputString = "";
    private Pattern pattern = Pattern.compile(REGEX_OPERATION);

//    public Parser(String inputString){
//        this.inputString = inputString;
//    }


    public Expression parse(String inputString) throws OperationNotFoundException {
        Value firstValue;
        Value secondValue;
        String s = inputString.trim().replace(" ", "");
        Matcher matcher = pattern.matcher(s);
        String parsedOperation;
        Operation operation;
        if (matcher.find()){
            parsedOperation = s.substring(matcher.start(), matcher.end());
            if ("+".equals(parsedOperation)){
                operation = Operation.ADD;
            } else if ("-".equals(parsedOperation)){
                operation = Operation.SUB;
            } else if ("*".equals(parsedOperation)){
                operation = Operation.MUL;
            } else {
                operation = Operation.DIV;
            }
        } else {
            throw new OperationNotFoundException();
        }

        String[] valuesArray = inputString.split("\\" +parsedOperation);
        System.out.println(Arrays.toString(valuesArray));

        return new Expression(null, null, null);
    }
}
