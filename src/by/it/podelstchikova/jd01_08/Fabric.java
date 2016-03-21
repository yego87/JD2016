package by.it.podelstchikova.jd01_08;

/**
 * Created by мое не трошь on 19.02.2016.
 */
public interface Fabric {     //интерфейс ткань
    int getSize();        //список всех функций
    String getColor();
    String getStyle();


    void setSize(int size);

    void setColor(String color);
    void setStyle(String style);
    double getCost();
    void setCost(double cost);
    String toString();



}
