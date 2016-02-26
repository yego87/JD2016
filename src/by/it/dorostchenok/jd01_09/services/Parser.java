package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.exception.BadOperationException;
import by.it.dorostchenok.jd01_09.values.FloatValue;
import by.it.dorostchenok.jd01_09.values.Operation;
import by.it.dorostchenok.jd01_09.values.Value;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static final String REGEX_REAL_NUMBER = "[-+]?[0-9]*\\.?[0-9]*";
    public static final String REGEX_VECTOR = "(?<!\\{)\\{(-?((\\d)|(\\d.\\d)),?)+\\}(?!\\})";
    public static final String REGEX_MATRIX = "\\{((\\{(-?\\d(.\\d)?,?)+\\}),?){2,}\\}";
    public static final String REGEX_OPERATION = "(?<=\\}|\\d)([+\\-*/])(?=\\{|\\d|-)";

    private String inputString = "";
    private Pattern pattern = Pattern.compile(REGEX_OPERATION);
    private Pattern realPattern = Pattern.compile(REGEX_REAL_NUMBER);

//    public Parser(String inputString){
//        this.inputString = inputString;
//    }


    public Expression parse(String inputString) throws BadOperationException {
        Value firstValue;
        Value secondValue;
        Operation operation;
        String trimedInput = inputString.trim().replace(" ", "");

        operation = parseOperation(trimedInput);
        System.out.println(operation.toString());
        List<Value> valuesList = new ArrayList<>(2);
        String[] valuesArray = inputString.split("\\" + operation.toString());
        for (String val : valuesArray){
            valuesList.add(parseValue(val));
        }

        //System.out.println(Arrays.toString(valuesArray));

        return new Expression(valuesList.get(0), valuesList.get(1), operation);
    }

    private Value parseValue(String value){
        Pattern realPattern = Pattern.compile(REGEX_REAL_NUMBER);
        Pattern vectorPattern = Pattern.compile(REGEX_VECTOR);

        Matcher realMatcher = realPattern.matcher(value);
        Matcher vectorMatcher = vectorPattern.matcher(value);

        if (realMatcher.find()){
            return new FloatValue(Double.parseDouble(
                    value.substring(realMatcher.start(), realMatcher.end())));
        }

        return new FloatValue(0);
    }

    private Operation parseOperation(String stringToParse) throws BadOperationException {
        Matcher matcher = pattern.matcher(stringToParse);
        String parsedOperation;
        Operation operation;
        if (matcher.find()){
            parsedOperation = stringToParse.substring(matcher.start(), matcher.end());
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
            throw new BadOperationException();
        }
        return operation;
    }
}
