package ovn2;
import java.util.Scanner;
public class LektionsOvning {

	public static void main(String[] args) {
		//Initiering av variabler
		Scanner scan = new Scanner(System.in);
		double sum  = 1/(10*Math.sqrt(10));
		double epsilon = 0;
		int k = 0;

		//Ber f�r anv�nder
		System.out.print("Ange ett nummer (epsilon): ");
		epsilon = scan.nextDouble();

		while(sum<epsilon) {
			k++;
			if(k%2 == 1) {
				sum = sum-1/((10+k)*Math.sqrt(10+k));
			}
			else {
				sum = sum+1/((10+k)*Math.sqrt(10+k));

			}
		}
		System.out.printf("Det tog %d termer f�r att f� ett tal st�rre �n %f \n", k, epsilon);
		System.out.printf("Det slutgiltiga talet blev %.4f",sum);

	}

}
