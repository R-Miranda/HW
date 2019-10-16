/*
	Ricardo Miranda
	306699034
	CS 2011-04
	Program which recognizes nibbles until monster is sad
*/

import java.util.Scanner;
public class NibbleMonster1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(":3 monster hungry!!!");
		
		System.out.print("feed nibble :O ");
		
		String msg;
		
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
		
		
		while ( msg != "Blegh") {
		System.out.println(":3 monster hungry!!!");
		
		System.out.print("feed nibble :O ");
		
		int test = input.next().charAt(0);
		
		if ((test >= 48) && (test <= 57)) { msg = ("nom nom nom");
		}
		else if ((test >= 97) && (test <= 102)) { msg = ("yum!");
		}
		else if ((test>= 65) && (test <= 70)) { msg = ("YUMMY!");
		}
		else { msg = ("Blegh"); 
		}
		System.out.println(msg);
		}
		
		input.close();
	}
}
		
		
		
		