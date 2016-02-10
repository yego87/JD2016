package by.it.chetovich.JD01_02_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        TableCount tableCount = new TableCount();
        tableCount.printTable();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter several numbers dividing them by space");
                String rLine = reader.readLine();
                String [] array = rLine.split(" ");

        A1LongShortNumbers numbers = new A1LongShortNumbers();
        numbers.searchLongShort(array);

        A2AverageLength average = new A2AverageLength();
        average.averageLength(array);

        A3DifferentNumbers num = new A3DifferentNumbers();
        num.differentNums(array);

        A4Palindrom palindrom = new A4Palindrom();
        palindrom.palindrom(array);

        int [] arrayInt = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInt[i]=Integer.parseInt(array [i]);
        }
        for (int i : arrayInt) {
            System.out.println(i);
        }

        B1interval interval = new B1interval();
        interval.interval();

        int number;
        while (true) {
            System.out.println("Enter any number between 1 and 12");
            number = Integer.parseInt(reader.readLine());
            if (number < 1 || number > 12) System.out.println("The number you entered is out of the range. Try again)");
            else break;
            ;
        }
        B4months month = new B4months();
        System.out.println("You have entered month "+month.checkMonth(number));

        System.out.println("Enter 3 numbers for quadratic equation");
        System.out.println("Enter the first coefficient (not 0): ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter the second coefficient: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Enter the third coefficient: ");
        int c = Integer.parseInt(reader.readLine());
        B3equation equation = new B3equation();
        equation.calculateEquation(a,b,c);

        System.out.print("Enter a positive number k above 1: ");
        int k = Integer.parseInt(reader.readLine());
        System.out.print("Enter a positive number less than k, that you entered before: ");
        int n = Integer.parseInt(reader.readLine());
        B2matrix matrix = new B2matrix();
        matrix.createMatrix(k,n);



        System.out.println("Enter the size  of the matrix [n][n]: ");
        int size = Integer.parseInt(reader.readLine());
        CMatrix matrica = new CMatrix();
        int [][] newArr = matrica.createMatrix(size);

        C1MatrixSumBetweenPositiv sum = new C1MatrixSumBetweenPositiv();
        sum.sumBetweenPositiv(newArr);

        C2MatrixTranspon tMatrix = new C2MatrixTranspon();
        System.out.println(Arrays.deepToString(tMatrix.transponMatrix(newArr)));

        C3Matrix90degree matrix90 = new C3Matrix90degree();
        matrix90.turnMatrix(newArr);

        C7MatrixZeroInTheEnd zero = new C7MatrixZeroInTheEnd();
        zero.putZerosInTheBack(newArr);

        C4MatrixSubtractAverage averageTask = new C4MatrixSubtractAverage();
        averageTask.subtractAverage(newArr);

        C6MatrixMinElementInTheBeginning minInTheBeginning = new C6MatrixMinElementInTheBeginning();
        System.out.println(Arrays.deepToString(minInTheBeginning.moveMinElement(newArr)));

        C5SubtractLinesRowsWithMax arrWithoutMax = new C5SubtractLinesRowsWithMax();
        arrWithoutMax.createMatrixWithoutMax(newArr);


        // create 2 arrays for Gauss task

        double [][] gauss1 = new double [4][4];
        String line1 = "2 5 4 1 1 3 2 1 2 10 9 7 3 8 9 2";
        String [] array1 = line1.split(" ");
        int z = 0;
              for (int i = 0; i < gauss1.length; i++) {
            for (int j = 0; j < gauss1.length; j++) {
                gauss1[i][j] = Integer.parseInt(array1[z]);
                z++;
            }
        }
        double [] gauss2 = new double[4];
        String line2 = "20 11 40 37";
        String [] array2 = line2.split(" ");
        for (int i = 0; i < gauss2.length; i++) {
            gauss2[i] = Integer.parseInt(array2[i]);
        }

        Gauss gauss = new Gauss();
        gauss.searchRoots(gauss1, gauss2);

        InverseMatrixGauss inverseM = new InverseMatrixGauss();
        inverseM.inverseMatrix(gauss1);



    }
    }

