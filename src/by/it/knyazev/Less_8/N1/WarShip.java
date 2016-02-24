package by.it.knyazev.Less_8.N1;

/**
 * Created by Artsem Kniazeu on 22.02.2016.
 */
public abstract class WarShip implements IShip {
    String name;
    int i;
    public WarShip(String name, int ai){
        this.name = name;
        this.i = ai;
    }
    @Override
    public String printName() {
        System.out.print(this.name);
        return null;
    }
    @Override
    public String swim() {
        System.out.print("Можем плвать:0_0");
        return null;
    }
    @Override
    public String lazy(){
        System.out.println("AAA....");
        return null;
    }
    @Override
    public boolean count() {
        if (i<3){
            System.out.print("");
            return false;
        }
        else {
            return true;
        }
    }
    @Override
    public void move(){
        System.out.println("Yule4ka");
    }
}
