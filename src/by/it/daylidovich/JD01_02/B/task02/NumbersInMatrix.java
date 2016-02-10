package by.it.daylidovich.JD01_02.B.task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersInMatrix {
    int K;
    public void ReadK() throws IOException {
        System.out.print("Введите значение K:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rLine = bufferedReader.readLine();
        K = Integer.parseInt(rLine);
        bufferedReader.close();
    }

    public void ToMatrix(){
        int n = (int) Math.sqrt(K);
        if(n*n!=K)
            n++;
        int k = 0;
        boolean isReady = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(k + "\t");
                k++;
                if(k==K) {
                    isReady = true;
                    break;
                }
            }
            System.out.println();
            if (isReady)
                break;
        }
    }
}
