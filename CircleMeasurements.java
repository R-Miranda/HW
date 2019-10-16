	import java.util.Scanner;
	
	public class CircleMeasurements {
		public static void main(String args[]) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter radius please: ");
			
			
			Double radius; 
			radius = input.nextDouble();
			
			final double PI = 3.14159;
			
			System.out.println("Diameter is " + radius * 2);
			System.out.println("Perimeter is " + 2 * 3.14159 * radius);
			System.out.println("Area is " + 3.14159 * radius * radius);
		}
}
			