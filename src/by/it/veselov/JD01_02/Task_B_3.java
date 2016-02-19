package by.it.veselov.JD01_02.Task_1_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yegorveselov on 18.02.16.
 */
public class Task_B_3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String sa = bufferedReader.readLine();
        String [] d=sa.split(" ");
        int a=Integer.valueOf(d[0]);
        int b=Integer.valueOf(d[1]);
        int c=Integer.valueOf(d[2]);
        bufferedReader.close();

        double d1 = (b*b)-(4*a*c);
        float e;
            float f;
            if(d1==0){
                e=-1*(b/(2*a));
                System.out.println("Уравнеие имеет 1 квадратный корень:"+e);
            }
            else {
                if(d1>0){
                    e=((-1*b)+(float)Math.sqrt(d1))/(2*a);
                    f=((-1*b)-(float)Math.sqrt(d1))/(2*a);
                    System.out.println("Уравнение имеет 2 квадратных корня: "+e+" и " +f);
                }
                else {
                    System.out.println("Уравнение не имеет квадратных корней");
                }
            }
        }
    }
