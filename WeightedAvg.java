import java.util.Scanner;
public class WeightedAvg{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three number and weight pairs:");
	Double n1, w1, n2, w2, n3, w3;
	n1 = input.nextDouble();
	w1 = input.nextDouble();
	n2 = input.nextDouble();
	w2 = input.nextDouble();
	n3 = input.nextDouble();
	w3 = input.nextDouble();
	Double avg = ((n1 * w1) + (n2 * w2) + (n3 * w3)) / (w1 + w2 + w3);
	System.out.println("The weighted average is " + avg);
	}
}
	