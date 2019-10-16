/*
	Ricardo Miranda
	306699034
	CS 2011-04
	Program eats nibbles until full
*/

import java.util.Scanner;
import java.util.Random;

public class NibbleMonster3 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int count = random.nextInt(11);
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(":3 monster hungry!!!");
			System.out.print("feed nibble :O ");
		
			int nibble = input.next().charAt(0);
			
			String msg;
			
			if ((nibble >= 48) && (nibble <= 57)) { msg = ("nom nom nom"); count = (count + 1);
			}
			else if ((nibble >= 97) && (nibble <= 102)) { msg = ("yum!"); count = (count + 2);
			}
			else if ((nibble >= 65) && (nibble <= 70)) { msg = ("YUMMY!"); count = (count + 3);
			}
			else { msg = ("RAWWWWR THAT'S NOT A NIBBLE!!!"); count = (count - 3);
			}
			System.out.println(msg);
		}while  (count < 15);
		
		System.out.println("THANK YOU. I AM FULL NOW!");
		
		input.close();
	}
}
			
	
		