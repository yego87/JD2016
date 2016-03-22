package by.it.chetovich.JD02_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * JD02_06 A
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        for (int i = 0; i < 5; i++) {
            try {
                line = bufferedReader.readLine();
                Integer num = Integer.parseInt(line);
                System.out.println((i+1)+" line = "+num);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
                Logger.getInstance().writeToLog(e.getMessage());
            }

        }
        bufferedReader.close();

    }
}
