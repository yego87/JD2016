package by.it.knyazev.JD01.N1;

/**
 * Created by Artsem Kniazeu on 22.02.2016.
 */
public class AircraftCarrier extends WarShip{
    public AircraftCarrier(String name, int ai){
        super(name,ai);
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
