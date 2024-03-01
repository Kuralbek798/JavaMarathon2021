package streamsLesons.Volatile.task1;

public class ReadStream extends Thread {
    public void run() {
        System.out.printf("%d", Task1.variable);
    }
}
