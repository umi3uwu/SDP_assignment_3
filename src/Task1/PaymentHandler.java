package Task1;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;
    protected double balance;

    public void setNext(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void pay(double amount) {
        if (canPay(amount)) {
            System.out.println("Paid $" + amount + " using " + this.getClass().getSimpleName());
        } else if (nextHandler != null) {
            System.out.println("Cannot pay using " + this.getClass().getSimpleName() + ". Proceeding to " + nextHandler.getClass().getSimpleName());
            nextHandler.pay(amount);
        } else {
            System.out.println("None of the accounts have enough balance.");
        }
    }

    private boolean canPay(double amount) {
        return balance >= amount;
    }
}

