package by.it.knyazev.MathLab;

/**
 * Created by Mac on 04.03.16.
 */
public class BracketsType {

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
