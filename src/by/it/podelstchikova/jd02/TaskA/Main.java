package by.it.podelstchikova.jd02.TaskA;


import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        String st=TaskA.scanLine();
        String[] val=TaskA.masString(st);
        TaskA.printMasLine(val);
        TaskA.maxMin(val);
        TaskA.halfVal(val);
        TaskA.noRepeat(val);
        TaskA.polindrom(val);



    }
}
