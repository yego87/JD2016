package by.it.telushko.jd01_02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InOut {

    public static String[] consoleReadLine() throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String rLine = bufferedReader.readLine();
        String[] val;
        val=rLine.split(" ");
        return val;
    }
    public static String consoleLineInput() {
        Scanner inLine = new Scanner(System.in);
        String a = inLine.nextLine();//строку(букву), соответствующую заданию
        return a;
    }
    public static char consoleCharInput(){
        Scanner inLine = new Scanner(System.in);
        String a = inLine.nextLine();//строку(букву), соответствующую заданию
       char leter=a.charAt(0);
        return leter;
    }
    public static int consoleIntInput() {
        Scanner inStr = new Scanner(System.in);
        int b = inStr.nextInt();//считываем число, соответствующее заданию
        return b;
    }
    public static double consoleDoubleInput() {
        Scanner inStr = new Scanner(System.in);
        double b = inStr.nextDouble();//считываем число, соответствующее заданию
        return b;
    }
    public static int[] strToInt(String[] val){
        int[] v = new int[val.length];
        int i=0;
        for(String s:val){
            v[i]=Integer.valueOf(s);
            i++;
        }
        return v;
    }
    public static void printMatrix(int[][] matrix, int size){
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {

                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void printMatrix(int[][] matrix, int sizeI,int sizeJ){
        for (int i = 0; i <sizeI ; i++) {
            for (int j = 0; j <sizeJ ; j++) {
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static void printMatrixFormatted(double[]matrix,String name){
        System.out.println("Индекс  Значение");
        for (int i = 0; i <matrix.length ; i++) {
            System.out.printf(name+"[%2d]=% 7.2f\n",i,matrix[i]);
        }
    }
    public static void printArrayPseudo(double array[],String name,int row) {
        //вычислим количество солбцов при заданном количестве строк
        double t = (double) array.length / row;
        int col = (int) Math.ceil(t);

        //формируем горизонтальные линии
        String upLine="╔";
        String floor="╠";
        String bottom="╚";
        for (int i = 0; i <col; i++) {
            if (((i+1)%col==0)&&(i!=0)) {
                upLine = upLine + "═══════╗"; //шапка таблицы
                floor+=           "═══════╣"; //"пол" для напечатанной строки
                bottom+=          "═══════╝"; //"дно" тблицы
            }
            else {
                upLine +=         "═══════╦";
                floor+=           "═══════╬";
                bottom+=          "═══════╩";
            }
        }
        System.out.println(upLine);

        //после шапки печатаем левую стенку для первой строки
        System.out.print("║");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3s[%-2d]=%4.1f",name,i,array[i]);
            System.out.print("\u2551");
            if (((i+1) % col == 0)&&(i!=0)&&(i!=array.length-1)){

                System.out.print("\n"+floor+"\n");
               //при переносе строки печатаем 'пол' для напечатанной ранее строки
            System.out.print("║");
            }
        }
        //рассчитаем и напечатаем заглушку
        // (для случая если последняя строка таблицы не заполняется до конца)
        if((array.length%col)!=0) {
            String rest="";
            int restCount=col-(array.length%col);
            for (int j = 0; j <restCount ; j++) {
                rest+="            ║";
            }
            System.out.println(rest);
        }
        else System.out.println("");//если заглушка не нужна, идем на новую строку и печтаем "дно"
        System.out.println(bottom);


    }
}




