package day1;

public class Task1 {
    public static void main(String[] args) {
/*

        1. Вывести на экран слово “JAVA”, в строку, чтобы оно повторилось 10 раз, используя цикл while.
        Вывод в консоль должен быть таким:
        JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
*/
        String str = "JAVA";
        int i = 0;
        int a = 10;
        while (i < a) {
            System.out.print(str + " ");
            i++;
       }

    }
}
