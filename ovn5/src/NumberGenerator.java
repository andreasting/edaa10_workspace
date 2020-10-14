import java.util.Random;

public class NumberGenerator {
	private static Random rand = new Random();  // slumptalsgenerator
	private int secretNbr;						// det hemliga talet
	private int min;							// minsta v�rde det hemliga talet kan ha
	private int max;							// st�rsta v�rde det hamliga talet kan ha

	/** Skapar ett objekt som kan generera med ett slumpm�ssigt valt hemligt 
		    heltal i intervallet [min, max]. */
	// om max �r 100 och min 10 blir det 100-10 = 90 , om talet blir noll (minst det blir) s� l�ggs tian p�, s� den blir v�r l�gsta tal. Om max-mon blir h�sta talet l�ggs min tillbaks

	public NumberGenerator(int min, int max) {
		this.secretNbr = 10;
		this.min = min;
		this.max = max;
	}

	/** Drar ett nytt hemligt tal. */
	public void drawNbr() {
		this.secretNbr = rand.nextInt((max-min)+1)+min;
		
		

	}

	/** Tar reda p� minsta m�jliga v�rde det hemliga talet kan ha. */
	public int getMin() {
		return min;
	}

	/** Tar reda p� st�rsta m�jliga v�rde det hemliga talet kan ha. */
	public int getMax() {
		return max;
	}

	/** Tar reda p� om det hemliga talet �r lika med guess. */
	public boolean isEqual(int guess) {
		if(guess==this.secretNbr) {
		return true;
		}
		else {
		return false;
		}
	}

	/** Tar reda p� om det hemliga talet �r st�rre �n guess. */
	public boolean isBiggerThan(int guess) {
		if(this.secretNbr>guess) {
			return true;
			}
		else {
			return false;
		}
	}
	// Fr�ga om det �r b�ttre att skriva return this.secretNbr<guess;
	

	public void printNbr() {
		System.out.println("Talet var " + this.secretNbr);
	}
}