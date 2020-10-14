import se.lth.cs.window.SimpleWindow;

public class Turtle {
	private double posX, posY, beta;
	private boolean readyDraw;
	private SimpleWindow w;
 
  /** skapar en sköldpadda som ritar i ritfönstret w. 
      Från början befinner sig sköldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt uppåt i fönstret, dvs i negativ y-riktning  
  */
	
  Turtle(SimpleWindow w, int xHome, int yHome) {
	  posX = xHome;
	  posY = yHome;
	  this.beta = 90;
	  readyDraw = false;
	  this.w = w;



  }

  /** sänker pennan */
  void penDown() {
	  readyDraw = true;
	  
	  
  }

  /** lyfter pennan */
  void penUp() {
	  readyDraw = false;
	  
  }

  /** går rakt framåt n pixlar i huvudets riktning */
  void forward(int n) {
	  w.moveTo((int)posX, (int)posY);

	  posX += n*Math.cos(Math.toRadians(this.beta));
	  posY -= n*Math.sin(Math.toRadians(this.beta));
	  

	  if(readyDraw) {
		  
		  this.w.lineTo((int)Math.round(posX), (int)Math.round(posY));
		  
		  
	  }
	  
  }
 

  /** vrider huvudet beta grader åt vänster */
  void left(int beta) {
	  this.beta += beta;
  }

  /** vrider hvudet beta grader åt höger */
  void right(int beta) {
	  this.beta -= beta;

  }

  /** går till punkten newX,newY utan att rita. 
      Pennans läge och huvudets riktning påverkas inte */
  void jumpTo(int newX, int newY) {
	
	  this.w.moveTo((int)newX, (int)newY);
	  posX = newX;
	  posY = newY;
  }

  /** återställer huvudets riktning till den ursprungliga */
  void turnNorth() {
	  this.beta = 90;
	  
  }

  
}
