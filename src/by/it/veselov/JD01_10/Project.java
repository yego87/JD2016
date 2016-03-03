package by.it.veselov.JD01_10;

/**
 * Created by yegorveselov on 03.03.16.
 */
public class Project {
    public static void main(String[] args){

        Variable one=new Variable("2.2");
        Variable two=new Variable("3.3");
        Variable res=one.add(two);
        System.out.println(one+"+"+two+"="+res);
    }
}
