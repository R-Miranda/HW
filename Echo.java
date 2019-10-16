/* Ricardo Miranda 306699034
CS2011-04
"Echoes" the users input */



import java.util.Scanner;
public class Echo {
	public static void main(String[] args) {
		// Recieving the input
		System.out.print("Please enter one or more words: ");
		
		Scanner input = new Scanner(System.in);
		
		String re = input.nextLine();
		// Checking if the input is valid
		if (re.length() < 3) {
			System.out.println("Entry must be longer than three characters.");
		}
		else if (Character.isDigit(re.charAt(re.length()-3))) {
			System.out.println("Last three characters must be letters.");
		}
		else if (Character.isDigit(re.charAt(re.length()-2))) {
			System.out.println("Last three characters must be letters.");
		}
		else if (Character.isDigit(re.charAt(re.length()-1))) {
			System.out.println("Last three characters must be letters.");
		}
		// If all tests pass then the input is echoed
		else {
			System.out.println(re.toUpperCase());
			System.out.println((re.substring(re.length()-3)).toUpperCase());
			System.out.println(re.substring(re.length()-3));
			System.out.println(re.substring(re.length()-2));
			System.out.println(re.substring(re.length()-1));
		}
		
		input.close();
			
	}
}
