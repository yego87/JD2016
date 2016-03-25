package by.it.zhuravlyov.JD01_08nasledovanie;

/**
 * Created by home borovai on 02.03.2016.
 */
public class Bookcupboard extends Cupboard {

public Bookcupboard (String MebelCategory, int MebelHight,int MebelLeight ,boolean MebelCompile) {
    this.MebelCategory = MebelCategory;
    this.MebelHight = MebelHight;
    this.MebelLeight = MebelLeight;
    this.MebelCompile = MebelCompile;
}
    //статический полиморфизм
    public Bookcupboard (String MebelCategory, int MebelHight,int MebelLeight ,String MebelMaterial , boolean MebelCompile,String MebelColour){
        this.MebelCategory = MebelCategory;
        this.MebelHight = MebelHight;
        this.MebelLeight = MebelLeight;
        super.MebelMaterial = MebelMaterial;
        this.MebelCompile = MebelCompile;
        super.MebelColour = MebelColour;
        //111
}
}
