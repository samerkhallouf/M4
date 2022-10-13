package trajectoires;
import geometry.*;
public class TrajectoryGeneratorMain {
    public static void main(String[] args) {
        TrajectoryGenerator  t = new TrajectoryGenerator();
        Polyline p = new Polyline();
        p = t.generateRandom(5,0,100,0,75);
        System.out.println(p.toString());
    }
}
