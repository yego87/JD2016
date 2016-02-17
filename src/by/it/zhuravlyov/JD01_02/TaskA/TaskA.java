package by.it.zhuravlyov.JD01_02.TaskA;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA {

    private  String rLine="";
    private String[] val;
    private String max,min;
    private int count;
    private boolean truefalse=true;

    public TaskA() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        this.rLine = bufferedReader.readLine();
        bufferedReader.close();
        this.val = rLine.split(" ");
    }

    public void printLine()
    {
        for (String v:this.val)
        {

            System.out.println(v);

        }
    }

    public  void maxmin()
    {
        for (int i = 0; i < this.val.length; i++)
        {

            if (this.val[i].length()>this.max.length()) this.max=this.val[i];
            if (this.val[i].length()<min.length()) this.min = this.val[i];
            this.count+=this.val[i].length();
        }
        System.out.println("max Длина: \t"+ this.max.length()+"\tЧисло:\t"+this.max);
        System.out.println("min Длина: \t"+ this.min.length()+"\tЧисло:\t"+this.min);
    }

    public  void sredZnach()
    {

    }

}
