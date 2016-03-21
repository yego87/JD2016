package by.it.zebnitskiy.JD_01.JD_01_06.zadanie_A;

/**
 * Найти сколько раза каждое слово повторяется в тексте
 * @author Зебницкий Максим
 *
 */
public class A2 {

    public static void main(String[] args){
        //Получаем строку в которой будем  искать слова
        String afor = Main.Stroka();
        //перебираем все слова и разместим их в массиве.
        //Pattern для таких слов [а-яА-ЯёЁ]{1,}
        //слудовательно разделитель для таких слов, все остальное
        //поэтому достаточно добавить в Pattern разделителя знак ^ - не
        String [] arrstroka = afor.split("[а-яА-ЯёЁ]+");

        for (int i = 0; i < arrstroka.length; i++) {
            if (arrstroka[i].length()>0){
                int count = 1;
                for (int j = i+1; j < arrstroka.length; j++) {
                    if(arrstroka[i].equals(arrstroka[j])){
                        count++;
                        arrstroka[j] = "";
                    }
                }
                System.out.println("Число повторов слова \"" + arrstroka[i] + "\" составляет " + count);
            }
        }

    }

}
