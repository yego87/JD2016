package by.it.podelstchikova.jd01_08;


public class Main
{
    public static void main(String[] args) {

       Costumes costumes = new Costumes(20,"","",20.1);
        Costumes cost =new Costumes("","");
        cost.setColor("красный");
        cost.setSize(23);
        cost.getColor();
        cost.getSize();
        cost.getStyle();
        cost.getCost();
        System.out.println(cost);
        System.out.println(costumes);

    }


}
