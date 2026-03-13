package Assignment1;

public class Palindrome {
	    boolean isPalindrome(String str) {
	        String rev = "";

	        for(int i=str.length()-1; i>=0; i--)
	            rev += str.charAt(i);

	        return str.equals(rev);
	    }

	    public static void main(String[] args) {
	        Palindrome obj = new Palindrome();

	        if(obj.isPalindrome("trupthi"))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Not Palindrome");
	    }
	}


