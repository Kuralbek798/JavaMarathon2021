package outDate;

public class Recrusion {
    public static void main(String[] args) {

        // System.out.println("Значение равно: " + factorial(4));
        System.out.println(isPalindromeRec("asddsa"));
    }

    /*public static int factorial(int n){
           if ( n == 1) {
               System.out.println("У нас есть левая часть и правая  n * factorial(n - 1); условно разделеные умножением" +
                       "\n когда метод работает вниз по правой стороне используя рекрусию то он создает значения для левой части 4, 3, 2" +
                       "\n но значения не возвращаются так как n != 1 когда n == 1  то он поднимается полевой стороне " +
                       "\n 2 * 3 = 6  6 * 4 = 24 " );
               return 1;
           }
        System.out.println(n);

           return n * factorial(n - 1);
   }*/
    static boolean isPalindromeRec(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;   //asddsa
                                                                           //sdds
                                                                           //...
        return isPalindromeRec(str.substring(1, str.length() - 1));

    }
}
