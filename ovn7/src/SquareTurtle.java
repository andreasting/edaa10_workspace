import se.lth.cs.window.SimpleWindow;

public class SquareTurtle  {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600,600,"Turtle");
		Turtle t = new Turtle(w, 300,300);
		t.penDown();
		for(int i = 1; i<=4; i++) {
			t.forward(50);
			w.delay(500);
			t.forward(50);
			w.delay(500);
			t.right(90);

		}
		
	}

}
