package by.it.dorostchenok.jd01_09.services;

public class Parser {
    public static final String REGEX_VECTOR = "({([-\\d,|.]{1,})(?!-).})|{\\d}";
    public static final String REGEX_OPERATION = "(?<=\\}|\\d)([+\\-*/])(?=\\{|\\d|-)";
}
