package by.it.daylidovich.JD01_08_v8;

import java.util.Date;

public class Tanker extends CargoShip {//наследование
    private int NumberOfShip = 0;
    private String NameCaptain = null;
    private int ShipWeight = 0;
    private int ShipWidth = 0;
    private Date DateDispatch = null;

    Tanker(int NumberOfShip, String NameCaptain){
        this.NumberOfShip = NumberOfShip;
        this.NameCaptain = NameCaptain;
    }

    //пример статического полиморфизма
    Tanker(int NumberOfShip, String NameCaptain, int ShipWeight, int ShipWidth){
        this.NumberOfShip = NumberOfShip;
        this.NameCaptain = NameCaptain;
        this.ShipWeight = ShipWeight;
        this.ShipWidth = ShipWidth;
    }

    //Пример динамического полиморфизма
    @Override
    public String getShipCategory() {
        return super.getShipCategory() + "\nПодкатегория: танкер.";
    }

}
