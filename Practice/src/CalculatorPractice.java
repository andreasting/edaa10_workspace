import java.util.Scanner;

public class CalculatorPractice {

	public static void main(String[] args) {
		double nbr1,nbr2,sum,produkt,kvot,diff;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv två tal: ");
		nbr1 = scan.nextDouble();
		nbr2 = scan.nextDouble();
		
		sum = nbr1+nbr2;
		produkt = nbr1*nbr2;
		kvot = nbr1/nbr2;
		diff = nbr1-nbr2;
		
		System.out.println("Summan av talen är: " + sum);
		System.out.println("Differensen mellan talen är: " + diff);
		System.out.println("Produkten av talen är: " + produkt);
		System.out.println("Kvoten av de två talen är: " + kvot);
	}
}
