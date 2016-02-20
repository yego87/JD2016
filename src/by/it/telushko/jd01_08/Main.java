package by.it.telushko.jd01_08;

public class Main {
    public static void main(String[] args){
        NeuroSurgeon vasiliy = new NeuroSurgeon("Василий");
        vasiliy.getPayment(true);
        vasiliy.disconnectNeurons();
        vasiliy.useKnife();
        vasiliy.connectNeurons(10);
        vasiliy.connectNeurons("1 4 9 6 8");
        NeuroSurgeonAnimal vitaliy = new NeuroSurgeonAnimal("Виталий");
    }
}
