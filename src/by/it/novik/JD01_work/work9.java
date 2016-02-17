package by.it.novik.JD01_work;

import java.util.ArrayList;
import java.util.Collections;

public class work9 {
    public static void main(String[] args) {
        ArrayList storage = new ArrayList();
        int x = randomInt();

        while (x != 0) {
            storage.add(x);

            x = randomInt();
        }

        System.out.println("Max num was " + Collections.max(storage));
    }

    public static int randomInt() {
        return (int)(Math.random() * 20);
    }
}
