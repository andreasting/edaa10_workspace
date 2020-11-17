import java.awt.*;
import java.util.Random;

import se.lth.cs.window.SimpleWindow;

public class RacingEvent {
    private int t1Y;
    private int t2Y;

    private int t1X;
    private int t2X;

    private int turn;
    private int toMove;

    private Random rand;
    private RaceTrack track;
    private Turtle t1;
    private Turtle t2;
    private SimpleWindow w;

    public RacingEvent(SimpleWindow w, RaceTrack track, Turtle t1, Turtle t2) {
        turn = 1;
        toMove = 0;
        rand = new Random();
        this.track = track;
        this.t1 = t1;
        this.t2 = t2;
        this.w = w;
    }

    void race(int yFinish) {

        this.w.waitForMouseClick();
        this.t1.penDown();
        this.t2.penDown();
        this.t1Y = this.t1.getY();
        this.t2Y = this.t2.getY();

        while (t1Y > yFinish || t2Y > yFinish) {
            toMove = rand.nextInt(25)+1;



            if (turn % 2 == 1 && this.t1Y >yFinish) {
                this.t1.forward(toMove);

            } else if (turn %2 == 0 && this.t2Y >yFinish) {
                this.t2.forward(toMove);

            }
            this.t1Y = this.t1.getY();
            this.t2Y = this.t2.getY();

            this.w.delay(50);
            turn++;
        }

    }
}
