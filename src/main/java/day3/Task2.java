package day3;

/*
2. Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль. Программа останавливает свою работу тогда,
когда пользователь вводит 0 в качестве делителя.
 (для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
В решении обязательно использовать оператор break.
*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double divisible = scanner.nextDouble();
         double divider = scanner.nextDouble();
         calculator(divisible,divider);
    }

    public static void calculator(double divisible, double divider) {
     if (divisible == 0 || divider == 0){
         System.out.println("На ноль делить нельзя");
         return;

     }
        System.out.println(divisible/divider);
    }
}
