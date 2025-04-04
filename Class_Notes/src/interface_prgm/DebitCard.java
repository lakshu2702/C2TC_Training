package interface_prgm;

public class DebitCard implements Payment {
    private String cardNumber;

    public DebitCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing debit card payment of Rs. " + amount + " using card number: " + cardNumber);
    }
}
