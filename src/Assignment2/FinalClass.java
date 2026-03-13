package Assignment2;

final class Final {
    final int x = 10;

    final void display() {
        System.out.println("Final method value: " + x);
    }
}

public class FinalClass {
    public static void main(String[] args) {
        Final obj = new Final();
        obj.display();
    }
}