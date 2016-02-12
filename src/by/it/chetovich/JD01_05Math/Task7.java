package by.it.chetovich.JD01_05Math;

import java.util.Arrays;

/**
 * Created by Yultos_ on 11.02.2016.
 */
public class Task7 {
    public void createArrays(){
        double [] t = new double[34];
        int count = 0;
        for (int i=0; i<34; i++) {
            double s = Math.random()*5+4; //diapazon ot 4 do 9
            s = (Math.rint(s * 100))/100;
            t[i] = s;
            if (t[i]<0.4*i) count++;//srazu s4itaem skolko elementov budet vo vtorom massive
        }

        double [] k = new double[count];
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i]<0.4*i){
                k[j] = t[i];
                j++;
            }
        }

        int rowsT = defineRowsQuantity(t.length, 4);
        int rowsK = defineRowsQuantity(k.length, 4);
        System.out.println(rowsT);

        ArrayTableForTask7.arrayOut(k,rowsK,4);

    }

    /**
     *
     * @param elementsQuantity - koli4estvo elementov v massive
     * @param cols - maksimalno dopustimoe koli4estvo stolbcov
     * @return minimalnoe koli4estvo strok
     */
    private int defineRowsQuantity (int elementsQuantity, int cols){

        double rowsD = (double)elementsQuantity/cols;
        int rows = (int)Math.round(rowsD);
        return rows;
    }


}
