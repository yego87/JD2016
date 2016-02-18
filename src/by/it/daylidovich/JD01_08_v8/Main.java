package by.it.daylidovich.JD01_08_v8;

public class Main {
    public static void main(String[] args){
        Tanker tanker1 = new Tanker(123, "Джек Ворабей");
        Tanker tanker2 = new Tanker(666, "Черная Борода", 250, 45);

        tanker1.getNameCaptain();
        tanker2.getNumberOfShip();
        tanker2.getShipWeight();
        tanker2.getShipWidth();
        tanker1.getDateDispatch();
        tanker1.atPort();
        System.out.println(tanker1.getShipCategory());

    }
}
