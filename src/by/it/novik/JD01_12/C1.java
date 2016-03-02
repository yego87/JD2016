package by.it.novik.JD01_12;




import java.util.*;

public class C1 {
    public static void main(String[] args) {

        String[] names = "apple, juice, jam, pie, water, juice, ananas, cake, tea, coffee, bread, water".replace(",", "").split(" ");

        /*List<String> instance = Arrays.asList(names);

        ArrayList<String> arr = new ArrayList<String>(instance);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("");

        TreeSet<String> treeSet = new TreeSet<>(arr);
        Iterator<String> i=treeSet.iterator();
        while (i.hasNext()) {
            String s=i.next();
            System.out.println(s);
        }*/

        Map<Integer,String> hashMap= new HashMap<Integer,String>();

        for (int k = 1; k < names.length; k++) {
                hashMap.put(k, names[k]);

        }
        System.out.println(hashMap);



        Set<Integer> sd=new HashSet<>();
        Iterator iter = hashMap.keySet().iterator();
            while(iter.hasNext()) {
                //Object o=iter.next();
                Integer i=(Integer)iter.next();
                String s=hashMap.get(i);


                Iterator iter2 = hashMap.keySet().iterator();
                while(iter2.hasNext()) {
                    //Object o=iter.next();
                    Integer i2 = (Integer) iter2.next();
                    String s2 = hashMap.get(i2);


                    if ((i!=i2) && (s.equals(s2))){
                      sd.add(i2);
                    }
                }

            }
        Iterator<Integer> i=sd.iterator();
        while (i.hasNext()) hashMap.remove(i.next());

        System.out.println(hashMap);
    }
}
