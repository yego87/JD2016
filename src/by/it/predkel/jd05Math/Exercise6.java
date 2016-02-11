package by.it.predkel.jd05Math;

/**
 * По данной функции сформировать одномерный массив, состоящий из 20–40 элементов, при изменении аргумента в заданном интервале.
 * Организовать форматный вывод массива с заголовком и с
 * индексами. В сформированном массиве определить и вывести с
 * заголовком среднее арифметическое последних десяти элементов. Из
 * элементов кратных 3 сформировать новый массив.
 */
public class Exercise6 {
    public static void exercise6(){
        double[] mass=new double[40];
        int k=0;
        for (double x=0;x<8;x+=0.2,k++){
            mass[k]=Math.log(Math.abs(x-16));
        }

        PrintArray.printArray(mass,"m");
        int average=0;
        for (int i=mass.length-1; i>mass.length-11;i--)
            average+=mass[i];
        average/=10;
        System.out.println("Среднее арифметическое последних десяти элементов = "+average);

        double[] mass1=new double[40];
        int l=0;
        for (int j=0;j<mass.length;j++){
            if ((mass[j]%3==0)&&(mass[j]>=3)) {
                mass1[l] = mass[j];
                l++;
            }
        }
        if (l==0) {
            System.out.print("кратных трём нет. Но если округлить...\n");
            for (int j=0;j<mass.length;j++){
                if (((Math.round(mass[j]))%3==0)&&(mass[j]!=0)){
                    mass1[l] = mass[j];
                    l++;
                }
            }
            PrintArray.printArray(mass1,"m1",l);
        }
        else PrintArray.printArray(mass1,"m1");
    }
}
