package day4;

/*1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить
его случайными числами от 0 до 10 (не включительно). Используя цикл for each вывести содержимое массива в консоль,
 а также вывести в консоль информацию о:
        а) Длине массива
        б) Количестве чисел больше 8
        в) Количестве чисел равных 1
        г) Количестве четных чисел
        д) Количестве нечетных чисел
        е) Сумме всех элементов массива*/

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();

        for (int i =0; i <array.length; i++) {

            array[i] = random.nextInt(9) + 1;

        }


        System.out.println();
        System.out.println("Длинна массива : " +array.length);
        for (int v:array ) {
            System.out.print(v + ", " );

        }
        System.out.println();
        int numbersOverEight = 0;          //Количестве чисел больше 8
        int numbersDownEight = 0;        //проверочная количество чисел меньше 8
        int numbersEqualEight = 0;        //проверочнное количество чисел равных 8
        int numbersEqualsOne = 0;          //Количестве чисел равных 1
        int numbersNotEqualsOne = 0;       //проверочная количество чисел не равных 1
        int EvenNumbers = 0;               //Количество четныж чисел
        int NonEvenNumbers = 0;            //Количество не четных чисел
        int sum = 0;                       //Сумма всех чисел

        for (int j : array) {
            if (j > 8) {
                numbersOverEight++;

            } else if (j < 8) numbersDownEight++; //проверочный код

            else numbersEqualEight++;
        }

        for (int k : array) {
            if (k == 1) {
                numbersEqualsOne++;
            } else numbersNotEqualsOne++;
        }

        for (int j : array) {
            if (j % 2 == 0) {
                EvenNumbers++;
            } else NonEvenNumbers++;
        }


        for (int j : array) {
            sum += j;
        }

        System.out.println("Количество чисел больше восьми : " + numbersOverEight);
        System.out.println("Количество чисел меньше восьми : " + numbersDownEight); // проверочная строка
        System.out.println("Количество чисел равных восьми : " + numbersEqualEight); // проверочная строка
        System.out.println("Количество чисел равных одному : " + numbersEqualsOne);
        System.out.println("Количество чисел не равных одному : " + numbersNotEqualsOne);
        System.out.println("Количество четных чисел : " + EvenNumbers);
        System.out.println("Количество не четных чисел : " + NonEvenNumbers);
        System.out.println("Сумма всех чисел : " + sum);
    }
}
