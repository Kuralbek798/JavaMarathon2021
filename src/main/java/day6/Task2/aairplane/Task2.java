package day6.Task2.aairplane;

import day6.Task2.aairplane.Airplane;

import java.util.Scanner;

public class
Task2 {
    public static void main(String[] args) {
     Airplane airplane = new Airplane("Boeing",21312,212,234);
     airplane.filItUp(1100000);
     airplane.info();
     airplane.setYear(1990);
     airplane.setLength(6000);
     airplane.info();
    }
}
