package by.it.zdarskiy.JD01_work;


public class NoteBook {
    public static void main (String [] args){
        int s = 691805;
        int sec = s % 60;
        int m = (s-sec)/60;
        int min = m%60;
        int h = (m-min)/60;
        System.out.println(h+" часов "+min+" минут  "+sec+" секунд");

        int d = h/24;//задание 3
        int day = d%7;
        int w = (d-day)/7;
        System.out.println(w+" недель "+ day +" дней ");
        int x = 44; //задание 4
        if (x%10 == 7){
            System.out.println("Число "+x+" заканчивается на 7");
        }
        else {System.out.println("Число "+x+" не заканчивается на 7");}
        int a = 9;//задание 5
        int b = 5;
        int r = 3;
        if (Math.sqrt(a*a + b*b)<=r*r ){
            System.out.println("Закроет полностью");
        }
        else {System.out.println("Не закроет");}
        int mon = 49;//задание 6
        if (mon%10 == 1){
            System.out.println(mon+" рубль");}
        else if (mon%10 == 2){System.out.println(mon+" рубля");}
        else if (mon%10 == 3) {System.out.println(mon+" рубля");}
        else if (mon%10 == 4){System.out.println(mon+" рубля");}
        else if (mon%10 == 5){System.out.println(mon+" рублей");}
        else if (mon%10 == 6){System.out.println(mon+" рублей");}
        else if (mon%10 == 7) {System.out.println(mon+" рублей");}
        else if (mon%10 == 8) {System.out.println(mon+" рублей");}
        else if (mon%10 == 9) {System.out.println(mon+" рублей");}
        else if (mon%10 == 0) {System.out.println(mon+" рублей");}

        int days = 6;//задание 7
        int mounth = 5;
        int year = 2016;
        int next = days+1;
        System.out.println(next+"."+mounth+"."+year);

        int proiz = 1;//задание 8
        for (int q = 2; q<=10; q++)
            proiz *=q;
        System.out.println(proiz);

        int rand [] = new int [20];//задание 9
        for (int i = 0; i<20; i++){
            rand [i] = (int)(Math.random()*20);}
        int maxrand = rand [0];
        for (int z = 0; z< rand.length; z++ ){
            if (maxrand < rand[z])
                maxrand = rand [z];}

        System.out.println(maxrand+ " Имеет большее значение)");

        int cch = 6;// задание 10
        int i;
        boolean hard = false;
        for (i = 2; i < cch; i++) {
            if (cch % i == 0) {
                hard = true;
                break;
            }
        }
        if (hard) {
            System.out.println("число "+cch  +" составное ");
        } else {
            System.out.println("число "+cch  +" простое ");
        }
        double xx;//задание 11
        double yy;
        for (xx = -2; xx<=2; xx+=0.2){
            yy = 1/x;
            if (xx == 0){break;}
            System.out.print("x = "+xx+" y = "+yy+ "\n");
        }
        int[] marks = new int[3];//задание 12
        marks[0]=4;
        marks[1]=7;
        marks[2]=8;
        int maxMark = marks[0];
        int maxK = marks[0];

        for (int k=0; k<marks.length;k++ ){
            if (maxMark<marks[k]) {
                maxMark = marks[k];
                maxK = k;
            }
        }
        System.out.print(maxMark);
        System.out.println(" number "+maxK);

        int [] mass = new int[5];//задание 13
        for (int n=0; n<5;n++){
            mass[n]=(int)(Math.random()*10+1);
            System.out.println(mass[n]);}
        for (i=0;i<mass.length;i++){
            x=mass[mass.length-1-i];
            mass[mass.length-1-i]=x;
            System.out.println(mass[mass.length-1-i]);
        }
        int arr[][]={
                {1,1,1,1,1}, //задание 14
                {0,1,1,1,0},
                {0,0,1,0,0},
                {0,1,1,1,0},
                {1,1,1,1,1}
        };
        for (int v = 0; v < 5; v++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[v][j] + "\t");
            }
            System.out.println();
        }
    }
}
