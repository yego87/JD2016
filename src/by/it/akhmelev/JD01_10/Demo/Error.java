package by.it.akhmelev.JD01_10.Demo;

public class Error {  //должен наследоваться extends Exception
                      //но материала пока не было (но будет позднее)
                      public Error(String hint){
        System.out.println("ERR:"+hint);
    }
}
