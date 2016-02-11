package by.it.telushko.jd01_02;

public class TaskB {
    public static void taskB1(String[] inData){
        // проеобразуем массив строк в массив чисел и выводим его
        int v[] = InOut.strToInt(inData);
        if ((v[0]>=v[1])&&(v[0]<=v[2]))
            System.out.println("значение "+v[0]+" принадлежит интервалу ["+v[1]+","+v[2]+"]");
        else
            System.out.println("значение "+v[0]+" НЕ принадлежит интервалу ["+v[1]+","+v[2]+"]");
    }
    public static void taskB2(int n){
        int size=(int) Math.ceil(Math.sqrt(n));
        System.out.println("массив будет размером: "+size);
        int counter= (int) Math.pow(size,2);
        int j=0;
        for (int i = 0; i <counter; i++) {
            if(i<n){
                System.out.printf("%3d",j+1);
                j++;
            }
            else System.out.printf("%3d",0);
            if (0==(i+1)%size)System.out.println("");
        }
    }
    public static void taskB3(int[] v){
        double D=v[1]*v[1]-(4*v[0]*v[2]);
        if (D<0) System.out.println("уравнение не имеет действительных корней");
        else
            if (0==D){
                double X1= -v[1]/(2*v[0]);
                System.out.println("уравнение имеет один корень X="+X1);
            }
            else{
                double X1=(-v[1]+Math.sqrt(D))/(2*v[0]);
                double X2=(-v[1]-Math.sqrt(D))/(2*v[0]);
                System.out.println("корни уравнения: X1="+X1+", X2="+X2);
            }
    }
    public static String taskB4(int n){
        String month="";
        if ((n>=1)&&(n<=12)){
            switch (n){
                case 1:{month="Январь";break;}
                case 2:{month="Февраль";break;}
                case 3:{month="Март";break;}
                case 4:{month="Апрель";break;}
                case 5:{month="Май";break;}
                case 6:{month="Июнь";break;}
                case 7:{month="Июль";break;}
                case 8:{month="Август";break;}
                case 9:{month="Сентябрь";break;}
                case 10:{month="Октябрь";break;}
                case 11:{month="Ноябрь";break;}
                case 12:{month="Декабрь";break;}
            }
        }
        else month="ошибка ввода";
        return month;
    }
}

