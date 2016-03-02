package by.it.veselov.JD01_08;

/**
 * Created by yegorveselov on 26.02.16.
 */
public interface IPaper {
    void skleit(int kolichestvo);
    void sgech();
    void porvat();
    void tip(String material);
    void razmer(int x,int y);
    String getMaterial();
}
