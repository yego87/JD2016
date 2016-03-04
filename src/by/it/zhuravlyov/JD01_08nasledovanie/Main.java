package by.it.zhuravlyov.JD01_08nasledovanie;

/**
 * Created by user_2 on 22.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Bookcupboard cupboard1 = new Bookcupboard("книжный шкаф",220,100,true);
        Bookcupboard cupboard2 = new Bookcupboard("шкаф настил",90,180,"металл",true,"серый");

        cupboard1.getMebelCategory();
        cupboard2.getMebelMaterial();
        cupboard2.getMebelHight();
        cupboard1.getMebelLeight();
        cupboard1.getMebelCompile();
        cupboard2.MebelColour();
    }


}