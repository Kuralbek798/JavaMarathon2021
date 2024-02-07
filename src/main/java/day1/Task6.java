package day1;

public class Task6 {
    public static void main(String[] args) {
    /*6. Объявите переменную типа int, имя переменной - k.   1 x k = …
                                                             2 x k = …
                                                             3 x k = …
         Присвойте этой переменной какую-нибудь цифру от 1 до 9.
         Используя цикл на ваше усмотрение (for или while),
         выведите в консоль таблицу умножения для этой цифры в следующем формате:
        */
        String str = "%d x %d = %d\n";
        int k = 2;
        for(int i = 1;i <= 3;i++){
            System.out.printf(str,i,k,i * k);
        }


    }
}
