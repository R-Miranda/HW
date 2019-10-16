import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter dividend: ");
		int n1 = input.nextInt();
		System.out.print("Enter divisor: ");
		int n2 = input.nextInt();
	
		String msg;
		if (n2 == 0) { msg = ("Are you trying to break me?!");
		}
		else if (n2 == 1) { msg = ("Everything is divisible by 1.");
		}
		else if (n1 == 0) { msg = ("0 is divisible by everything.");
		}
		else if ((n1 % n2) != 0) { msg = (n1 + " is NOT divisible by " + n2 + ".");
		}
		else { msg = (n1 + " is divisible by " + n2 + ".");
		}
		
		System.out.println(msg);
		
	input.close();
	}
}
	