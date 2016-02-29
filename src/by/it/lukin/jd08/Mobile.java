package by.it.lukin.jd08;

/**
 * Created by алексей on 25.02.2016.
 */
public interface Mobile {
    boolean isCallable();
    boolean isSendableSMS();
    boolean isTakablePhoto();
    boolean isTouchableScreen();
    boolean isSendableMMS();
    boolean isConnectingToTheInternet();
    boolean isDoBarrelRoll();
}
