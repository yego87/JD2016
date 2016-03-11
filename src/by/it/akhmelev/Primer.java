package by.it.akhmelev;

public class Primer {
    public static void main(String[ ] args) {

        //тест комментария
        String c="//комментарий 1 \n"+
                "//комментарий 2 \n"+
                "public static void main(String[ ] args) {\n"+
                "}\n"+
                "//комментарий 3 \n"+
                "/* а это конец */ \n";
        c=c.replaceAll("(//.*\\n)|(/[*].*[*]/)","");
        System.out.print(c);
        System.exit(0);

        //Перебрать все слова из строки через split
        String stroka="Раз, два, три, четыре, пять - вышел зайчик погулять!";
        //Самое простое. Получим массив слов, разделенных пробелом.
        String[] masWords=stroka.split(" ");
        System.out.println("Массив masWords");
        for (String oneWord:masWords)
            System.out.print("["+oneWord+"]");
        System.out.println("");

        //Чуть сложнее. Получим массив слов, разделенных чем-то кроме букв.
        //так мы избавимся от запятых, пробелов и прочего
        String[] okWords=stroka.split("[^а-яА-ЯёЁ]+");  //тут знак^ это значит что ищем
                                                    // в качестве разделителя НЕ буквы,
                                                    // а + что таких символов один или больше
        System.out.println("\nМассив okWords");
        for (String okWord:okWords)
            System.out.print("["+okWord+"]");
        System.out.println("");

        //разберем стоку вообще на отдельные символы, и выведем каждый с пробелом
        char[] masChar=stroka.toCharArray();
        System.out.println("\nМассив masChar");
        for (char ch:masChar)
            System.out.print(ch+" ");
        System.out.println("");

        //сортировка.
        //это индексы массива 0 1 2 3 4 5 6 7
        int[] m=             {6,5,1,1,8,9,9,2}; //это сам массив
        for (int i = 0; i < m.length-2; i++) {   //меняем i от 0 до 6
            for (int j = m.length - 1; j > i; j--) { //меняем j от 7 до i+1, т.е. до 1, потом до 2, и т.д.
                if (m[j - 1] > m[j]) { //если элементы расположены не по возрастанию
                    int tmp = m[j];  //то поменяем их местами
                    m[j] = m[j - 1];   //через вспомогательную
                    m[j - 1] = tmp;    //переменную tmp
                } //конец if
            } //конец цикла по j
        } //конец цикла по i
        //сортировка готова, выводим отсортированный массив
        System.out.println("\nОтсортированный массив m");
        for (int val:m)
            System.out.print("["+val+"]");
        System.out.println("");

        //Сортировка строк полностью точно так же,
        //но только в if будет условие (s[j-1].compareTo(s[j]))


    }

}
