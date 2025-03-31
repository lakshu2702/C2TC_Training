package Question1;
import java.util.Scanner;

public class Comission {
	private String name, address;
	private long phone;
	private double sales_amount;
	
	void acceptDetails() {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLong();

        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
	}
	void calculateComission(){
		double comission = 0;

        if (sales_amount >= 100000) {
            comission = 0.10 * sales_amount;
        } else if (sales_amount >= 50000) {
            comission = 0.05 * sales_amount;
        } else if (sales_amount >= 30000) {
            comission = 0.03 * sales_amount;
        } else {
            comission = 0; 
        }

        System.out.println("Sales Commission: " + comission);
	}
	public static void main(String args[]) {
		Comission obj = new Comission();
		obj.acceptDetails();
		obj.calculateComission();

	}
}