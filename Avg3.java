import java.util.Scanner;

public class Avg3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Three numbers: ");
		Double n1, n2, n3;
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
		Double avg = (n1 + n2 + n3) / 3;
		System.out.print("Average is " + avg);
		input.close(); 
	}
}