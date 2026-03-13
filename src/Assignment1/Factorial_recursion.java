package Assignment1;

public class Factorial_recursion {
	    int factorial(int n) {
	        if(n == 0 || n == 1)
	            return 1;
	        else
	            return n * factorial(n-1);
	    }

	    public static void main(String[] args) {
	        Factorial_recursion obj = new Factorial_recursion();
	        System.out.println("Factorial = " + obj.factorial(10));
	    }
	}

