package Assignment1;

public class Bank_Account {
	    private int accountNumber;
	    private double balance;

	    void setDetails(int acc, double bal) {
	        accountNumber = acc;
	        balance = bal;
	    }
	    void deposit(double amount) {
	        balance += amount;
	    }
	    void withdraw(double amount) {
	        balance -= amount;
	    }
	    void display() {
	        System.out.println("Account: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }
	    public static void main(String[] args) {
	        Bank_Account obj = new Bank_Account();
	        obj.setDetails(1000, 50000);
	        obj.deposit(20000);
	        obj.withdraw(5000);
	        obj.display();
	    }
	}
