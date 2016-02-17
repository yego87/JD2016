package by.it.zhuravlyov.JD01_02.TaskA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] str = rLine.split(" ");

        for (String v:str)
        {

            System.out.println(v);

        }
        String max=str[0],min=str[0];
        int count=0;

        for (int i = 0; i < str.length; i++)
        {

            if (str[i].length()>max.length()) max=str[i];
            if (str[i].length()<min.length()) min = str[i];
            count+=str[i].length();
        }
        System.out.println("max Длина: \t"+max.length()+"\tЧисло:\t"+max);
        System.out.println("min Длина: \t"+min.length()+"\tЧисло:\t"+min);

        count/=str.length;


        for (int i = 0; i < str.length; i++)
        {
            if (count<str[i].length()) System.out.println("Длина: \t"+str[i].length()+"\tЧисло:\t"+str[i]);
        }

        for (int i = 0; i < str.length; i++)
        {
            if (count>str[i].length()) System.out.println("Длина: \t"+str[i].length()+"\tЧисло:\t"+str[i]);
        }

        char [] simv;
        boolean truefalse=true;
        for (int i=0; i< str.length; i++)
        { simv = str[i].toCharArray();
            truefalse=true;
            for (int j = 0; j < str[i].length(); j++)
            {
                for (int k = j+1; k <str[i].length(); k++)
                {
                if (simv[j]==simv[k]){ truefalse=false; break; }

                }
            }
            if (truefalse==true) System.out.println("не повторяются символы:\t"+str[i]);
        }

        for (int i = 0; i <str.length; i++)
        { simv = str[i].toCharArray();
            truefalse=true;
            int t=str[i].length()/2;
            for (int j=0,k=str[i].length()-1;j<t;j++, k--)
            {if (simv[j] != simv[k]) {
                truefalse = false;
                break;
            }
            }
            if (truefalse==true) System.out.println("Полиндром:\t"+str[i]);
        }

    }
}
