import java.util.Scanner;
public class IntToByte{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	
	int i1 = input.nextInt();
	System.out.println("int value: " + i1);
	System.out.println("byte value: " + (byte) i1);
	
	input.close();
	}
}
