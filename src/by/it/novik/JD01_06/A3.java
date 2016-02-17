package by.it.novik.JD01_06;

public class A3 {
    public static void main(String[] args) {



        String[] arrWords = TextA.example.split("[.;:,?]*\\s+");//паттерн, кот уберет знаки и пробелы после них

        int count = 0;//для сбора количества слов, которые будем инкрементировать
        for (int i = 0; i<arrWords.length;i++) {

            String word = arrWords[i].toLowerCase();
                char chFirst=word.charAt(0);
                char chLast=word.charAt(word.length()-1);

        if (0 <= "аеёиоуыэюя".indexOf(chFirst) && 0 <= "аеёиоуыэюя".indexOf(chLast) )
            {
            System.out.println(word);
                count ++;//а тут в него записывается количество найденных слов
            }
        }
        System.out.println("Мы насчитали " + count + " слов." + "\n" + "Поздравляю!");
    }
}