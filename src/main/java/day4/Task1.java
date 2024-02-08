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

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] intArray = new int[inputNumberMethod()];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
        }
        int quantityBiggerEight = 0;
        int quantityEqualOne = 0;
        int quantityEvens = 0;
        int quantityNonEvens = 0;
        int sum = 0;
        for (int value : intArray) {
            if (value > 8) {
                quantityBiggerEight++;
            } else if (value == 1) {
                quantityEqualOne++;
            }
            if (value % 2 == 0) {
                quantityEvens++;
            } else {
                quantityNonEvens++;
            }
            sum += value;
        }
        System.out.printf(
                "Количество чисел  больше 8: %d\nКоличество равное  1: %d\nКоличеств четных чисел: %d\nКоличество не четных чисел: %d\nСумма всех чисел массива: %d\n",
                quantityBiggerEight, quantityEqualOne, quantityEvens, quantityNonEvens, sum);

    }

    public static int inputNumberMethod() {
        Scanner scanner = new Scanner(System.in);
        var inputNumber = scanner.nextInt();
        return inputNumber;
    }
}
