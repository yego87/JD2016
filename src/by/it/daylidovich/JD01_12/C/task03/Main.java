package by.it.daylidovich.JD01_12.C.task03;

import java.io.IOException;

import static by.it.daylidovich.JD01_12.C.task03.Validation.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите выражение.");
        String string = readExpression();
        if (validExpression(createBracketArray(string)))
            System.out.println("Выражение корректно.");
        else System.out.println("Выражение не корректно.");
    }
}
