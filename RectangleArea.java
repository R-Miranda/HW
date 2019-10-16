import java.util.Scanner;

public class RectangleArea {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter rectangle width and height:");
		double width = input.nextDouble();
        double height = input.nextDouble();

		double area = (width * height);
		String msg;
		if (area < 0) { msg = ("Invalid input.");
		}
		else { msg = ("The area is " + area);
		}
		System.out.println(msg);
	input.close();
	}
}