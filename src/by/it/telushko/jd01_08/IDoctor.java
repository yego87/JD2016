package by.it.telushko.jd01_08;

public interface IDoctor {
    //методы
    void fillForms();                            //Заполнять документы
    int getPayment(boolean economicSituation);   //Назначить зарплату
    String setTreatment(String desease);         //Назначить лечение

}
