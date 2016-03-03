package by.it.novik.JD01_13;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DataReader {

    public static double sum = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter positive integers, please. When done type 'END'");

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        while (true) {
            String rLine = bufferedReader.readLine();
            if (rLine.equals("END")) break;
            try {
                stringConverter(rLine);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, you were asked to enter an integer");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public static double stringConverter(String str) throws ArithmeticException{

        double i = Double.parseDouble(str);
        if (i<0) throw new ArithmeticException("Sorry, your number isn't positive. It can't be square-rooted:(");
        double sqrted = Math.sqrt(i);
        sum=sum+sqrted;
        System.out.println("You entered " + i + ". Its square-roots sum is " + sqrted + ". Total square-roots sum is " + sum);
        return sqrted;
    }



}


