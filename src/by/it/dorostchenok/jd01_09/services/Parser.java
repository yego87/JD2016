package by.it.dorostchenok.jd01_09.services;

import by.it.dorostchenok.jd01_09.exception.BadOperationException;
import by.it.dorostchenok.jd01_09.exception.BadValueException;
import by.it.dorostchenok.jd01_09.exception.VariableNotDefinedException;
import by.it.dorostchenok.jd01_09.interfaces.VariableStorageDAO;
import by.it.dorostchenok.jd01_09.values.FloatValue;
import by.it.dorostchenok.jd01_09.values.Operation;
import by.it.dorostchenok.jd01_09.values.Value;
import by.it.dorostchenok.jd01_09.values.Variable;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static final String REGEX_VARIABLE_NAME = "^[A-Za-z]\\w*";
    public static final String REGEX_REAL_NUMBER = "[-+]?[0-9]*\\.?[0-9]*";
    public static final String REGEX_VECTOR = "(?<!\\{)\\{(-?((\\d)|(\\d.\\d)),?)+\\}(?!\\})";
    public static final String REGEX_MATRIX = "\\{((\\{(-?\\d(.\\d)?,?)+\\}),?){2,}\\}";
    public static final String REGEX_OPERATION = "(?<=\\}|\\d|[a-z])([+\\-*/])(?=\\{|\\d|-|[a-z])|(=)";
    public static final String REGEX_FIRST_PRIORITY_OP = "(?<=\\}|\\d|[a-z])([*/])(?=\\{|\\d|-|[a-z])";
    public static final String REGEX_SECOND_PRIORITY_OP = "(?<=\\}|\\d|[a-z])([+\\-])(?=\\{|\\d|-|[a-z])";
    public static final String REGEX_THIRD_PRIORITY_OP = "=";

    private Calculator calc = new Calculator();
    private Value result;
    private VariableStorageDAO storage;
    private Operation operation;
    private Value firstVale;
    private Value secondValue;


//    public Parser(VariableStorageDAO storage){
//        this.storage = storage;
//    }

    public Value parse(String str, VariableStorageDAO varsStorage) throws BadOperationException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, BadValueException, VariableNotDefinedException {
        operation = null;
        firstVale = null;
        secondValue = null;
        this.storage = varsStorage;
        parseString(str);
        return result;
    }

    public String parseString(String inputString) throws BadOperationException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadValueException, VariableNotDefinedException {

        inputString = inputString.replace(" ", "");
        Pattern pattern = Pattern.compile(REGEX_FIRST_PRIORITY_OP);
        Matcher matcher = pattern.matcher(inputString);
        Pattern pattern1 = Pattern.compile(REGEX_SECOND_PRIORITY_OP);
        Matcher matcher1 = pattern1.matcher(inputString);
        Pattern pattern2 = Pattern.compile(REGEX_THIRD_PRIORITY_OP);
        Matcher matcher2 = pattern2.matcher(inputString);

        if (matcher.find()){
            matcher.reset();
            parseString(doParse(matcher, inputString));
        } else if (matcher1.find()){
            matcher1.reset();
            parseString(doParse(matcher1, inputString));
        } else if (matcher2.find()){
            matcher2.reset();
            parseString(doParse(matcher2, inputString));
        }

        return inputString;
    }

    private Value parseValue(String value) throws BadValueException, VariableNotDefinedException {

        if ("=".equals(operation.toString())){
            if (firstVale == null){
                if (!value.matches(REGEX_VARIABLE_NAME)){
                    throw new BadValueException();
                }
            }

        }
        if (value.matches(REGEX_REAL_NUMBER)){
            return new FloatValue(Double.parseDouble(value));
        } else if (value.matches(REGEX_VARIABLE_NAME)){
            if (!"=".equals(operation.toString())){
                Value v = storage.getVariable(value);
                if (v == null){
                    throw new VariableNotDefinedException();
                } else {
                    return ((Variable)v).getVariableValue();
                }
            }
            return new Variable(value);
        } else {
            System.out.println("!!!!!!!!!!!");
            throw new BadValueException();
        }
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
        } else if ("=".equals(stringToParse)){
            operation = Operation.ASG;
        } else {
        throw new BadOperationException();
        }

        return operation;
    }

    private String doParse(Matcher matcher, String input) throws BadOperationException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, BadValueException, VariableNotDefinedException {

        String trimedInput = input.trim().replace(" ", "");

        if (matcher.find()){

            int start = matcher.start();
            int end = matcher.end();
            String leftPart = trimedInput.substring(0, start);
            String rightPart = trimedInput.substring(end);
            System.out.println("Left part: " + leftPart);

            String[] tmpArr = leftPart.split(REGEX_OPERATION);
            String firstOperand = tmpArr[tmpArr.length - 1];
            tmpArr = rightPart.split(REGEX_OPERATION);
            String secondOperand = tmpArr[0];

            System.out.println("OPERAND: " + firstOperand + " " + secondOperand);

            operation = parseOperation(matcher.group());
            firstVale = parseValue(firstOperand);
            secondValue = parseValue(secondOperand);
            System.out.println(firstOperand + operation + secondOperand);

            Expression expression = new Expression(firstVale, secondValue, operation);
            //Calculator calc = new Calculator();
            result = calc.calculate(expression);

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
