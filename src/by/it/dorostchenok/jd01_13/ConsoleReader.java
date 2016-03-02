package by.it.dorostchenok.jd01_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    private InputStreamReader inputStreamReader;
    private BufferedReader bufferedReader;

    public ConsoleReader(){
        this.inputStreamReader = new InputStreamReader(System.in);
        this.bufferedReader = new BufferedReader(this.inputStreamReader);
    }

    public String readLine() throws IOException {
        return bufferedReader.readLine();
    }

    public void close() throws IOException {
        bufferedReader.close();
    }

}
