package by.it.daylidovich.JD01_05_v8.C.task07;

public class Main {
    public static void main(String[] args){
        double[] M = Utils.CreateArray();
        Utils.PrintArray(M,"M");
        double[] K = Utils.ArrayK(M);
        Utils.PrintArray(K,"K");
        Utils.PrintHorizontal(M, "M");
        Utils.PrintVertical(K,"K");
    }
}
