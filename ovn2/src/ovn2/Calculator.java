package ovn2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double nbr1,nbr2,sum,produkt,kvot,diff;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Skriv två tal: ");
		nbr1 = scan.nextDouble();
		nbr2 = scan.nextDouble();
		
		//Det går att använda bara en variabel och uppdatera den mellan olika "print line" men jag har skrivit den så här i fall "programmet" behöver byggas vidare och
		// variablerna används för fler beräkningar osv. Det ser också bättre ut att seperera på det här sättet tycker jag
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
