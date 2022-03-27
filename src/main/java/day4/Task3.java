package day4;
/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько,
 вывести индекс последней из них.
 Пример сгенерированной матрицы (для простоты m=3, n=5):
*/

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[12][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {                  //Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
                array[i][j] = random.nextInt(50);
            }
        }

        System.out.println(Arrays.deepToString(array));

        int maxSum = 0;
        int  maxSumIndex = 0;
         for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];

                if (sum >= maxSum)
                    maxSum = sum;
                maxSumIndex = i;
            } System.out.println(sum);                                //проверка sum
        }

        System.out.println(" Максимальная сумма : " + maxSum +  "\n" + " индекс строки максимального значения суммы : " + maxSumIndex);

    }
}


