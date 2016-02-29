package by.it.novik.JD01_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DataReader {
    public static void main(String[] args) throws IOException {


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                 String rLine = bufferedReader.readLine();
                 bufferedReader.close();

        String[] str = rLine.split(" ");
    }

}


