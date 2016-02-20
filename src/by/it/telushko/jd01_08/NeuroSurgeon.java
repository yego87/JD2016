package by.it.telushko.jd01_08;


public class NeuroSurgeon extends Surgeon {
    private String doctorName;

    public NeuroSurgeon(String name){
        this.doctorName=name;
        System.out.println("Создан объект класса Нейрохирург: "+doctorName);
    }
    //собственные методы
    public void disconnectNeurons(){
        System.out.println("Нейроны рассоединены...(собственный метод)");
    }
    public void connectNeurons(int num){

        System.out.println("...Нейроны соединены в количестве "+num+" штук (собственный метод, статический полиморфизм)");
    }
    public void connectNeurons(String list){
        System.out.println("...Нейроны соединены в порядке " +list +" (собственный метод, статический полиморфизм)");
    }
    // метож написанный по требованию из абстрактного класса
    @Override
    public void useKnife() {
        System.out.println("...Воспользовался скальпелем (дописанный метод из aбстрактного класса)");
    }

}
