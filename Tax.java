import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// Determining filing status and income
		
		System.out.print("Please enter who is filing. Enter either single, married filing jointly, qualifying widower, married filing seperately or head of household... ");
		String type = in.nextLine();
		
		System.out.print("Please enter taxable income... ");
		Double income = in.nextDouble();
		
		Double tax;
		
		in.close();
		
		if (income >= 0) {
			if (type.equals("single") || (type.equals("married filing seperately"))) {
				if (income <= 8350) { tax = (income * .10); 
					System.out.println("Your tax is $" + tax);
				} else { tax = (income * .15); 
					System.out.println("Your tax is $" + tax); }
			}
			else if (type.equals("married filing jointly") || (type.equals("qualifying widower")))  {
				if (income <= 16700) { tax = (income * .10); 
					System.out.println("Your tax is $" + tax);
				} else { tax = (income * .15); 	
					System.out.println("Your tax is $" + tax); }
			}
			else if (type.equals("head of household")) {
				if (income <= 11950){ tax = (income * .10); 
					System.out.println("Your tax is $" + tax); 
				} else { tax = (income * .15); 
					System.out.println("Your tax is $" + tax); }
			}
		}
		else { System.out.println("Invalid input. Please make sure information is entered correctly.");
		}
		
	}
}



		
