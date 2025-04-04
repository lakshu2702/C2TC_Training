package interface_prgm;

public class CreditCard implements Payment {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of Rs. " + amount + " using card number: " + cardNumber);
    }

    @Override
    public String toString() {
        return "CreditCard [cardNumber=" + cardNumber + "]";
    }
}
