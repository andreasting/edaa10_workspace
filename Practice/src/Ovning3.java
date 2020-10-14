import java.util.Scanner;

public class Ovning3 {

	public static void main(String[] args) {

		 

	

		
		Scanner scan = new Scanner(System.in);
		
		
		double squareOfSum = 0;
		double average;
		double sum = 0;
		double userInput;
		double standardDeviation;

		System.out.print("Hur många termer skall du addera? ");
		int numbersToEnter = scan.nextInt();

		for(int i = 1; i<=numbersToEnter;i++) {
		System.out.printf("Tal %d of %d:",i,numbersToEnter);
		userInput = scan.nextDouble();
		sum = sum+userInput;
		squareOfSum = squareOfSum+userInput*userInput;
		}

		average = sum/numbersToEnter;
		System.out.printf("Medelvärdet blir %.3f \n",average);

		if(numbersToEnter>5) {
		standardDeviation = Math.sqrt((squareOfSum-numbersToEnter*average*average)/(numbersToEnter-1));
		System.out.printf("Standardavikelsen blir %.5f",standardDeviation);
		}
		 else {
		System.out.println("För få termer för att beräkna standardavikelse!");
		}

	
	}
}
