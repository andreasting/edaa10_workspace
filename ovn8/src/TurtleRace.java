import se.lth.cs.window.SimpleWindow;

public class TurtleRace {

    public static void main(String[] args){
        int yStart = 500;
        int yFinish = 250;
        SimpleWindow w = new SimpleWindow(1000,1000, "Turtles racing");

        Turtle t1 = new Turtle(w,375,yStart+20);
        Turtle t2 = new Turtle(w,500,yStart+20);

        RaceTrack track = new RaceTrack(w, yStart, yFinish);
        RacingEvent race = new RacingEvent(w, track, t1,t2);

        track.draw(w);


        race.race(yFinish);

    }
}
