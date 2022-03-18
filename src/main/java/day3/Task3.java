package day3;
/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Если пользователь вводит 0 в качестве делителя, вместо того, чтобы останавливать работу цикла принудительно,
 мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
  Ключевое слово else или два if использовать в этой программе нельзя. В решении обязательно использовать оператор continue.
*/

import java.util.Scanner;
public class Task3 {
 //static    double i;
    public static void main(String[] args) {
        double divisible = 0;
        double divider = 0;
        calculator(divisible,divider);

    }

        public static void calculator(double divisible, double divider){
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
           // while ( i != 5) {
                 divisible = scanner.nextDouble();
                 divider = scanner.nextDouble();
                //i++;
               if(divider==0 || divisible == 0){
                   System.out.println("Деление на ноль");
                   continue;
               }
                System.out.println(divisible/divider);
            }
         }






}
