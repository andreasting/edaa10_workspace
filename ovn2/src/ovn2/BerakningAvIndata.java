package ovn2;
import java.util.Scanner;

public class BerakningAvIndata {
	
	public static void main(String[] args) {
	final int ITERATIONS = 10;
	int bigInt,nextBigInt = 0, userInt;
	
	// För att göra det lättare att ändra programet gjorde jag en fast int
	
	Scanner scan = new Scanner(System.in);
	System.out.printf("Input a number (1 of %d): ", ITERATIONS);
	
	// första numret är alltid störst, så för att förenkla loopen scannar vi in talet innan loopen
	bigInt = scan.nextInt();
	
	for(int i =1 ;i<ITERATIONS;i++) {
		System.out.printf("Input a number:(%d of %d): ",i+1,ITERATIONS);
		userInt = scan.nextInt();
		if(userInt>bigInt) {
			nextBigInt = bigInt;
			bigInt = userInt;
		}
		else if(userInt>nextBigInt&&userInt<bigInt) {
			nextBigInt = userInt;
		}
	}
	
	System.out.printf("The biggest number was %d and the second biggest %d \n", bigInt,nextBigInt);
	System.out.printf("The difference between the two numbers is %d", bigInt-nextBigInt);


}

}
