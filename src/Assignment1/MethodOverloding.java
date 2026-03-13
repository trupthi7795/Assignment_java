package Assignment1;

public class MethodOverloding {
	    int add(int a, int b) {
	        return a + b;
	    }

	    int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    public static void main(String[] args) {
	        MethodOverloding obj = new MethodOverloding();

	        System.out.println(obj.add(6,12));
	        System.out.println(obj.add(6,12,15));
	    }
	}

