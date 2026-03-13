package Assignment1;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class Parent {
    void show() {
        System.out.println("Parent method");
    }
}
class Method extends Parent {
    void show() {
        System.out.println("Child method");
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Add 2 numbers: " + c.add(10, 20));
        System.out.println("Add 3 numbers: " + c.add(10, 20, 25));
        Parent p = new Method();
        p.show();
    }
}