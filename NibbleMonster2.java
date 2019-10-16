/*
	Ricardo Miranda
	306699034
	CS 2011-04
	Program which recognizes nibbles until sad
*/

import java.util.Scanner;
public class NibbleMonster2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// This is prompt and inputs
		System.out.println(":3 monster hungry!!!");
		
		String msg;
		
		do {
		
			System.out.print("feed nibble :O ");
		
			int nibble = input.next().charAt(0);
			// Checking if inputs are between ASCII values for nibbles
			
			if ((nibble >= 48) && (nibble <= 57)) { msg = ("nom nom nom");
			}
			else if ((nibble >= 97) && (nibble <= 102)) { msg = ("yum!");
			}
			else if ((nibble >= 65) && (nibble <= 70)) { msg = ("YUMMY!");
			}
			else { msg = ("Blegh"); 
			}
			
			System.out.println(msg);
		}
		while ( (msg != "Blegh")); 

		
		
	input.close();
	}
}