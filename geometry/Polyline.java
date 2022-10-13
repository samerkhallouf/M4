package geometry;

import java.util.ArrayList;

public class Polyline {
    private ArrayList<Position> edges = new ArrayList<Position>();
    
    public Polyline(){}
    
    static public Polyline generateRandom(int N, double borneX_inf,double borneX_sup,double borneY_inf,double borneY_sup){
        double rangeX = borneX_sup - borneX_inf + 1;
        double rangeY = borneY_sup - borneY_inf +1;
        Polyline p = new Polyline();
        for (int i = 0; i < N; i++) {
            p.addEdge(new Position(Math.random()*rangeX, Math.random()*rangeY));
        }
        return p;
    }
    static public Polyline generateBrownian(int N){
        Polyline p = new Polyline();
        for (int i = 0; i < N; i++) {
            p.addEdge(new Position( Math.random(), Math.random()));
        }
        return p;
    } 

    public void addEdge(Position p){
        edges.add(p);
    }
    
    public void clearEdges(){
        edges.clear();
    }

    public int size(){
        return edges.size();
    }

    public double length(){
        if(edges.size() == 0 || edges.size() == 1){
            return 0;
        }
        double d = 0;
        //d = edges.get(0).distanceToOrigin();
        for (int i = 1; i < edges.size(); i++) {
            d = d + Math.sqrt(Math.pow(edges.get(i).getY()-edges.get(i-1).getY(), 2)+Math.pow(edges.get(i).getX() - edges.get(i-1).getX(), 2));
        }
        return d;
    }
    public String toString(){
        String s = "Edges : [";
        if(edges.size() == 0){
            return s+"] size = 0 length = 0";
        }
        for (Position pos : edges) {
            if(edges.indexOf(pos) == edges.size()-1 ){
                s=s + pos.toString() + "] ,";
            }else{
            s = s+ pos.toString() + ", ";
        }
            
        }
        return s + "size = "+ this.size()+" length = "+ this.length();
    }



}
