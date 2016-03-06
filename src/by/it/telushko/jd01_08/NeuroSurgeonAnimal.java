package by.it.telushko.jd01_08;

public class NeuroSurgeonAnimal extends NeuroSurgeon {

    public NeuroSurgeonAnimal(String name){
        super(name);
        System.out.println("Создан объект класса Нейрохирург Для Животных: "+name);

    }
    // собственное исклюючение будет контролировать ,
    // не отрицательный ли параметр "Высота животного"
    @Override
    public void useKnife(int length) throws KnifeLengthException {
        if(length<=0) {throw new KnifeLengthException("Длина скальпеля не может быть отрицательной");}
        System.out.println("...Воспользовался скальпелем для животного длиной "+length +"(перекрытый метод)");
    }
}
