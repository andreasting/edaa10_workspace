package ovn2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double nbr1,nbr2,sum,produkt,kvot,diff;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv tv� tal: ");
		nbr1 = scan.nextDouble();
		nbr2 = scan.nextDouble();
		
		//Det g�r att anv�nda bara en variabel och uppdatera den mellan olika "print line" men jag har skrivit den s� h�r i fall "programmet" beh�ver byggas vidare och
		// variablerna anv�nds f�r fler ber�kningar osv. Det ser ocks� b�ttre ut att seperera p� det h�r s�ttet tycker jag
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
