package by.it.lukin.jd12.B;

import java.util.*;

public class Circle {
    public static void main(String[] args){
        Timer t = new Timer();
        ArrayList<Integer> circleArray = new ArrayList<>();
        LinkedList<Integer> circleLinked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("n = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            circleArray.add(i+1);
            circleLinked.add(i+1);
        }
        processArray(circleArray);
        processLinked(circleLinked);
        System.out.println("Метод processArray. " + t + circleArray);
        System.out.println("Метод processLinked. " + t + circleLinked);
    }

    private static void removeEachSecond(List<Integer> list){
        boolean isDeleted = false;
        while(list.size() != 1)
        {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext())
            {
                iterator.next();
                if (isDeleted)
                {
                    iterator.remove();
                }
                isDeleted = !isDeleted;
            }
        }
    }

    public static void processArray(ArrayList<Integer> circleArray){
        removeEachSecond(circleArray);
    }

    public static void processLinked(LinkedList<Integer> circleLinked){
        removeEachSecond(circleLinked);
    }

    public static class Timer{
        private  long iniTime;
        private  Double Delta;
        public Timer(){
            iniTime=System.nanoTime();
        }
        public  String toString(){
            Delta=(double)(System.nanoTime()-iniTime)/1000;
            iniTime=System.nanoTime();
            return "Прошло "+Delta.toString()+" микросекунд.";
        }
    }
}
