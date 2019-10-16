import java.util.Scanner;
public class DegreesToRadians{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Degrees:");
		Double degree = input.nextDouble();
		Double radian = degree * (Math.PI / 180);
		System.out.println("Radians: " + radian);
		}
}