package trajectoires;
import geometry.*;
public class TrajectoryGenerator {
    public Polyline generateRandom(int N, double borneX_inf,double borneX_sup,double borneY_inf,double borneY_sup){
        return Polyline.generateRandom(N,borneX_inf,borneX_sup,borneY_inf,borneY_sup);
    }

    
}
