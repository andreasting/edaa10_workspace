import se.lth.cs.window.SimpleWindow;

public class Turtle {
	private double posX, posY, beta;
	private boolean readyDraw;
	private SimpleWindow w;
 
  /** skapar en sk�ldpadda som ritar i ritf�nstret w. 
      Fr�n b�rjan befinner sig sk�ldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt upp�t i f�nstret, dvs i negativ y-riktning  
  */
	
  Turtle(SimpleWindow w, int xHome, int yHome) {
	  posX = xHome;
	  posY = yHome;
	  this.beta = 90;
	  readyDraw = false;
	  this.w = w;



  }

  /** s�nker pennan */
  void penDown() {
	  readyDraw = true;
	  
	  
  }

  /** lyfter pennan */
  void penUp() {
	  readyDraw = false;
	  
  }

  /** g�r rakt fram�t n pixlar i huvudets riktning */
  void forward(int n) {
	  w.moveTo((int)posX, (int)posY);

	  posX += n*Math.cos(Math.toRadians(this.beta));
	  posY -= n*Math.sin(Math.toRadians(this.beta));
	  

	  if(readyDraw) {
		  
		  this.w.lineTo((int)Math.round(posX), (int)Math.round(posY));
		  
		  
	  }
	  
  }
 

  /** vrider huvudet beta grader �t v�nster */
  void left(int beta) {
	  this.beta += beta;
  }

  /** vrider hvudet beta grader �t h�ger */
  void right(int beta) {
	  this.beta -= beta;

  }

  /** g�r till punkten newX,newY utan att rita. 
      Pennans l�ge och huvudets riktning p�verkas inte */
  void jumpTo(int newX, int newY) {
	
	  this.w.moveTo((int)newX, (int)newY);
	  posX = newX;
	  posY = newY;
  }

  /** �terst�ller huvudets riktning till den ursprungliga */
  void turnNorth() {
	  this.beta = 90;
	  
  }
  int getX(){
      return (int)posX;
  }
  int getY(){
      return (int)posY;
  }

  
}
