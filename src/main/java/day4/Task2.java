package day4;

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
        Затем, используя цикл for each вывести в консоль:
        -	наибольший элемент массива
        -	наименьший элемент массива
        -	количество элементов массива, оканчивающихся на 0
        -	сумму элементов массива, оканчивающихся на 0
        Использовать сортировку запрещено.
*/

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();                          // создаем обьект random.
         int[] array = new  int[100];                         //создаем массив размера 100

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            array[i]= random.nextInt(10_000);         //заполнить его случайными числами из диапазона от 0 до 10000.

            if ( max < array[i]){                           //наибольший элемент массива
                max = array[i];
            }

            if(min > array[i]){
                min = array[i];                           //наименьший элемент массива
            }

        }
        System.out.println(max);
        System.out.println(min);

       int quantityNumbersZero =0;
        int sumQuantityNumberszero = 0;

        for (int j : array) {

            if (j % 10 == 0) {                        //количество элементов массива, оканчивающихся на 0
                quantityNumbersZero++;

                sumQuantityNumberszero += j;          //сумму элементов массива, оканчивающихся на 0
            }


        }
        System.out.println(sumQuantityNumberszero);
        System.out.println(quantityNumbersZero);
    }
}
