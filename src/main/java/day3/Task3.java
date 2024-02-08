package day3;
/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
 мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
  Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать оператор continue.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        List<Double> doubleList = new ArrayList<>();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        double divisible = 0;
        double divider = 0;
        double result = 0;
        while (i < 2) {
            System.out.printf("Введите делимое: ");
            doubleList.add(scanner.nextDouble());
            System.out.printf("Введите делитель: ");
            doubleList.add(scanner.nextDouble());
            i++;
        }
        for (int j = 0; j < doubleList.size() - 1; j += 2) {
            for (int k = j + 1; k != j + 2; k++) {
                divisible = doubleList.get(j);
                divider = doubleList.get(k);
                result = divisible / divider;
            }
            System.out.printf("результат деления: %.2f\n", result);
        }
    }

}
