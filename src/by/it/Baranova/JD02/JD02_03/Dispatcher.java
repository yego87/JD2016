package by.it.Baranova.JD02.JD02_03;


public class Dispatcher {

    private static final int planCount=60;
    static volatile int countBuyers=0;
    static boolean planComplete() {return countBuyers>=planCount;}

    static volatile int countCompleteBuyers=0;
    static boolean finish(){return countCompleteBuyers==planCount;}

    static volatile int countCashiers=0;
    static void sleep (int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

