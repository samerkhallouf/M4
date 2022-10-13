package maps;
import java.util.ArrayList;
import java.util.HashMap;

import geometry.Position;
public class MapListMain {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Position>> mapPos = new HashMap<String, ArrayList<Position>>();
        ArrayList<Position> line = new ArrayList<Position>();
        line.add(new Position(0, 0));
        line.add(new Position(4, 0));
        line.add(new Position(4, 3));
        line.add(new Position(0, 3));

        ArrayList<Position> line2 = new ArrayList<Position>();
        line2.add(new Position(0, 0));
        line2.add(new Position(4, 0));
        line2.add(new Position(4, 3));
        line2.add(new Position(0, 3));

        mapPos.put("0",line);
        mapPos.put("1", line2);
        System.out.println(mapPos);

    }
}
