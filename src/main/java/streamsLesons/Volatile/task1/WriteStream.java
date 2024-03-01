package streamsLesons.Volatile.task1;

public class WriteStream extends Thread {
    public void run() {
        Task1.variable = 11;
    }
}
