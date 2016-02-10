package by.it.Baranova.JD01_02_taskB;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ekaterina on 2/10/16.
 */
public class Calculation {

        public void Interval() {
            int k = 545;
            int n = 4;
            int m = 123;
            if (k > n && k < m || k > m && k < n) System.out.println("Число " + k + " относится к интервалу");
            else System.out.println("Число " + k + " к интервалу не относится");
        }

    public void Array() {
            int k = 12;
            double m = Math.sqrt(k);
            int n = (int) Math.ceil(m);
            int[][] numbers = new int[n][n];
            int counter = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (counter <= k) {
                        numbers[i][j] = counter;
                        counter++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(numbers[i][j] + "   ");
                }
                System.out.println();
            }
    }

        public void Equation() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите параметры уравнения");
            System.out.println("Введите параметр а=");
            int a = in.nextInt();
            System.out.println("Введите параметр b=");
            int b = in.nextInt();
            System.out.println("Введите параметр c=");
            int c = in.nextInt();
            double d = b * b - 4 * a * c;
            if (d < 0) System.out.println("Уравнение корней не имеет");
            //if (0 == d) {
            //    float  x1 = -1 *(b/(2 * a));
            //    System.out.println("x1=x2=" + x1);
            //}
            //if (d > 0) {
            float   x1 = (float) ((-1 * b + Math.sqrt(d)) / (2 * a));
            float  x2 = (float) ((-1 * b - Math.sqrt(d)) / (2 * a));

            System.out.println("x1=" + x1 + "  "+"x2=" + x2);
            //}
        }

        public void Months() {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите  номер месяца");
            int month_number = in.nextInt();
            switch (month_number){
                case 1:
                    System.out.println("Январь");
                    break;
                case 2:
                    System.out.println("Февраль");
                    break;
                case 3:
                    System.out.println("Март");
                    break;
                case 4:
                    System.out.println("Апрель");
                    break;
                case 5:
                    System.out.println("Май");
                    break;
                case 6:
                    System.out.println("Июнь");
                    break;
                case 7:
                    System.out.println("Июль");
                    break;
                case 8:
                    System.out.println("Август");
                    break;
                case 9:
                    System.out.println("Сентябрь");
                    break;
                case 10:
                    System.out.println("Октябрь");
                    break;
                case 11:
                    System.out.println("Ноябрь");
                    break;
                case 12:
                    System.out.println("Декабрь");
                    break;
                default:
                    System.out.println("Вы ввели некорректное число");
            }

        }

    }

