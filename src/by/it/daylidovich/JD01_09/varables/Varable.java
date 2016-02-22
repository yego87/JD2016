package by.it.daylidovich.JD01_09.varables;

import by.it.daylidovich.JD01_09.interfaces.IAddation;
import by.it.daylidovich.JD01_09.interfaces.IDivision;
import by.it.daylidovich.JD01_09.interfaces.IMultiplication;
import by.it.daylidovich.JD01_09.interfaces.ISubtraction;

public abstract class Varable implements IAddation, ISubtraction, IMultiplication, IDivision {
    @Override
    public Varable add(Varable varable) {
        System.out.println("Сложение невозможно.");
        return null;
    }

    @Override
    public Varable sub(Varable varable) {
        System.out.println("Вычитание невозможно.");
        return null;
    }

    @Override
    public Varable mult(Varable varable) {
        System.out.println("Умножение невозможно.");
        return null;
    }

    @Override
    public Varable div(Varable varable) {
        System.out.println("Деление невозможно.");
        return null;
    }
}
