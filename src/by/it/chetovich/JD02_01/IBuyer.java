package by.it.chetovich.JD02_01;

/**
 * interface for buyers
 */
public interface IBuyer {

    void enterMarket();
    void chooseGoods();
    void exitMarket();
    void goToQueue() throws InterruptedException;
    void waitingInTheQueue() throws InterruptedException;
}
