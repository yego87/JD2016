package by.it.zhuravlyov.JD01_08nasledovanie;

/**
 * Created by home borovai on 02.03.2016.
 */
public abstract class Cupboard implements Mebel1 {
    public String MebelCategory;
    public String MebelMaterial;
    public String MebelColour;
    public int MebelHight;
    public int MebelLeight;
    boolean MebelCompile;

    @Override
    public String getMebelCategory() {
        System.out.println("Метод возвращает категорию мебели");
        return MebelCategory;
    }

    @Override
    public String MebelColour() {
        System.out.println("Метод возвращает цвет мебели");
        return MebelColour;
    }

    @Override
    public String getMebelMaterial() {
        System.out.println("Метод возвращает из чего изготовленна мебель");
        return MebelMaterial;
    }

    @Override
    public int getMebelHight() {
        System.out.println("Метод возвращает высоту мебели");
        return MebelHight;
    }

    @Override
    public int getMebelLeight() {
        System.out.println("Метод возвращает длинну мебели");
        return MebelLeight;
    }

    @Override
    public boolean getMebelCompile() {
        System.out.println("Метод считывает собрана мебель или нет");
        return true;
    }
}
