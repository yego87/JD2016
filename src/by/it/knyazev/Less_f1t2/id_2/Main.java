package by.it.knyazev.Less_f1t2.id_2;


/**
 * Created by Artsem Kniazeu on 10.02.2016.
 */
 
public class Main {

    public static void main(String[] args) {
        String text=  "11 2 3 4 55 631";
        String[] tex = new String[text.length()];
        tex = text.split(" ");
        int max = tex[0].length();
        int min = tex[0].length();
        for (int i=1; i<tex.length; i++) {
            if (tex[i].length()<min){
                min=tex[i].length();
                System.out.println("a - " + min);
            }
            if (tex[i].length()>max){
                max=tex[i].length();
                System.out.println("b -" + max);
            }
        }
        for (int i=0; i<tex.length; i++){
            if (tex[i].length()==max){
                System.out.println("c - " + tex[i]);
            }
        }
        System.out.println("Max "+max);
        for (int i=0; i<tex.length; i++){
            if (tex[i].length()==min){
                System.out.println("d - " + tex[i]);
            }
        }
        System.out.println("Min "+min);

    }
}
