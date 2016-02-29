package by.it.lukin.jd08;

/**
 * Created by алексей on 25.02.2016.
 */
public class Model extends SiemensMobile
{
    private boolean isCallable;
    private boolean isSendableSMS;
    private boolean isTakablePhoto;
    private boolean isTouchableScreen;
    private boolean isSendableMMS;
    private boolean isConnectingToTheInternet;
    private boolean isDoBarrelRoll;


    public Model(boolean isCallable,boolean isSendableSMS,boolean isTakablePhoto,boolean isTouchableScreen,boolean isSendableMMS,boolean isConnectingToTheInternet,boolean isDoBarrelRoll){
        this.isCallable = isCallable;
        this.isSendableSMS = isSendableSMS;
        this.isTakablePhoto = isTakablePhoto;
        this.isTouchableScreen = isTouchableScreen;
        this.isSendableMMS = isSendableMMS;
        this.isConnectingToTheInternet = isConnectingToTheInternet;
        this.isDoBarrelRoll = isDoBarrelRoll;
    }

    @Override
    public boolean isCallable() {
        return this.isCallable;
    }

    @Override
    public boolean isSendableSMS() {
        return this.isSendableSMS;
    }

    @Override
    public boolean isTakablePhoto() {
        return this.isTakablePhoto;
    }

    @Override
    public boolean isTouchableScreen() {
        return this.isTouchableScreen;
    }

    @Override
    public boolean isSendableMMS() {
        return this.isSendableMMS;
    }

    @Override
    public boolean isConnectingToTheInternet() {
        return this.isConnectingToTheInternet;
    }

    @Override
    public boolean isDoBarrelRoll() {
        return this.isDoBarrelRoll;
    }
}
