package lists;

import java.util.*;

public class FindMinDoubleMain {
    public static void main(String[] args) {
        ArrayList<Double> l = new ArrayList<Double>();
        l.add(3.0);
        l.add(6.0);
        l.add(14.0);
        l.add(16.0);
        l.add(1.0);
        double min = l.get(0);
        for (double d : l) {
            if(d < min){
                min = d;
            }
        }
        System.out.println(min);

    }
}
