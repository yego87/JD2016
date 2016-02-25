package by.it.telushko.jd01_08;

public class Main {
    public static void main(String[] args){
        NeuroSurgeon vasiliy = new NeuroSurgeon("Василий");
        vasiliy.getPayment(true);
        vasiliy.useKnife();

        //пример для статического полиморфизма
        vasiliy.connectNeurons(10);
        vasiliy.connectNeurons("1 4 9 6 8");

        //пример для динамического полиморфизма
        //созданы объекты абстрактного  класса Surgeon, но с конструкторами разных наследуемых классов
        Surgeon andrey =new NeuroSurgeon("Андрей");
        Surgeon nikolay = new NeuroSurgeonAnimal("Николай");
        // в каждом экземпляре выполняется метод, который Перекрыт в соответствующему экземпляру классе
        andrey.useKnife(); //метод useKnife по-разному реализован в классах NeuroSurgeon и NeuroSurgeonAnimal
        nikolay.useKnife();
    }
}
