package by.it.telushko.jd01_08;

public abstract class Surgeon implements IDoctor {
    private String treatment="\"Назначенное лечение\" ";

    //выполняем методы по требованию интерфейса
    @Override
    public int getPayment(boolean economicSituation) {
        int money=0;
        if(economicSituation)
            money = 100;
        else
            money =24;
            System.out.println("зарплата = "+money);
        return money;
    }
    @Override
    public String getTreatment(String desease) {

        treatment=this.treatment+" Против"+desease;

        return treatment;
    }
    //декларируем абстрактный метод для дальнейшей реализации
    public abstract  void useKnife(int height) throws KnifeLengthException;
}
