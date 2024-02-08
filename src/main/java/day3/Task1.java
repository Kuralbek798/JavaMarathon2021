package day3;

//1. Реализовать программу, используя switch, которая в консоль выводит название страны,
//принимая на вход название города.
//        Реализовать, используя следующие данные:
//        Москва, Владивосток, Ростов - Россия
//        Рим, Милан, Турин - Италия
//        Ливерпуль, Манчестер, Лондон - Англия
//        Берлин, Мюнхен, Кёльн - Германия
//        При вводе любого другого города, вывести сообщение “Неизвестная страна”.


import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    private String c = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equalsIgnoreCase("stop")) {
   if (userInput.equalsIgnoreCase("stop")) {
                return;
            }

            System.out.println();
            System.out.print("Для остановки программы введите stop:\nДля определения страны введите название города: ");
            userInput = scanner.nextLine().toLowerCase();
            System.out.println();

            switch (userInput) {
                case  "москва", "владивосток", "ростов":
                    System.out.print("Россия\n");
                    break;
                case "рим", "милан", "турин":
                    System.out.print("Италия\n");
                    break;
                case "ливерпуль", "манчестер", "лондон":
                    System.out.print("Англия\n");
                    break;
                case "берлин", "мюнхен", "кельн":
                    System.out.print("Германия\n");
                    break;
                case "stop":
                    System.out.print("Программа завершена, введена команда stop!");
                    break;
                default:
                    System.out.print("\n");
                    System.out.print("Неизвестная странна.\n");
                    break;
            }
        }

    }

}




