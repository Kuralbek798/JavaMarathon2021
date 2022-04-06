package day6.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
 Airplane airplane = new Airplane("Boeing", 2020, 200,20_000);
        Scanner scanner = new Scanner(System.in);

 airplane.info();
 airplane.setFuel(123);
 airplane.info();
 airplane.setLength(300);
 airplane.setYear(2023);
        System.out.print(" Заправте самолет, введите количество топлива: ");
        int fuelMessure = scanner.nextInt();
 airplane.filUp(fuelMessure);
 airplane.info();
    }
}
