package Task1;

public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentA = new PaymentA(100);
        PaymentHandler paymentB = new PaymentB(300);
        PaymentHandler paymentC = new PaymentC(1000);

        // Setting up the chain
        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        // Attempt to pay $210
        paymentA.pay(210);
    }
}

