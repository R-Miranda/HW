import java.util.Scanner;
public class BitsToDecimal{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter five bits: ");
	
	int b1, b2, b3, b4, b5;
	b1 = input.nextInt();
	b2 = input.nextInt();
	b3 = input.nextInt();
	b4 = input.nextInt();
	b5 = input.nextInt();
	
	int b6 = ((b1*10000) + (b2*1000) + (b3*100) + (b4*10) + b5);
	
	double d1 = Math.pow(b1*2,4) + Math.pow(b2*2,3) + Math.pow(b3*2,2) + Math.pow(b4*2,2)
	+ b5;
	
	System.out.println(b6 + " in binary is " + (int) d1 + " in decimal." );
	
	input.close();
	}
}