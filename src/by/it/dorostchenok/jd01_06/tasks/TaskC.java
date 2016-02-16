package by.it.dorostchenok.jd01_06.tasks;

import java.util.Arrays;

public class TaskC {
    /**
     * 1. Выполнить форматирование с выравниванием по обоим краям. Для этого добавить
        дополнительные пробелы между словами.
     * @param text текст для форматирования по краям
     * @return отформатированный текст
     */
    public String formatText(String text){
        StringBuilder stringBuilder = new StringBuilder();
        int finalLength = getMaxStringLength(text);

        for (String str : text.split("\n")){
            String[] wordArray = str.split(" ");
            int numberOfSpaces = wordArray.length - 1;
            int spacesToAdd = finalLength - str.length();
            int x = spacesToAdd / numberOfSpaces;
            int y = spacesToAdd % numberOfSpaces;
            int[] spacesArr = new int[numberOfSpaces];
            Arrays.fill(spacesArr, x);
            for (int j = 0; j < y; j++){
                spacesArr[j] += 1;
            }

            for (int j = 0; j < wordArray.length; j++){
                stringBuilder.append(wordArray[j]);
                if (j < spacesArr.length){
                    for (int i = 0; i <= spacesArr[j]; i++){
                        stringBuilder.append(" ");
                    }
                }
                if (j == spacesArr.length){
                    stringBuilder.append("\n");
                }
            }
        }

        return stringBuilder.toString();
    }

    private int getMaxStringLength(String text){
        int length = 0;
        for(String s : text.split("\n")){
            if (s.length() > length){
                length = s.length();
            }
        }

        return length;
    }
}
