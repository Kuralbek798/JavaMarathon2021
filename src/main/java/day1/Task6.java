package day1;

public class Task6 {
    public static void main(String[] args) {
/*
        6. Объявите переменную типа int, имя переменной - k.                  1 x k = …
                                                                              2 x k = …
                                                                              3 x k = …
         Присвойте этой переменной какую-нибудь цифру от 1 до 9.
         Используя цикл на ваше усмотрение (for или while),
         выведите в консоль таблицу умножения для этой цифры в следующем формате:

        */
        int k = 3;

        for ( int i = 1; i <= 9; i++) {
         int b =  i * k;
            System.out.println( i +" * 3 = " + b);
        }




    }
}
