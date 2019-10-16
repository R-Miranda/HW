import java.util.Scanner;

public class MaxOfThree {
	public static void main(String[] args) {	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		double max; 
		if ((n1 > n2) && (n1 > n3)) { max = n1;
		}
		else if ((n2 > n3) && (n2 > n1)) { max = n2;
		}
		else { max = n3;
		}
		System.out.println("Max: " + max);
	input.close();
	}
}