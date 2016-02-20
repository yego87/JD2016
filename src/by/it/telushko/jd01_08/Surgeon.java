package by.it.telushko.jd01_08;

public abstract class Surgeon implements IDoctor {
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
    public String setTreatment(String Desease) {
        String treatment="\"Назначенное лечение\"";
        return treatment;
    }

    @Override
    public void fillForms() {
        System.out.println("...Все докуметы заполнены");
    }
    public abstract  void useKnife(); //декларируем абстрактный метод для дальнейшей реализации
}
