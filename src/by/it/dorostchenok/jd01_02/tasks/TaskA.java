package by.it.dorostchenok.jd01_02.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskA {
    /**
     * Implementation of Task 1 from Group A
     *
     * @param intArray Array of integer
     *
     */
    public void findLongestAndShortestElement(int[] intArray){
        int numLength = 0;
        int numItself = 0;

        for(int i : intArray){
            int length = Integer.toString(i).length();
            if(length > numLength){
                numLength = length;
                numItself = i;
            }
        }

        System.out.println(numItself + " - " +numLength);

        numLength = Integer.MAX_VALUE;
        numItself = 0;

        for(int i : intArray){
            int length = Integer.toString(i).length();
            if(length < numLength){
                numLength = length;
                numItself = i;
            }
        }

        System.out.println(numItself + " - " +numLength);
    }
    /**
     * Implementation of Task 2 from Group A
     *
     * @param intArray Array of integer
     *
     */
    public void showNumbersLessThanAverage(int[] intArray){
        int sum = 0;
        for(int i : intArray)
            sum += Integer.toString(i).length();

        double average = sum / (double)intArray.length;

        for(int i : intArray){
            int length = Integer.toString(i).length();
            if(length < average){
                System.out.println("Number: " + i + "\tLength: " + length);
            }
        }
    }
    /**
     * Implementation of Task 3 from Group A
     *
     * @param intArray Array of integer
     *
     */
    public void showFirstDifferentNumber(int[] intArray){
        for(int i : intArray){
            boolean isRepeating = false;
            char[] cArr = Integer.toString(i).toCharArray();
            for(int j = 0; j < cArr.length; j++){
                for(int k = j + 1; k < cArr.length; k++){
                    if(cArr[j] == cArr[k]){
                        isRepeating = true;
                        break;
                    }
                }

                if(isRepeating) break;
            }

            if(isRepeating) continue;
            else{
                System.out.println(i);
                break;
            }
        }
    }
    /**
     * Implementation of Task 4 from Group A
     *
     * @param intArray Array of integer
     *
     */
    public void showPalindrome(int[] intArray){
        for(int x : intArray){
            boolean isPalindrome = true;
            char[] array = Integer.toString(x).toCharArray();
            for(int j = 0; j < array.length / 2; j++){
                if(array[j] != array[array.length - 1 - j]){
                    isPalindrome = false;
                    break;
                }
            }
            if(!isPalindrome) continue;
            else
                System.out.println("Palindrome: " + x);
        }
    }
}
