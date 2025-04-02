package ticketBookingSystem;

public class Demo {
    public static void main(String[] args) {
        TicketBookingSystem ob = new TicketBookingSystem();
        
        for (int i = 1; i <= 6; i++) {
            System.out.println("Person " + i + " is booking the ticket...");
            ob.bookTicket();
        }
    }
}