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
 int floorNumber = scanner.nextInt();
 if(floorNumber <= 0){
     System.out.print("Ошибка ввода");
 }

 if(floorNumber == 1 || floorNumber == 2 || floorNumber == 3 || floorNumber ==4){
     System.out.print("Малоэтажный дом");
 }
 else if(floorNumber == 5 || floorNumber == 6 || floorNumber == 7 || floorNumber == 8){
     System.out.print("Среднеэтажный дом");
 }else if(floorNumber >= 9){
     System.out.print("Многоэтажный дом");
 }


    }
}
