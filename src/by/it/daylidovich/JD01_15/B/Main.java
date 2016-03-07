package by.it.daylidovich.JD01_15.B;

import static by.it.daylidovich.JD01_15.B.ReaderWriter.*;

public class Main {
    public static void main(String[] args){
        StringBuilder text = readFile("src\\\\by\\\\it\\\\daylidovich\\\\JD01_15\\\\B\\\\ReaderWriter.java");
        deleteComment(text);
        printText(text);
    }
}
