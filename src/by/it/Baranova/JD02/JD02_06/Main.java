package by.it.Baranova.JD02.JD02_06;


public class Main {
    public static void main (String[] args){
        Log log=Log.getInstance();
        String error="Ошибка файла";
        log.saveLog(error);

        error="Деление на 0";
        log.saveLog(error);

        error="Выход за пределы массива";
        log.saveLog(error);


    }
}
