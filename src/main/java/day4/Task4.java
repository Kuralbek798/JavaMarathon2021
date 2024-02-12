package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
     /*   Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы
         и индекс первого элемента тройки.
        Пример:*/
        int[] intArray = new int[100];
        int maxSumOfThree = 0;
        int index = 0;
        Random random = new Random();
        Arrays.setAll(intArray, i -> random.nextInt(0, 10000));
        int[] intSumArray = new int[intArray.length - 3];

        for (int i = 0; i < intArray.length - 3; i++) {
            int sum = 0;
            for (int j = 2 + i; j >= i; j--) {
                sum += intArray[i];
            }
            intSumArray[i] = sum;

            if (maxSumOfThree < intSumArray[i]) {
                maxSumOfThree = intSumArray[i];
                index = i;
            }
            System.out.printf("%d%s",intSumArray[i],";");
        }
        System.out.println();
        System.out.printf("Максимальное значение суммы трех элементов:  %d\n", maxSumOfThree);
        System.out.printf("Первый индекс элемента тройки максимального значенияФ: %d",index);
    }

}