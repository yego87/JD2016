package by.it.predkel.JD0201Thread;
//вспомогательный класс с общими для всех классов величинами и методами
public class Dispatcher {
    //сколько планируется покупателей
    public static final int planCount=100;
    //это для начала обслуживания
    static int countBuyers=0; //общий счетчик покупателей
    static boolean planComplete() {   //метод определяющий выполнение плана
        return countBuyers>=planCount;
    }
    //это для завершения обслуживания
    static int countCompleteBuyers=0; //общий счетчик обслуженных покупателей
    static boolean finish() {         //метод определяющий конец обслуживания
        return countCompleteBuyers>=planCount;
    }
    static int countCashiers=0; //общий счетчик кассиров
    static void sleep(int ms) {
        try { //чтобы не загромождать код вынесем try для sleep в свой отдельный метод
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
