package by.it.daylidovich.JD01_02.B.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {
    double a,b,c;
    public void ReadIndex() throws IOException {
        System.out.println("������� ���������� A:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = reader.readLine();
        a = Double.parseDouble(rLine);
        System.out.println("������� ���������� B:");
        rLine = reader.readLine();
        b = Double.parseDouble(rLine);
        System.out.println("������� ���������� C:");
        rLine = reader.readLine();
        c = Double.parseDouble(rLine);
    }

    public void SolutionEquation(){
        if(0>b*b-4*a*c)
            System.out.println("������� ���.");
        else
            if(0==b*b-4*a*c){
                System.out.println("������ ���������:"+((-b+Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
            }
        else{
                System.out.println("������ ������ ���������:"+((-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)));
                System.out.println("������ ������ ���������:"+((-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)));
            }
    }
}
