import java.util.Random;

public class CoinToss {
	public static void main(String[] args) {
	
	Random random = new Random();
	int face = random.nextInt(2);
	
	String msg = ("You got ");
	if (face == 0) { msg = (msg + "tails.");
	}
	else {msg = (msg + "heads.");
	}
	System.out.println(msg);
	}
}
