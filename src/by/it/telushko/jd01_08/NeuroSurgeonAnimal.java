package by.it.telushko.jd01_08;

public class NeuroSurgeonAnimal extends NeuroSurgeon {

    public NeuroSurgeonAnimal (String name){// конструктор потомка вызывает конструктор родителя
        super(name);
        System.out.println("Создан объект класса Нейрохирург-ветеринар: "+name);
    }
}
