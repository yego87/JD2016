package by.it.veselov.JD01_08;

/**
 * Created by yegorveselov on 23.02.16.
 */

abstract class NoteBook implements IPaper{
    private int kolichestvo;
    private String material;
    private int x,y;

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
        public void skleit(int kolichestvo) {
            this.kolichestvo  =  kolichestvo;
        }
        @Override
        public void tip(String material) {
            System.out.println(material);
            this.material = "";
        }
        @Override
        public void razmer(int x, int y) {
            System.out.println("Здесь храняться размеры");
            this.x=x;
            this.y=y;
        }

        @Override
        public void sgech() {
        System.out.println("сжечь тетрадь");
        }
}


