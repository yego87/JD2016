package by.it.telushko.jd02_06;

public class Run {
    public static void main(String[] args){
        Log log =new Log().getInstance();
        Log log2 =new Log().getInstance();

        try {int b = 1 / 0;}
        catch (ArithmeticException e){
            System.out.println("Деление на  ноль: "+e);
            log.getInstance().entry("Деление на ноль: "+e);
        }

        try{
            int[] array = new int[3];
            for (int i = 0; i <6 ; i++) {
                array[i]=1;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+": Слишком много элементов");
            log.getInstance().entry(e+": Слишком много элементов");
        }
        log.getInstance().close();
    }
}
