package maps;
import java.util.HashMap;

import geometry.Position;
public class MapMain {
    public static void main(String[] args) {
        Position p00 = new Position(0, 0);
        Position p01 = new Position(0, 1);
        Position p10 = new Position(1, 0);

        HashMap<String, Position> posMap = new HashMap();

        posMap.put("0",p00);
        posMap.put("1",p01);
        posMap.put("2",p10);
        System.out.println(posMap);
    


    }
}
