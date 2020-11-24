import se.lth.cs.window.SimpleWindow;

import java.awt.*;

public class RaceTrack {
    private int yStart;
    private int yFinish;
    private int turn = 1;
    private Turtle line;
    private SimpleWindow w;

    public RaceTrack(SimpleWindow w,int yStart, int yFinish){
        this.yStart = yStart;
        this.yFinish = yFinish;
        this.w = w;
        line = new Turtle(this.w, 0, 0);


    }

    public void draw(SimpleWindow w){
        drawStart(w);
        drawFinish(w);
        w.setLineColor(Color.black);
    }

    public void drawStart(SimpleWindow w){
      w.setLineWidth(5);
      for(int j = 1; j<=5; j++) {
          for (int i = 0; i <= 1000; i += 10) {

              if (turn % 2 == 1) {
                  w.moveTo(i, yStart+j*5);
                  w.lineTo(i + 5*j, yStart+j*5);
              } else {
                  w.moveTo(i, yStart);
              }

          }
      }
    }
    public void drawFinish (SimpleWindow w){
        w.setLineColor(Color.green);
        w.moveTo(0,this.yFinish);
        w.lineTo(1000,this.yFinish);

    }



}
