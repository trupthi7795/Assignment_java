package Assignment2;
class Counter1 {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class ThreadSyncDemo {
    public static void main(String[] args) throws Exception {

        Counter1 c = new Counter1();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}