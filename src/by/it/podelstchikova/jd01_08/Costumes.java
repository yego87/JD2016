package by.it.podelstchikova.jd01_08;

/**
 * Created by мое не трошь on 26.02.2016.
 */
public class Costumes extends Clothes {
    private int size=0;
    private String color="";
    private String style="";
    private double cost=0;

    public Costumes(String color, String style)
    {
        this.color=color;
        this.style=style;
    }
    public Costumes(int size, String color, String style, double cost) {
        this.size=size;
        this.color=color;
        this.style =style;
        this.cost =cost;
    }

    @Override
    public String getStyle() {
        return super.getStyle()+"крой костюма";
    }


    @Override
    public String getColor() {
        return super.getColor()+"- цвет костюма";

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
