package Assignment2;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void display() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.display();
    }
}