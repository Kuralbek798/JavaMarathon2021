package day4;
/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя цикл for each вывести в консоль:
        -	наибольший элемент массива
        -	наименьший элемент массива
        -	количество элементов массива, оканчивающихся на 0
        -	сумму элементов массива, оканчивающихся на 0.
        Использовать сортировку запрещено.
*/
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10000];
        Random random = new Random();

        Arrays.setAll(intArray, i -> random.nextInt(0, 100));
        int min = intArray[0];
        int max = intArray[0];
        int valueEndO = 0;
        int quantityValuesEndO = 0;

        for (int value : intArray) {
            System.out.printf("%d ", value);

            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
            if (value % 10 == 0) {
                quantityValuesEndO++;
                valueEndO += value;
            }
        }
        System.out.println();
        System.out.printf("Max value: %d\nMin value: %d\nQuantity values ends zero: %d\nSum of quantity values ends zero: %d\n", max, min, valueEndO, quantityValuesEndO);
    }
}
