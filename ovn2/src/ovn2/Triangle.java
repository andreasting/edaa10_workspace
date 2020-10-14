package ovn2;

import se.lth.cs.window.SimpleWindow;
import se.lth.cs.p.ovn.turtle.Turtle;

public class Triangle {
	
	static SimpleWindow window = new SimpleWindow(500,500,"Triangles");
	static Turtle turtle = new Turtle(window,250,250);
	
	// En metod för att undvika upprepning av samma kod.
	public static void drawTriangle(){
		
		
		turtle.right(90);
		turtle.penDown();
		
		//Upprepar processen med for loop för vi vet det bestämda talet (antalet sidor som = 3)
		for(int i = 1; i <=3 ; i++) {
			turtle.forward(100);
			turtle.left(120);
		}
		// förbereder för nästa triangel, man kan också rotera den för att ha trianglarna sida vid sida, men jag tycker om det här mönstret så
		// jag lät det vara
		turtle.penUp();
		turtle.forward(105);

		
		
	}
	
	
public static void main(String[]args) {
	
	drawTriangle();
	drawTriangle();
	
	}

}
