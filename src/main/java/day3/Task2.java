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
public static void main(String[]args){
    double divisible =  0;
    double divider = 0;
    double result = 0;
    boolean run = true;
    Scanner scanner = new Scanner(System.in);
    while(run){
        System.out.print("Введите делимое: ");
        divisible = scanner.nextDouble();
        System.out.print("Введите делитель: ");
        divider = scanner.nextDouble();
        if(divider == 0){
            System.out.print("Вы ввели ноль программа остановлена");
            break;
        }
        result = divisible/divider;
        System.out.printf("Результат деления %.2f\n",result);
    }
  }
}
