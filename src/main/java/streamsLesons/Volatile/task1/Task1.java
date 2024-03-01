package streamsLesons.Volatile.task1;
/*Создайте переменную типа int с модификатором volatile.
Измените ее значение в одном потоке и выведите его в другом потоке.*/
public class Task1 {
    static volatile int variable = 0;
    public static void main(String[] args) {
        new WriteStream().start();
        new ReadStream().start();
    }
}

