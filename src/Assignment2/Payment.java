package Assignment2;

interface PaymentDemo {
    void pay();
}

class CashPayment implements PaymentDemo {
    public void pay() {
        System.out.println("Payment done using Cash.");
    }
}

class CardPayment implements PaymentDemo {
    public void pay() {
        System.out.println("Payment done using Card.");
    }
}

public class Payment {
    public static void main(String[] args) {

        PaymentDemo p1 = new CashPayment();
        p1.pay();

        PaymentDemo p2 = new CardPayment();
        p2.pay();
    }
}