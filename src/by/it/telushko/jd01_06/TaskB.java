package by.it.telushko.jd01_06;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB {
    public static void taskB1(String text){

        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[;,.: \\s][йцкнгшщзхъфвпрлджчсмтьб][а-яА-Я]{4}[;,: .\\s]");
        Matcher okWord=word.matcher(sbText);
        int count=0;
        while(okWord.find()) {
            count++;
        }
        System.out.println("Задача В-1. Удалены слова длиной 5 букв, начинающиеся на согласную\n");
        int[] delIndex=new int[count];
        count=0;
        okWord=word.matcher(sbText);
        while(okWord.find()){
            delIndex[count]=okWord.start();
            count++;
        }
        for (int i = delIndex.length-1; i>=0 ; i--) {
            sbText.delete(delIndex[i],delIndex[i]+6);
        }
        System.out.println(sbText);
        System.out.println("");
    }
    public static void taskB2(String text2){
        StringBuilder sbText=new StringBuilder(text2);
        //найдем количество предложений в тексте, заодно удалим переносы
        int sentenceCounter=0;
        for (int i = 0; i <sbText.length() ; i++) {
            if('\n'==sbText.charAt(i))sbText.deleteCharAt(i);
        }
        int sentenseStart=0;
        int sentenseEnd=0;
        int sentenseLength=0;
        Pattern sentence= Pattern.compile("(\\.{3})|[\\.?!]");
        Matcher okSentence=sentence.matcher(sbText);
        while(okSentence.find()) sentenceCounter++;//Считаем количество предложений
        StringBuilder[] sentenceStore =new StringBuilder[sentenceCounter];//создаем массив для хранения предложений
        sentenceCounter=0;
        okSentence=sentence.matcher(sbText); //разбиваем массив на предложения
        while(okSentence.find()){
            sentenseStart=sentenseEnd;//получаем начало и конец предложения
            sentenseEnd=okSentence.end();
            //заполняем массив предложениями
            sentenceStore[sentenceCounter]=new StringBuilder(sbText.substring(sentenseStart,sentenseEnd));
            sentenceCounter++;
        }
        for (int i = 0; i <sentenceStore.length ; i++)//удалим пробел в начале предложения
            if (' ' ==sentenceStore[i].charAt(0))
                sentenceStore[i].delete(0,1);
        sbText.delete(0,sbText.length()); //чистим StringBuffer sbText перед заполнением в нужном порядке
        for (int i = 0; i <sentenceStore.length ; i++) { //внешний цикл просто запускается в нашем случае 7 раз
                int wordMax=0;
                int wordMaxIndex = 0;
                int j;
            //внутренний цилкл перебирает предложения и находит самое длинное (в словах) из них
                for ( j = 0; j < sentenceStore.length; j++) {
                    if(sentenceStore[j].length()>0) {//проверяем не пустое ли предложение
                        int wordCounter = 0;
                        Pattern word = Pattern.compile("[а-яА-я0-9]+");
                        Matcher okWord = word.matcher(sentenceStore[j]);
                        while (okWord.find()) wordCounter++;
                        if (wordMax < wordCounter) {
                            wordMax = wordCounter;//определяем максималькую длину предложения в словах
                            wordMaxIndex = j;//запоминаем ее индекс
                        }
                    }
                }
            sbText.insert(0,"\n");
            sbText.insert(0,sentenceStore[wordMaxIndex]);
            //элемент массива с найденным предложением делаем пустым
                sentenceStore[wordMaxIndex].delete(0,sentenceStore[wordMaxIndex].length());
        }
        System.out.println(sbText);
    }
    public static void TaskB3(String text,char letter){
        StringBuilder sbText=new StringBuilder(text);
        Pattern word= Pattern.compile("[а-яА-ЯЁё]+");
        Matcher okWord=word.matcher(sbText);
        int count=0; //выясним количество слов в тексте
        while(okWord.find()) {
            count++;
        }
        String[] words=new String[count];    //создадим массив под слова
        int[] lettersNumber=new int[count];  //создадим массив под хранение количества вхождений заданной буквы в слово

        okWord=word.matcher(sbText);         //перебор текста по словам и запись слов в массив
        count=0;
        while(okWord.find()) {
            int letterCount=0;
            //для каждого слова найдем количество вхождений буквы
            // и занесем в соседний массив с таким-же индексом
            words[count]=sbText.substring(okWord.start(),okWord.end());
            for (int i = 0; i <words[count].length(); i++)
                if (letter==words[count].charAt(i)) letterCount++;
            lettersNumber[count]=letterCount;
            count++;
        }
        //отсортируем по убыванию массив количества вхождений буквы
        //а вместе с ним, по индексам, и массив слов
        for (int i = 0; i <words.length ; i++) {
            for (int j = i; j <words.length ; j++) {
                if (lettersNumber[i]<lettersNumber[j]){
                    int temp =lettersNumber[i];
                    lettersNumber[i]=lettersNumber[j];
                    lettersNumber[j]=temp;
                    String tempWord=words[i];
                    words[i]=words[j];
                    words[j]=tempWord;

                }
            }
        }
        //получим количество блоков для сортировки по алфавиту
        int blockNumber=lettersNumber[0]+1;
        //создаем новую строку для хранения результата
        StringBuilder result= new StringBuilder("");
        for (int i = 0; i <blockNumber ; i++) {
            //ищем и считаем флаги (кол-во вхождений буквы)сортируемого блока
            int blockCounter=0;
            for (int j = 0; j <lettersNumber.length ; j++) {
                if (i==lettersNumber[j]) blockCounter++;
            }
            //создаем массив, для сортируемого блока
            String[] block=new String[blockCounter];
            //заполняем массив
            blockCounter=0;
            for (int j = 0; j <lettersNumber.length ; j++) {
                if (i==lettersNumber[j]) {block[blockCounter]=words[j];blockCounter++;}
            }
            //сортируем массив
            Arrays.sort(block);
            for (int j = 0; j <block.length; j++) {
                result.append(block[j]+"\n");
            }
        }

        System.out.println(result);
    }
}
