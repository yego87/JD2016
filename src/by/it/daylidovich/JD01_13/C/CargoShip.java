package by.it.daylidovich.JD01_13.C;

import java.util.Date;

public abstract class CargoShip implements IShip {
    private int NumberOfShip = 0;
    private String NameCaptain = null;

    public void setShipWeight(int shipWeight) throws NegativeMassException {
        if (shipWeight < 0){
            throw new NegativeMassException("Отрицательная масса корабля.");
        }
        ShipWeight = shipWeight;
    }

    private int ShipWeight = 0;
    private int ShipWidth = 0;
    private Date DateDispatch = null;

    @Override
    public boolean atPort() {
        System.out.println("Метод проверяет находится ли корабль в порту в данный момент.");
        return false;
    }

    @Override
    public int getNumberOfShip() {
        System.out.println("Метод возвращает номер корабля.");
        return NumberOfShip;
    }

    @Override
    public String getNameCaptain() {
        System.out.println("Метод возвращает имя и фамилию капитана корабля.");
        return NameCaptain;
    }

    @Override
    public int getShipWeight() {
        System.out.println("Метод возвращает массу корабля.");
        return ShipWeight;
    }

    @Override
    public int getShipWidth() {
        System.out.println("Метод возвращает ширину корабля.");
        return ShipWidth;
    }

    @Override
    public Date getDateDispatch() {
        System.out.println("Метод возвращает дату отправки корабля в плавание.");
        return DateDispatch;
    }

    @Override
    public String getShipCategory() {
        System.out.println("Возвращает категорию корабля и подкатегорию.");
        return "Категория: грузовой карабль.";
    }
}
