package ovn2;
import java.util.Random;

public class Die{
	private Random rand = new Random();
	private int dots;

	public Die() {
		dots = rand.nextInt(6)+1;
	}
	public int getResult() {
		
		return dots;
	}

	public void roll(){
		dots = rand.nextInt(6)+1;
		
	}
	public static void main(String[] args) {
		
	}
}
