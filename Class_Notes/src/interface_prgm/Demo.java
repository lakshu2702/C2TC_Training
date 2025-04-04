package interface_prgm;

public class Demo {

    public static void main(String[] args) {
        Payment credit = new CreditCard("123456789");
        credit.process(200);

        Payment upi = new UPI("123456789@ybl");
        upi.process(200);

        Payment debit = new DebitCard("12345");
        debit.process(500);
    }
}
