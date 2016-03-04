package by.it.knyazev.MathLab;

import java.util.List;

/**
 * Created by Mac on 04.03.16.
 */
public class Count{

    public double count(List<String> list){
        double z = 0;
        String f;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size(); i++) {
                if (i == list.indexOf("/")) {
                    z = Double.parseDouble(list.get(i - 1)) / Double.parseDouble(list.get(i + 1));
                    remove(i, list);
                    list.add(i - 1, f = String.valueOf(z));
                }
                if (i == list.indexOf("*")) {
                    z = Double.parseDouble(list.get(i - 1)) * Double.parseDouble(list.get(i + 1));
                    remove(i, list);
                    list.add(i - 1, f = String.valueOf(z));
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == list.indexOf("+")) {
                    z = Double.parseDouble(list.get(i - 1)) + Double.parseDouble(list.get(i + 1));
                    remove(i, list);
                    list.add(i - 1, f = String.valueOf(z));
                }
                if (i == list.indexOf("-")) {
                    z = Double.parseDouble(list.get(i - 1)) - Double.parseDouble(list.get(i + 1));
                    remove(i, list);
                    list.add(i - 1, f = String.valueOf(z));
                }
            }

        }
        return z;
    }
    public void remove(int i,List<String> list){
        list.remove(i + 1);
        list.remove(i);
        list.remove(i - 1);
    }
}
