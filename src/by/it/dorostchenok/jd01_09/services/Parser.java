package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.exception.BadOperationException;
import by.it.dorostchenok.jd01_09.interfaces.Calc;
import by.it.dorostchenok.jd01_09.values.FloatValue;
import by.it.dorostchenok.jd01_09.values.Operation;
import by.it.dorostchenok.jd01_09.values.Value;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static final String REGEX_REAL_NUMBER = "[-+]?[0-9]*\\.?[0-9]*";
    public static final String REGEX_VECTOR = "(?<!\\{)\\{(-?((\\d)|(\\d.\\d)),?)+\\}(?!\\})";
    public static final String REGEX_MATRIX = "\\{((\\{(-?\\d(.\\d)?,?)+\\}),?){2,}\\}";
    public static final String REGEX_OPERATION = "(?<=\\}|\\d)([+\\-*/])(?=\\{|\\d|-)";
    public static final String REGEX_FIRST_PRIORITY_OP = "(?<=\\}|\\d)([*/])(?=\\{|\\d|-)";
    public static final String REGEX_SECOND_PRIORITY_OP = "(?<=\\}|\\d)([+\\-])(?=\\{|\\d|-)";


    public String parse(String inputString) throws BadOperationException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        inputString = inputString.replace(" ", "");
        Pattern pattern = Pattern.compile(REGEX_FIRST_PRIORITY_OP);
        Matcher matcher = pattern.matcher(inputString);
        Pattern pattern1 = Pattern.compile(REGEX_SECOND_PRIORITY_OP);
        Matcher matcher1 = pattern1.matcher(inputString);

        Matcher[] matchers = {matcher, matcher1};
        if (matcher.find()){
            matcher.reset();

            parse(doParse(matcher, inputString));
        } else if (matcher1.find()){
            matcher1.reset();
            parse(doParse(matcher1, inputString));
        }

        return "";
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

        Operation operation;

        if ("+".equals(stringToParse)){
            operation = Operation.ADD;
        } else if ("-".equals(stringToParse)){
            operation = Operation.SUB;
        } else if ("*".equals(stringToParse)){
            operation = Operation.MUL;
        } else if ("/".equals(stringToParse)){
            operation = Operation.DIV;
        } else {
        throw new BadOperationException();
        }

        return operation;
    }

    private String doParse(Matcher matcher, String input) throws BadOperationException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        String trimedInput = input.trim().replace(" ", "");

        if (matcher.find()){

            int start = matcher.start();
            int end = matcher.end();
            String leftPart = trimedInput.substring(0, start);
            String rightPart = trimedInput.substring(end);
            System.out.println(leftPart);

            String[] tmpArr = leftPart.split(REGEX_OPERATION);
            String firstOperand = tmpArr[tmpArr.length - 1];
            tmpArr = rightPart.split(REGEX_OPERATION);
            String secondOperand = tmpArr[0];

            Value firstVale = parseValue(firstOperand);
            Value secondValue = parseValue(secondOperand);
            Operation operation = parseOperation(matcher.group());
            System.out.println(firstOperand + operation + secondOperand);

            Expression expression = new Expression(firstVale, secondValue, operation);
            Calculator calc = new Calculator();
            Value result = calc.calculate(expression);

            StringBuilder restOfLeftPart = new StringBuilder(leftPart);
            restOfLeftPart.replace(leftPart.lastIndexOf(firstOperand), leftPart.length() + 1, "");
            String restOfRightPart = rightPart.replaceFirst(secondOperand, "");
            String newInputString = restOfLeftPart + result.getValue() + restOfRightPart;
            System.out.println(restOfLeftPart + result.getValue() + restOfRightPart);

            return newInputString;

        } else{
            return input;
        }
    }
}
