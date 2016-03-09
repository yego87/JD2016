package by.it.knyazev.JD01.MathLab;

import by.it.knyazev.JD01.MathLab.Interfaces.IBracketsType;

public class BracketsType implements IBracketsType {

    public Brackets brackets = new Brackets();

    public int bracketsType(String line){ // Проверка на скобки и выполнение операций взависимости от их наличия
        int i = 0;
        if (brackets.bracketsRound(line) && !brackets.bracketsSquare(line)){ // если { } - вектор
            i = 1;
        }
        if (!brackets.bracketsRound(line) && brackets.bracketsSquare(line)){ // если [ ] - матрица
            i = 2;
        }
        if (brackets.bracketsRound(line) && brackets.bracketsSquare(line)){ // если {} и []
            i = 3;
        }
        if (!brackets.bracketsRound(line) && !brackets.bracketsSquare(line)){ // если отсутствуют
            i = 0;
        }
        return i;
    }
}
