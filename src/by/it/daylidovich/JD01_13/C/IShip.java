package by.it.daylidovich.JD01_13.C;

import java.util.Date;

public interface IShip {

    boolean atPort();
    int getNumberOfShip();
    String getNameCaptain();
    String getShipCategory();
    int getShipWeight();
    int getShipWidth();
    Date getDateDispatch();
}
