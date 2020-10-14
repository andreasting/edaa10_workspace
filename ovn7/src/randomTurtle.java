import se.lth.cs.window.SimpleWindow;
import java.util.Random;


public class randomTurtle {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Square");
		Turtle t1 = new Turtle(w, 250, 250);
		Turtle t2 = new Turtle(w, 350, 350);
		Random rand = new Random();

		
		t1.penDown();
		t2.penDown();
		
		// Fr�n avst�ndsformeln, fr�n startpos
		double distance = 141.4;
		int i = 1;
		while(distance>=50.0) {
			
			int randDeg = rand.nextInt(359)-179;
			int randDist = rand.nextInt(10)+1;
			
			if(i%2==0) {
				t1.forward(randDist);
				t1.right(randDeg);
			}
			
			else if(i%2==1) {
				t2.forward(randDist);
				t2.right(randDeg);
			}
			
			int t1Y = t1.getY();
			int t2Y = t2.getY();
			int t1X = t1.getX();
			int t2X = t2.getX();
			
			distance = Math.sqrt((t2X-t1X)*(t2X-t1X)+(t2Y-t1Y)*(t2Y-t1Y));
			i++;
			w.delay(10);

		}


	}

}
