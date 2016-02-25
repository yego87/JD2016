package by.it.telushko.jd01_08;

public class NeuroSurgeonAnimal extends NeuroSurgeon {

    public NeuroSurgeonAnimal(String name){
        super(name);
        System.out.println("Создан объект класса Нейрохирург Для Животных: "+name);

    }
    @Override
    public void useKnife(){
        System.out.println("...Воспользовался скальпелем для животного(перекрытый метод)");
    }
}
