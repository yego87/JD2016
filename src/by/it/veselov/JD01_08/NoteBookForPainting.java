package by.it.veselov.JD01_08;

/**
 * Created by yegorveselov on 26.02.16.
 */
public class NoteBookForPainting extends NoteBook {
    private int kolichestvo;
    private String material;
    private int x,y;

    @Override
    public void razmer(int x, int y) {
        super.razmer(x, y);
    }

    @Override
    public void tip(String material) {
     System.out.println(material);
       this.material=material;
    }

    @Override
    public void sgech() {
    System.out.println("сжечь тетрадь для рисования");
    }

    @Override
    public void skleit(int kolichestvo) {
        super.skleit(kolichestvo);
    }

    @Override
    public void porvat() {

    }
}
