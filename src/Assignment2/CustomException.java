package Assignment2;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class CustomException {
    static void validate(int age) throws MyException {
        if (age < 18)
            throw new MyException("Not eligible");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
