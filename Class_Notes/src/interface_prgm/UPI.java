package interface_prgm;

public class UPI implements Payment {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void process(double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount + " using UPI ID: " + upiId);
    }
}
