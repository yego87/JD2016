package by.it.Baranova.JD01_12_Collections.Task_1.A2;

import java.io.IOException;
import java.util.Set;

/**
 * Created by Ekaterina on 3/2/16.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //Задание getCross and GetUnion
        String [] matrixA={"as","vxc","bh"};
        String [] matrixB={"vxc","dsds","bh","sdsds","45"};
        Integer [] mA={5,6,23,-3,98,3,5,89,45,-4};
        Integer [] mB={23,5,89,55,8,34,5,67};

        System.out.print("A=");
        for (int i=0;i<matrixA.length;i++){
            System.out.print(matrixA[i]+" ");
        }
        System.out.println();
        System.out.print("B=");
        for (int i=0;i<matrixB.length;i++){
            System.out.print(matrixB[i]+" ");
        }
        System.out.println();

        GetCross<String> test=new GetCross<>();
        test.getCrossArrays(matrixA,matrixB);
        GetUnion<String> test2=new GetUnion<>();
        test2.getUnionArrays(matrixA,matrixB);


        System.out.print("A= ");
        for (int i=0;i<mA.length;i++){
            System.out.print(mA[i]+" ");
        }
        System.out.println();
        System.out.print("B= ");
        for (int i=0;i<mB.length;i++){
            System.out.print(mB[i]+" ");
        }
        System.out.println();
        GetCross<Integer> test4=new GetCross<>();
        test4.getCrossArrays(mA,mB);
        GetUnion<Integer> test3=new GetUnion<>();
        test3.getUnionArrays(mA,mB);


        Set<Integer> D=MyCollection.getUnion(mA,mB);
        System.out.println("Объединение множеств A и B = "+D);

    }
}
