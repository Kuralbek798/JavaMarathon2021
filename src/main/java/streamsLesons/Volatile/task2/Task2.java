package streamsLesons.Volatile.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static streamsLesons.Volatile.task2.Task2.lock;

/*Напишите программу, в которой два потока увеличивают одну и ту же volatile переменную на 1.*/
public class Task2 {
    private static volatile int abc = 1;
   static final Lock lock = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {

        SharingVariable sharingVariable = new SharingVariable(abc);
        WrThread thread = new WrThread(sharingVariable);
        WrThread1 thread1 = new WrThread1(sharingVariable);
        thread.start();
        thread1.start();
        thread1.join();
        thread.join();
        System.out.printf("The final result of abc: %d\n", sharingVariable.getA());
    }
}

class WrThread extends Thread {

    SharingVariable a;

    public WrThread(SharingVariable a) {
        this.a = a;
    }

    public void run() {
        lock.lock();
        a.setA(a.getA() + 5);
        System.out.printf("result WrThread %d\n", a.getA());
        lock.unlock();
    }
}

class WrThread1 extends Thread {
    SharingVariable b;

    public WrThread1(SharingVariable b) {
        this.b = b;
    }

    public void run() {
        lock.lock();
        b.setA(b.getA() + 5);
        System.out.printf("result WrThread1 %d\n", b.getA());
        lock.unlock();
    }
}

class SharingVariable {
    int a;

    public SharingVariable(int a) {
        this.a = a;
    }

    public  void setA(int a) {
        this.a = a;
    }

    public  int getA() {
        return this.a;
    }
}