package by.it.predkel.JD0206GOF;

/**
 * Created by user_2 on 21.03.2016.
 */
public class MySingleton {
    private static MySingleton instance;

    private MySingleton(){
    }

    public static MySingleton getInstance(){
        if (instance==null){
            instance=new MySingleton();
        }
        return instance;
    }

    public static void writeLog(){

    }
}
