package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner,
        число, соответствующее количеству этажей в здании. Используя условный оператор if,
         необходимо вывести в консоль сообщение о типе такого дома.
         Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”,
         9 и более - “Многоэтажный дом”. Также, необходимо учесть что может быть введено отрицательное значение,
         в таком случае сообщить “Ошибка ввода”. */
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        if(b < 0){
            System.out.println("Ошибка ввода");
        }
        else if(b > 0 && b < 5){
            System.out.println("Малоэтажный дом");
        }
        else if( b > 4 && b < 9){
            System.out.println("Среднеэтажный дом");
        }
        else if (b > 9){
            System.out.println("Многоэтажный дом");


        }



    }
}
