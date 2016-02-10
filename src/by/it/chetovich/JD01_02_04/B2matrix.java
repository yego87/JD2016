package by.it.chetovich.JD01_02_04;

/**
 * Created by Yultos_ on 03.02.2016.
 */
public class B2matrix {
    public void createMatrix (int k, int n)
    {
        int list = 1;
        while (list<=k) {
            for (int i = 0; i < n; i++) {
                if (list<=k) {
                    System.out.print(list + "\t");
                    list++;
                }
            }
            System.out.println();
        }
    }
}
