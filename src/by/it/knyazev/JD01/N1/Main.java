package by.it.knyazev.JD01.N1;

/**
 * Created by Artsem Kniazeu on 22.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        AircraftCarrier arr = new AircraftCarrier("DolgosRuk",6);
        arr.move();
        arr.printName();
        System.out.println(arr);
        if (arr.count()){
            System.out.println("Плывем");
        }else{
            System.out.println("Маловато нас");
        }
    }
}
