package by.it.lukin.jd08;

public abstract class SiemensMobile implements Mobile{
    @Override
    public boolean isCallable() {
        return false;
    }

    @Override
    public boolean isSendableSMS() {
        return false;
    }

    @Override
    public boolean isTakablePhoto() {
        return false;
    }

    @Override
    public boolean isTouchableScreen() {
        return false;
    }

    @Override
    public boolean isSendableMMS() {
        return false;
    }

    @Override
    public boolean isConnectingToTheInternet() {
        return false;
    }

    @Override
    public boolean isDoBarrelRoll() {
        return false;
    }
}
