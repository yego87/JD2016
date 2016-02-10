package by.it.dorostchenok.lecture2;

import java.io.IOException;
import java.util.Arrays;

import by.it.dorostchenok.lecture2.utils.Utils;
import by.it.dorostchenok.lecture2.utils.Matrix;
import by.it.dorostchenok.lecture2.tasks.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // read line from console
        String rString = Utils.readLine();
        // try parse string to integer array and return it
        int intArray[] = Utils.parseStringToIntArray(rString);
        // instance of Group A
        TaskA taskA = new TaskA();
        /**
         * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и
              их длину
         */
        taskA.findLongestAndShortestElement(intArray);
        /**
         * 2. Вывести на консоль те числа, длина которых меньше (больше) средней, а
              также длину.
         */
        taskA.showNumbersLessThanAverage(intArray);
        /**
         * 3. Найти число, состоящее только из различных цифр. Если таких чисел не-
           сколько, найти первое из них.
         */
        taskA.showFirstDifferentNumber(intArray);
        /**
         * 4. Среди чисел найти число-палиндром. Если таких чисел больше одного,
           найти второе.
         */
        taskA.showPalindrome(intArray);
        /**
         * GROUP B
         */
        // instance of Group B
        TaskB taskB = new TaskB();
        /**
         * 1. Определить принадлежность некоторого значения k интервалу [n, m].
         */
        int[] interval = {-1, 4};
        int valueToCheck = 3;
        boolean isBelongs = taskB.isBelongsToInterval(valueToCheck, interval);
        if (isBelongs){
            System.out.println("Value " + valueToCheck +
                    " belongs to interval " + Arrays.toString(interval));
        }else{
            System.out.println("Value " + valueToCheck +
                    " doesn't belong to interval " + Arrays.toString(interval));
        }

        /**
         *2. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху
             вниз.
         */
        taskB.showMatrix(26);
        /**
         * 3. Найти корни квадратного уравнения. Параметры уравнения передавать с
           командной строкой.
         */
        double a = (double)Integer.valueOf(args[0]);
        double b = (double)Integer.valueOf(args[1]);
        double c = (double)Integer.valueOf(args[2]);
        taskB.solveQuadraticEquation(a, b, c);
        /**
         * 4. Ввести число от 1 до 12. Вывести на консоль название месяца,
           соответствующего данному числу. Осуществить проверку корректности
           ввода чисел.
         */
        taskB.printMonth(12);

        /**
         * TASK OF GROUP C
         */

        TaskC taskC = new TaskC();
        double[][] matrix = Matrix.generateMatrix(4);
        Matrix.printMatrix(matrix);
        System.out.println("#################################");
        /**
         * 1. Найти сумму элементов матрицы, расположенных между первым и вторым
         положительными элементами каждой строки.
         */
        taskC.getSumOfELementsInPositiveRange(matrix);
        System.out.println("#################################");
        /**
         * 2. Транспонировать матрицу.
         */
        double[][] tMatrix = taskC.transposeMatrix(matrix);
        Matrix.printMatrix(tMatrix);
        System.out.println("#################################");
        /**
         * 3. Повернуть матрицу на 90 градусов против часовой стрелки.
         */
        Matrix.printMatrix(taskC.turnMatrix(matrix));
        System.out.println("#################################");
        /**
         * 4. Построить матрицу, вычитая из элементов каждой строки матрицы ее сред-
           нее арифметическое.
         */
        Matrix.printMatrix(taskC.avgMatrix(matrix));
        System.out.println("#################################");
        /**
         * 5. Найти максимальный элемент (ы) в матрице и удалить из матрицы все
           строки и столбцы, его содержащие.
         */
        Matrix.printMatrix(taskC.deleteMaxRowsCols(matrix));
    }
}
