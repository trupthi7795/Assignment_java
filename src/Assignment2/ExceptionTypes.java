package Assignment2;

import java.io.*;

public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt"); // Checked
        } catch (Exception e) {
            System.out.println("Checked Exception");
        }

        try {
            int a = 10 / 0; // Unchecked
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception");
        }
    }
}
