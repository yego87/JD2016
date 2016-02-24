package by.it.daylidovich.JD01_09;

import java.io.IOException;

import static by.it.daylidovich.JD01_09.Reader.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        System.out.println("Проверка работы с числами.");
        System.out.println(new VarableFloat("1").add(new VarableFloat("2")));
        System.out.println(new VarableFloat("5").sub(new VarableFloat("3")));
        System.out.println(new VarableFloat("4").mult(new VarableFloat("2")));
        System.out.println(new VarableFloat("9").div(new VarableFloat("3")));

        System.out.println("Проверка работы с векторами.");
        double[] vec1 = {1,2,3};
        System.out.println("Сложение");
        System.out.println(new VarableVector(vec1).add(new VarableFloat("3")));
        System.out.println(new VarableVector(vec1).add(new VarableVector("{4,5,6}")));
        System.out.println("Вычитание");
        System.out.println(new VarableVector("{4,5,6}").sub(new VarableFloat("3")));
        System.out.println(new VarableVector("{4,5,6}").sub(new VarableVector(vec1)));
        System.out.println("Умножение");
        System.out.println(new VarableVector(vec1).mult(new VarableFloat("2")));
        System.out.println(new VarableVector(vec1).mult(new VarableVector("{4,5,6}")));
        System.out.println("Деление");
        System.out.println(new VarableVector(vec1).div(new VarableFloat(2)));

        System.out.println("Проверка работы с матриц.");
        double[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        String string = "{{1,2,3},{4,5,6},{7,8,9}}";
        System.out.println("Сложение");
        System.out.println(new VarableMatrix(matrix).add(new VarableFloat(5)));
        System.out.println(new VarableMatrix(matrix).add(new VarableMatrix(string)));
        System.out.println("Вычитание");
        System.out.println(new VarableMatrix(matrix).sub(new VarableFloat(5)));
        System.out.println(new VarableMatrix(matrix).sub(new VarableMatrix(string)));
        System.out.println("Умножение");
        System.out.println(new VarableMatrix(matrix).mult(new VarableFloat(2)));
        System.out.println(new VarableMatrix("{{33,34,12},{33,19,10},{12,14,17},{84,24,51},{43,71,21}}").mult(new VarableMatrix("{{10,11,34,55},{33,45,17,81},{45,63,12,16}}")));
        */
        System.out.println("Введите выражение для рассчета или нажмите Enter для выхода.");
        String string = readInput();
        while (string.trim().length() != 0){
            String operation = readOperation(string);
            String firstTerm = readFirstTerm(string);
            String secondTerm = readSecondTerm(string);
            if (operation != null && firstTerm != null && secondTerm != null){
                switch (operation){
                    case "+":
                        System.out.println(getVarable(firstTerm).add(getVarable(secondTerm)));
                        break;
                    case "-":
                        System.out.println(getVarable(firstTerm).sub(getVarable(secondTerm)));
                        break;
                    case "*":
                        System.out.println(getVarable(firstTerm).mult(getVarable(secondTerm)));
                        break;
                    case "/":
                        System.out.println(getVarable(firstTerm).div(getVarable(secondTerm)));
                        break;
                    default:
                        System.out.println("Некоректный ввод.");
                }
            }
            else System.out.println("Некоректный ввод.");
            System.out.println("Введите выражение для рассчета или нажмите Enter для выхода.");
            string = readInput();
        }
    }
}
