package by.it.podelstchikova.jd05;

public class Task5 {
public static void printValue()
{ double p=-2,y=0,z=0, r=0.491*Math.pow(10,4);

    System.out.println(" p" + "\t\t"+ "y");
    for (int i = 0; p <= 15; i++) {
        if (p-1<0) z=p-3.18*Math.cos(p+1);
        else if (p-1>=0 && p-1<3) z=Math.pow(p,3)-Math.tan(p);
        else z=Math.pow((p+Math.sin(Math.PI/6)),5);
        System.out.printf("%2.2f \t %5.4f \n",p,Math.sqrt(Math.abs(z-2.56*r)));
        p+=1.5;
    }
}
}
