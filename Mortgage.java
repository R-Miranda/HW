import java.util.Scanner;
public class Mortgage{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter price in thousands: ");
	Double price = input.nextDouble() * 1000;
	System.out.println("What percent of that will you put down?");
	Double downpayment = input.nextDouble() / 100 * price;
	System.out.println("Downpayment amount is " + downpayment);
	System.out.println("Enter number of years: ");
	int years = input.nextInt();
	System.out.print("Enter annual interest rate: ");
	Double rate = input.nextDouble(); 
	//principal amount
	Double p = price - downpayment;
	Double r = rate / 100 / 12;
	int n = years * 12;
	if (r > 0) {
	Double monthlyPayment = r*p * Math.pow(1+r, n) / (Math.pow(1 + r, n) - 1);
	} else {
		monthlyPayment = principal / term;
	}
	
	System.out.println(" Your monthly payment is " + (int)monthlyPayment);
	input.close();
	}
}