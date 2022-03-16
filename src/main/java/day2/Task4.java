package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

       /*
       if x >=5         y = (x^2 - 10) / (x + 7)
       if -3 < x < 5    y = (x+3) / (x^2 - 2)
       else             y = 420

        Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число x.
       Для этого числа, по формуле выше, необходимо вычислить значение y и вывести его в консоль,
        используя метод System.out.println().
        (Для этих вещественных чисел x и y необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно,
        чтобы считать из консоли число x). */

        Scanner  scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        System.out.println( mathEquations(x,y));

    }
    public  static  double mathEquations(double x,double y){
        if (x >= 5){
            y = (Math.pow(x,2) - 10) / (x + 7);
        }
        else if (-3 < x && x < 5){
            y = (x + 3) / (Math.pow(x,2) - 2);
        }
        else {
            y = 420;
        }
    return y;
    }

}
