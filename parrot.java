import java.util.Scanner;
public class parrot{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Type something:");
	String repeat = input.nextLine();
	System.out.println(repeat + "!");
	}
}