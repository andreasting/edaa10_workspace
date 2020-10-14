import java.util.Scanner;
public class GuessNumber  {

	public static void main(String[] args) {
		int min,max;
		int guess;
		int guesses = 1;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in det minsta talet: ");
		min = scan.nextInt();
		
		System.out.print("Skriv in det största talet: ");
		max = scan.nextInt();
		
		
		NumberGenerator numgen = new NumberGenerator(min,max);

		
		System.out.print("Gissa ett tal: ");
		guess = scan.nextInt();


		numgen.drawNbr();
		while(!numgen.isEqual(guess)){
			
			if(numgen.isBiggerThan(guess)) {
				guesses++;
				System.out.printf("Talet är större än det gissade talet %d , skriv ett nytt tal \n",guess);
				System.out.printf("Gissning %d :", guesses);
				guess = scan.nextInt();

			}
			else { 
				guesses++;
				System.out.printf("Talet är mindre än det gissade talet %d, skriv in ett nytt tal \n",guess);
				System.out.printf("Gissning %d :", guesses);
				guess = scan.nextInt();
			

			}
		}
		numgen.printNbr();
		
		System.out.println("Det tog " + guesses + " gissningar för att nå det rätta talet");

	}

}
