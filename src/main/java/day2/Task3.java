package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
       /* 3. Реализовать программу №2, используя цикл while.
        2. Есть два числа, которые задаются пользователем через консоль (назовем эти два числа a и b).
       Используя цикл for, вывести все числа из диапазона между a и b, которые делятся на 5 без остатка,
       но при этом не делятся на 10 без остатка. Например, число 15 подходит под наше условие
        (делится на 5 без остатка и не делится на 10 без остатка), но число 20 не подходит под наше условие
        (делится на 5 без остатка и делится на 10 без остатка). Сами числа a и b в диапазоне не учитывать.
        Если a >= b вывести сообщение "Некоррект sый ввод". */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        numbersRange(a,b);
    }

    public  static  int numbersRange(int a, int b){

        while ( a+1 !=b) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a +"\t"+"|  ");
            }


            if  (a % 10 == 0){
                System.out.println(a);
            }
        }

        return a;
    }


}

