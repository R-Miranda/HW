/* Ricardo Miranda 306699034
CS2011-04
Checks a phone number to see if it is valid */
import java.util.Scanner;

public class PhoneValidator {
	public static void main(String[] args) {
		// Asking for number
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter phone number as (###) ###-#### : ");
		String num = in.nextLine();
		
		// Setting up an invalid response
		
		String inv = ("Invalid number please follow guidelines.");
		
		// CHecking each individual character of the input to see if it matches a phone number pattern
		if (num.length() == 14) {
			if (num.charAt(0) == '(') {
				if (Character.isDigit(num.charAt(1))) {
					if (Character.isDigit(num.charAt(2))) {
						if (Character.isDigit(num.charAt(3))) {
							if (num.charAt(4) == ')') {
								if (num.charAt(5) == ' ') {
									if (Character.isDigit(num.charAt(6))) {
										if (Character.isDigit(num.charAt(7))) {
											if (Character.isDigit(num.charAt(8))) {
												if (num.charAt(9) == '-') {
													if (Character.isDigit(num.charAt(10))) {
														if (Character.isDigit(num.charAt(11))) {
															if (Character.isDigit(num.charAt(12))) {
																if (Character.isDigit(num.charAt(13))) {
																	System.out.println("Phone number is valid");
																}else { System.out.println(inv); }
															}else { System.out.println(inv); }
														}else { System.out.println(inv); }
													}else { System.out.println(inv); }
												}else { System.out.println(inv); }
											}else { System.out.println(inv); }	
										}else { System.out.println(inv); }
									}else { System.out.println(inv); }						
								}else { System.out.println(inv); }
							}else { System.out.println(inv); }						
						}else { System.out.println(inv); }
					}else { System.out.println(inv); }
				}else { System.out.println(inv); }										
			}else { System.out.println(inv); }
		}else { System.out.println(inv); }
	
	in.close();
		
	}
}

