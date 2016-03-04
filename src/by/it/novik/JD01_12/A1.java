package by.it.novik.JD01_12;


import java.util.ArrayList;
import java.util.List;

public class A1 {
    public static void main(String[] args) {

        System.out.println("Полный список отметок: ");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<15;i++) {
            arrayList.add(1+(int)(Math.random()*10));
            System.out.print(arrayList.get(i) + "\t");
        }
                System.out.println();

        int i=0;
        while (i<arrayList.size()) {
                if (arrayList.get(i)<4) {
                arrayList.remove(i);
                 }
            else i++;
        }

            System.out.println("Список удовлетворительных отметок: ");
                for (Integer in:arrayList)
                        System.out.print(in + "\t");
    }
}
