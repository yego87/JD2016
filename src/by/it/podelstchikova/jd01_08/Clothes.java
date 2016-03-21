package by.it.podelstchikova.jd01_08;


public abstract class Clothes implements Fabric
{
    private int size;
    private String color;
    private String style;
    private double cost;


    @Override
    public double getCost() {
        return cost;
    }
    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public int getSize()
    {
        return this.size;
    }
    @Override
    public void setSize(int size)
    {
        this.size = size;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }
    @Override
    public void setStyle(String style)
    {
        this.style = style;
    }
    @Override
    public String getColor()    {
        return this.color;
    }
    @Override
    public String getStyle()
    {
        return this.style;
    }

    @Override
    public String toString() {
        return "цвет "+this.color+" стиль "+this.style+" размер "+this.size+" стоимость "+this.cost;
    }
}
