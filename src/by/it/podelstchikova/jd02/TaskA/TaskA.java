package by.it.podelstchikova.jd02.TaskA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA {

  public static String scanLine() throws IOException {
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
      String rLine = bufferedReader.readLine();
      bufferedReader.close();
      return rLine;
  }

    public static String[] masString(String str)
    {
        String[] val = str.split(" ");
        return val;
    }

    public static  void printMasLine(String[] val)
    {
        for (String v:val)
        {
            System.out.println(v);
        }
    }

    public  static  void maxMin(String[] val)
    {
        String max=val[0],min=val[0];


        for (int i = 0; i < val.length; i++)
        {

            if (val[i].length()>max.length()) max=val[i];
            if (val[i].length()<min.length()) min = val[i];
        }
        System.out.println("max Длина: \t"+max.length()+"\tЧисло:\t"+max);
        System.out.println("min Длина: \t"+min.length()+"\tЧисло:\t"+min);

    }
    public static void halfVal(String[] str)
    {
        int count=0;
        for (int i = 0; i < str.length; i++) {
            count+=str[i].length();

        }
        count/=str.length;


        for (int i = 0; i < str.length; i++)
        {
            if (count<str[i].length()) System.out.println("Длина: \t"+str[i].length()+"\tЧисло:\t"+str[i]);
        }

        for (int i = 0; i < str.length; i++)
        {
            if (count>str[i].length()) System.out.println("Длина: \t"+str[i].length()+"\tЧисло:\t"+str[i]);
        }


    }
    public static void noRepeat(String[] str)
    {
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
    }

    public static void polindrom(String[] str)
    {
        char [] simv;

        boolean truefalse=true;
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
