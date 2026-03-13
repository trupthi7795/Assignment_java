package Assignment1;

public class Sum {

	public static void main(String[] args) {
		int i=2;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("sum of even number is:"+sum);
	}
}
