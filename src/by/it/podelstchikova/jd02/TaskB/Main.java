package by.it.podelstchikova.jd02.TaskB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException
    {
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("начало: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Конец: ");
        int m = Integer.parseInt(bufferedReader.readLine());
        System.out.println("число: ");
        int k = Integer.parseInt(bufferedReader.readLine());


        if ((k>n)&&(k<m)) System.out.println("Принадлежит");
        else System.out.println("не Принадлежит");

        int z=0;
        System.out.println("(Task2)K = ");
        int kon = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Размерность:");
        int matrixN = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < matrixN; i++)
        {
            for (int j = 0; j < matrixN; j++) {
                System.out.print(++z+"\t");
                if (z>=kon) break;
            }
            if (z>=kon) break;
            System.out.println();
        }
        System.out.println("(Task3) A=");
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.println(" B=");
        int b = Integer.parseInt(bufferedReader.readLine());
        System.out.println("C=");
        int c = Integer.parseInt(bufferedReader.readLine());
        int de = b*b-4*a*c;
        double x1 = b/(2*a)+Math.sqrt(de)/2/a;
        double x2 = -b/(2*a)+Math.sqrt(de)/2/a;
        System.out.println("x1 = "+x1+" x2 = "+x2);

        System.out.println("Число:");
        int month=-1;
        while (month<0 || month>12)
            month = Integer.parseInt(bufferedReader.readLine());

        switch (month) {
            case 1:{System.out.println("январь");break; }
            case 2:{System.out.println("февраль");break; }
            case 3:{System.out.println("март");break; }
            case 4:{System.out.println("апрель");break; }
            case 5:{System.out.println("май");break; }
            case 6:{System.out.println("июнь");break; }
            case 7:{System.out.println("июль");break; }
            case 8:{System.out.println("август");break; }
            case 9:{System.out.println("сентябрь");break; }
            case 10:{System.out.println("октябрь");break; }
            case 11:{System.out.println("ноябрь");break; }
            case 12:{System.out.println("декабрь");break; }

    }



        bufferedReader.close();


    }
}
