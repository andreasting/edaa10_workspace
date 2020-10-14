
public class Point {
	private int dx;
	private int dy;
	private int x ;
	private int y;
	private double distance;
	private String position;
	
	public Point(int x, int y){
		dx = 0;
		dy = 0;
		x = 0;
		y = 0;
		distance = 1;
		position = "";
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void move (int dx, int dy) {
		x += dx;
		y += dy;
	}
	public String toString() {
		String position = String.valueOf(x +":" + String.valueOf(y));
		
		return position;
		
	}
	public double distanceTo(Point p) {
		return distance;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

		
	}


