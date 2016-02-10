package by.it.chetovich.JD01_02_04;

/**
 * Created by user_2 on 03.02.2016.
 */
public class TableCount {
    public void printTable(){
        for(int i = 2;i <10;i++){
            for(int j = 2; j < 10; j++){
                if ( i%2 == 0){
                    System.out.print(j+"*"+i+"="+i*j+"\t");
                }
            }
            System.out.println();
        }
    }
}
