import java.util.Scanner;

public class CalculatorPractice {

	public static void main(String[] args) {
		double nbr1,nbr2,sum,produkt,kvot,diff;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv tv� tal: ");
		nbr1 = scan.nextDouble();
		nbr2 = scan.nextDouble();
		
		sum = nbr1+nbr2;
		produkt = nbr1*nbr2;
		kvot = nbr1/nbr2;
		diff = nbr1-nbr2;
		
		System.out.println("Summan av talen �r: " + sum);
		System.out.println("Differensen mellan talen �r: " + diff);
		System.out.println("Produkten av talen �r: " + produkt);
		System.out.println("Kvoten av de tv� talen �r: " + kvot);
	}
}
