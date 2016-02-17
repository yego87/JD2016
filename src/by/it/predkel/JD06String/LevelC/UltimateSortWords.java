package by.it.predkel.JD06String.LevelC;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * сортировать слова в порядке возрастания длины, если длина одинаковая в порядке возрастания количества
 * гласных, если есть одинаковые слова вывести один раз с количеством одинаковых
 */
public class UltimateSortWords {
    public static void Sortinglenght(String str){
        String[] sa = str.trim().split("\\s+");
        String[] s=new String[sa.length];
        int o=0;
        Pattern pat = Pattern.compile("[а-яА-ЯёЁ]+");
        Matcher mat = pat.matcher(str);
        while (mat.find()){
            s[o]=mat.group();
            o++;
        }
        int[] vhojdeniya=new int[s.length];
        for (int i=0;i<sa.length;i++){
            Pattern pat1 = Pattern.compile("[ёуеэоаыяию]");
            Matcher mat1 = pat.matcher(s[i]);
            while (mat.find()){
                vhojdeniya[i]++;
            }
        }

        for (int i=0;i<sa.length-1;i++){
            for (int j=i+1;j<sa.length;j++){

                if (s[i].length()>s[j].length()){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
                //int comparison = s[i].toLowerCase().compareTo(s[j].toLowerCase());
                if ((s[i].length()==s[j].length())&&(vhojdeniya[i]>vhojdeniya[j])){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        ArrayList<String> list1 = new ArrayList<String>();
        int[] counter=new int[sa.length];
        boolean check = true;
        for (int i=0;i<sa.length;i++) {
            if (list1.isEmpty()) {
                list1.add(s[i]);
            } else {

                for (int j=0;j<list1.size(); j++) {
                    if (list1.get(j).equals(s[i])) {
                        counter[j]++;
                        check = false;
                    }
                }
                if (check) list1.add(s[i]);
            }
        }
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
            if (counter[i]>0)
                System.out.print("("+(counter[i]+1)+")");


        }
       /* String[] newmass=new String[];
        for (int i=0;i<sa.length-1;i++){
            int counter=1;//kolichestvo odinakovih slov
            for (int j=i+1;j<sa.length;j++){
                if (s[i].equals(s[j])){
                    s[j]=null;
                    counter++;
                }
            }
            if (counter>1)
            s[i]=s[i]+counter;
        }
       /* for (int i=0;i<sa.length-1;i++){
            Pattern pat1 = Pattern.compile(s[i]);
            int counter=1;//kolichestvo odinakovih slov
            for (int j=i+1;j<sa.length;j++) {
                Matcher mat1 = pat1.matcher(s[j]);
                while (mat.find()){
                    counter++;
                }
            }
            if (counter>1)
                s[i]=s[i]+counter;
        }*/
      //  System.out.println();
       // for (String word:s) {
        //    System.out.print(word+" ");
        //}
    }
}
