package geometry;

import java.util.*;

public class PositionMain {
    public static void main(String[] args) {
        Position p1 = new Position(0, 1);
        Position p2 = new Position(0 , 2);
        Position p3 = new Position(0, 3);
        // ArrayList<Position>  listofpos = new ArrayList<Position>();
        // listofpos.add(p1);
        // listofpos.add(p2);
        // listofpos.add(p3);
        // for (Position position : listofpos) {
        //     position.display();
            
        // }
        // System.out.println(listofpos);
        Polyline line = new Polyline();
        System.out.println(line.toString());
        // line.addEdge(new Position(0, 0));
        // line.addEdge(new Position(4, 0));
        // line.addEdge(new Position(4, 3));
        // line.addEdge(new Position(0, 3));
        line.addEdge(new Position(1, 0));
        line.addEdge(new Position(3, 0));
        System.out.println(line.toString());

        line.clearEdges();
        System.out.println(line.toString());
        

    }



}
