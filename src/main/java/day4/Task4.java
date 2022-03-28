package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
     /*   Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы
         и индекс первого элемента тройки.
        Пример:
*Для простоты пример показан на массиве размера 10
                [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]*/

        // int[] array = {1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254};

        int[] array= new int[100];                             //Создать новый массив размера 100

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {               //заполнить его случайными числами из диапазона от 0 до 10000
            array[i] = random.nextInt(10000);
        }

        int maxSumidx = 0;
        int maxSum = 0;
        for (int i = 0; i <array.length-2; i++) {
            int sum = 0;                                      //Найти максимум среди сумм трех соседних элементов
            for (int j = i ; j < i+3; j++) {
                sum += array[j];
                if (maxSum < sum)
                    maxSum = sum;
                maxSumidx = i;
            }

        }
        System.out.println(maxSum);                          //выведите значение суммы и индекс первого элемента тройки.
        System.out.println(maxSumidx);

    }

}