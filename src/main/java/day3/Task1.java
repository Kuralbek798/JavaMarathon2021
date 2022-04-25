package day3;

/*1. Реализовать программу, используя switch, которая в консоль выводит название страны,
принимая на вход название города.
        Реализовать, используя следующие данные:
        Москва, Владивосток, Ростов - Россия
        Рим, Милан, Турин - Италия
        Ливерпуль, Манчестер, Лондон - Англия
        Берлин, Мюнхен, Кёльн - Германия
        При вводе любого другого города, вывести сообщение “Неизвестная страна”.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sity = scanner.nextLine() ;

        System.out.println(choseSyity(sity));

    }



    public static List<String> choseSyity (String sity){
        List<String> country = new ArrayList<>();


        switch (sity) {

            case "stop":
                break;
            case "Москва", "Владивосток", "Ростов":
                country.add(" Россия");
                break;
            case "Рим", "Милан", "Турин":
                country.add("Италия");
                break;
            case "Ливерпуль", "Манчестер", "Лондон":
                country.add("Англия");
                break;
            case "Берлин", " Мюнхен", "Кельн":
                country.add("Германия");
                break;
            default:
                country.add("Неизвестная /страна");
                break;
        }

        return country;
    }

}