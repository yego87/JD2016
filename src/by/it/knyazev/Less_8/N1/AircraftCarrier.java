package by.it.knyazev.Less_8.N1;

import java.lang.ref.SoftReference;

/**
 * Created by Artsem Kniazeu on 22.02.2016.
 */
public class AircraftCarrier extends WarShip{
    public AircraftCarrier(String name){
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Artiom");
    }

    @Override
    public String toString(){

        return "Ship name is "+this.name;
    }
}
