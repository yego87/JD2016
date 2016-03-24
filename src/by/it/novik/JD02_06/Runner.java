package by.it.novik.JD02_06;


public class Runner {

    public static void main(String[] args) {

        String message = "ERROR";

        LoggerA log = LoggerA.getInst();

        log.writeFile(message);


    }

}
