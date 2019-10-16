/* Ricardo Miranda 306699034
CS2011-04
Outputs a 4 letter string that the user must input correctly */

import java.util.Random;
import java.util.Scanner;
public class TestTutor {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	
		Random letter = new Random();
		// Creating a random string
		int letone, lettwo, letthree, letfour;
	
		letone = letter.nextInt (26)+65;
		lettwo = letter.nextInt (26)+97;
		letthree = letter.nextInt (26)+97;
		letfour = letter.nextInt (26)+97;
	
		String msg = (char)letone + "" + (char)lettwo + "" + (char)letthree + "" + (char)letfour;
		// Asking for input
		System.out.println("Type in the following: " + msg);
	
		String ans = input.nextLine();
		String test = ans.trim();
		// Checking if input is correct
		if (test.equals(msg)) { System.out.print("Good job!");
		}
		else if (test.equalsIgnoreCase(msg)){
			System.out.print("Close. Beware case.");
		}
		else { System.out.print("Better luck next time :(");
		}
	
		input.close();
	}
}
