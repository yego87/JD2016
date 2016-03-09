package by.it.chetovich.JD01_15_A;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * JD01_15_A
 */
public class Main {

    public static void main(String[] args) {

        int [][] matrix = Utils15A.createMatrix(4);

        String src = System.getProperty("user.dir") + "/src/by/it/chetovich/JD01_15_A/matrix.txt";
        File file = new File(src);
        try (PrintWriter print = new PrintWriter(new FileWriter(file))){
            Utils15A.printMatrixToConsole(matrix);
            Utils15A.printMatrixToFile(matrix,print);
        }
        catch (IOException e){
            System.out.println("Writing to file "+file+" has failed.");
        }

    }
}
