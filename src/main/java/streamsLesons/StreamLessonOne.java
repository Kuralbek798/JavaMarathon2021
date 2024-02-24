package streamsLesons;

public class StreamLessonOne {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        Thread thread = new Thread(new MyThreadSecond());
        thread.start();
        myThread1.start();
        myThread.start();
        System.out.printf("%s\n", "Hello world");
    }
}

class MyThreadSecond implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from MyThreadSecond implemented interface Runnable" + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%s\n", "Hello from MyThread " + i);
        }
    }
}
