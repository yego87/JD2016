package by.it.knyazev.Less_8.N1;

/**
 * Created by Artsem Kniazeu on 22.02.2016.
 */
public abstract class WarShip implements IShip {
    String name;
    public WarShip(String name){
        this.name = name;
    }

    @Override
    public String printName() {
        System.out.print(this.name);
        return null;
    }

    @Override
    public void move(){
        System.out.println("Yule4ka");
    }
}
