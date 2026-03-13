package Assignment1;
import java.util.Scanner;
public class Check {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("negative");
		else
			System.out.println("zero");
		sc.close();
	}

}
