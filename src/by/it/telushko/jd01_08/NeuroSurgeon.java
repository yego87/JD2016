package by.it.telushko.jd01_08;


public class NeuroSurgeon extends Surgeon {
   //Переменная
    private String doctorName;
   //Конструктор
    public NeuroSurgeon(String name){
        this.doctorName=name;
        System.out.println("Создан объект класса Нейрохирург: "+doctorName);
    }
    //Собственные методы
    public void connectNeurons(int num){
        System.out.println();
        System.out.println("...Нейроны соединены в количестве "+num+" штук (собственный метод, статический полиморфизм)");
    }
    public void connectNeurons(String list){
        System.out.println("...Нейроны соединены в порядке " +list +" (собственный метод, статический полиморфизм)");
    }
    // метд написанный по требованию из абстрактного класса
    @Override
    public void useKnife() {
        System.out.println(super.getTreatment("Ангина")); // получим доступ к полю treatment из родительского класса
        System.out.println("...Воспользовался скальпелем (дописанный метод из aбстрактного класса)");
    }

}
